package _13_10_18;

import java.util.function.Consumer;

public class LambdaApp {

    public static void main(String[] args) {

        Consumer<Integer> printer = x-> System.out.printf("%d долларов \n", x);
        printer.accept(600); // 600 долларов
    }
}
