package lab6;

import java.util.Arrays;

public class Teacher extends Person {

    //Variables
    private int NumCourses;
    private String[] Courses;
    
    //Constructors
    public Teacher(String name, String address, int numCourses, String[] courses) {
        super(name, address);
        NumCourses = numCourses;
        Courses = courses;
    }
    
    //Getters and Setters
    public int getNumCourses() {
        return NumCourses;
    }

    public void setNumCourses(int numCourses) {
        NumCourses = numCourses;
    }

    public String[] getCourses() {
        return Courses;
    }

    public void setCourses(String[] courses) {
        Courses = courses;
    }
    
    //toString
    @Override
    public String toString() {
        return "Teacher [Courses=" + Arrays.toString(Courses) + ", NumCourses=" + NumCourses + "]";
    }

   
    //Misc
    public boolean addCourse(String course) {
        return false;
    }

    public boolean removeCourse(String course) {
        return false;
    }
}
