package simplify_client_code;

import java.util.stream.Stream;

public class ClientJava {

    public static void main(String[] args) {
        final boolean a = Stream.of(1, 2, 3, 4).anyMatch(integer -> integer > 0);
        System.out.println(a);

        final boolean b = Stream.of(1, 2, 3, 4).anyMatch(integer -> integer % 2 == 1);
        System.out.println(b);
    }

}
