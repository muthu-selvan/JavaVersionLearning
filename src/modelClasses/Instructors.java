package modelClasses;

import java.util.List;

public class Instructors {

    public static List<Instructor> getAllInstructors() {
        Instructor instructor1 = new Instructor("Muthu","Selvan",8, List.of("Java","Kotlin"),false);
        Instructor instructor2 = new Instructor("Muthu","Raj",8, List.of("Java","Python"),true);
        Instructor instructor3 = new Instructor("Arul","Lingam",8, List.of("DSA","System Design"),false);
        Instructor instructor4 = new Instructor("Muthu","Prabhu",8, List.of("Jenkins","CI/CD"),true);

        return List.of(instructor1,instructor2,instructor3,instructor4);
    }
}
