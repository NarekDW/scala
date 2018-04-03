import static java.util.stream.Collectors.toList;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FileMatcherJava {

    public static void main(String[] args) {
        FileMatcherJava fm = new FileMatcherJava();
        fm.filesEnding(".scala").forEach(System.out::println);
        fm.filesContaining("scala").forEach(System.out::println);
    }

    public List<File> filesEnding(String query) {
        return filesMatching(s -> s.endsWith(query));
    }

    public List<File> filesContaining(String query){
        return filesMatching(s -> s.contains(query));
    }

    public List<File> filesRegex(String query){
        return filesMatching(s -> s.matches(query));
    }

    private List<File> filesMatching(Function<String, Boolean> matcher) {
        return filesHere().stream()
                .filter(t -> matcher.apply(t.getName()))
                .collect(toList());
    }

    private List<File> filesHere() {
        final File[] files = new File("/home/narek/IdeaProjects/scala-professional-programming/control_abstraction/" +
                        "src/scala").listFiles();
        return Arrays.asList(files);
    }
}
