import java.util.Arrays;
import java.util.stream.Stream;

public class Closure {

    Integer globalMore = 20;

    public static void main(String[] args) {
        new Closure().m();
    }

    public void m() {
        // Variable used in lambda expression should
        // be final or effectively final
        final Integer more = 10;
        Stream.of(1, 2, 3, 4).parallel()
                .map(x -> x + more)
                .forEach(System.out::println);

        Stream.of(1, 2, 3, 4).parallel()
                .map(x -> globalMore = 12)
                .forEach(System.out::println);

//        more = 2;

    }

}
