package currying;

import java.util.function.Function;

public class CurryingJava {

    public static void main(String[] args) {
        Function<Integer, Function<Integer, Integer>> curriedSum = a -> (b -> a + b);

        final Function<Integer, Integer> onePlus = curriedSum.apply(1);
        System.out.println("1 + 2 = " + onePlus.apply(2));
    }

}
