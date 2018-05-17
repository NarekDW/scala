package control_struct;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class NewControlJava {

    public static void main(String[] args) throws FileNotFoundException {
        final File file = new File("/home/narek/IdeaProjects/scala-professional-programming/test.txt");
        final Consumer<PrintWriter> writerConsumer = writer -> writer.write("SOME TEXT JAVA");
        final NewControlJava newControlJava = new NewControlJava();
        newControlJava.writeWith(file, writerConsumer);

        // Carrying
        final Function<Consumer<PrintWriter>, Void> fileApply = newControlJava.currying.apply(file);
        fileApply.apply(writerConsumer);
    }

    public void writeWith(File file, Consumer<PrintWriter> op) throws FileNotFoundException {
        final PrintWriter writer = new PrintWriter(file);
        try {
            op.accept(writer);
        } finally {
            writer.close();
        }
    }

    Function<File, Function<Consumer<PrintWriter>, Void>> currying =
            file -> op -> {
                PrintWriter writer = null;
                try {
                    writer = new PrintWriter(file);
                    op.accept(writer);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } finally {
                    writer.close();
                }
                return null;
            };

    public void m(Predicate<String> predicate){}
}
