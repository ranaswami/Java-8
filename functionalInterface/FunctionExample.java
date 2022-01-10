package functionalInterface;

import java.util.Locale;
import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function = (name) -> name.toUpperCase();

    static Function<String, String> addSomeString = (name) -> name.toUpperCase().concat(" default");


    public static void main(String[] args) {

        System.out.println("Result is: "+function.apply("rana swami"));

        System.out.println("Result of andThen is: "+function.andThen(addSomeString).apply("rana swami"));

        System.out.println("Result of andThen is: "+function.compose(addSomeString).apply("rana swami"));

    }

}
