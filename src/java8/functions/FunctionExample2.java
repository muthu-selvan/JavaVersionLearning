package java8.functions;

import modelClasses.Instructor;
import modelClasses.Instructors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.function.Function;

public class FunctionExample2 {
    final static Function<List<Instructor>, Map<String,Integer>> nameYoeFunction = instructors -> {
        Map<String, Integer> map = new HashMap<>();
        instructors.forEach(eachInstructor -> map.put(new StringJoiner(" ")
                .add(eachInstructor.getFirstName())
                .add(eachInstructor.getLastName()).toString(), eachInstructor.getYearsOfExp()));
        return map;
    };
    public static void main(String[] args) {
        final List<Instructor> allInstructors = Instructors.getAllInstructors();
        System.out.println("Result : "+nameYoeFunction.apply(allInstructors));
    }
}
