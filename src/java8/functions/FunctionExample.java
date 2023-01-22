package java8.functions;

import java.util.function.Function;

public class FunctionExample {

    final static Function<Integer, Double> sqrtFunction = Math::sqrt;
    final static Function<String, String> upperCaseFunction = String::toUpperCase;
    final static Function<String, Integer> countFunction = String::length;
    public static void main(String[] args) {
        final int value = 6;
        System.out.println("Value: "+value+" Square Root: "+sqrtFunction.apply(value));

        // To UpperCase and Print Length
        final String stringValue = "test";
        System.out.println("Print Result : "+upperCaseFunction.andThen(countFunction).apply(stringValue));
    }
}
