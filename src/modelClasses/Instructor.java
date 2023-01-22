package modelClasses;

import java.util.List;

public class Instructor {
    private String firstName;
    private String lastName;
    private int yearsOfExp;
    private List<String> courses;
    private boolean teachingOnline;

    public Instructor(String firstName, String lastName, int yearsOfExp, List<String> courses, boolean teachingOnline) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearsOfExp = yearsOfExp;
        this.courses = courses;
        this.teachingOnline = teachingOnline;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearsOfExp() {
        return yearsOfExp;
    }

    public void setYearsOfExp(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public boolean isTeachingOnline() {
        return teachingOnline;
    }

    public void setTeachingOnline(boolean teachingOnline) {
        this.teachingOnline = teachingOnline;
    }
}
