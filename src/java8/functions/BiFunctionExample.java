package java8.functions;

import modelClasses.Instructor;
import modelClasses.Instructors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFuctionExample {
    public static void main(String[] args) {
        Predicate<Instructor> onlinePredicate = instructor -> instructor.isTeachingOnline() == true;;
        BiFunction<List<Instructor>,Predicate<Instructor>, Map<String, Integer>> instructorFunction = ((instructors, instructorPredicate) -> {
            Map<String, Integer> result = new HashMap<>();
            instructors.stream().filter(instructorPredicate).forEach(eachInstructor -> result.put(eachInstructor.getFirstName(), eachInstructor.getYearsOfExp()));
            return result;
        });

        instructorFunction.apply(Instructors.getAllInstructors(), onlinePredicate);
    }
}
