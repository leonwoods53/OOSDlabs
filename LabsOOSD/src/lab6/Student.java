package lab6;

import java.util.Arrays;

public class Student extends Person {
        
    //Variables
    private int NumCourses;
    private String[] Courses;
    private int[] Classes;
    
    //Constructors
    public Student(String name, String address, int numCourses, String[] courses, int[] classes) {
        super(name, address);
        NumCourses = numCourses;
        Courses = courses;
        Classes = classes;
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


    public int[] getClasses() {
        return Classes;
    }


    public void setClasses(int[] classes) {
        Classes = classes;
    }
    

    //toString
    @Override
    public String toString() {
        return "Student [Classes=" + Arrays.toString(Classes) + ", Courses=" + Arrays.toString(Courses)
                + ", NumCourses=" + NumCourses + "]";
    }
    
    
    
    //Misc
    public void addCourseGrade(String course, int grade) {
        return;
    }

    public void printGrades() {
        return;
    }

    public double getAverageGrade() {
        return 0.0d;
    }

}
