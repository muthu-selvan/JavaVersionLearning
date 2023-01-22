package java8.functions;

import modelClasses.Instructor;

import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFuctionExample {
    public static void main(String[] args) {
        Predicate<Instructor> onlinePredicate = instructor -> instructor.isTeachingOnline();;
        BiFunction<List<Instructor>,Predicate<Instructor>, Map<String, Integer>> instructorFunction = ((instructors, instructorPredicate) -> {

        })
    }
}
