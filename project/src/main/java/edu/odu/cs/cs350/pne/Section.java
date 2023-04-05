package edu.odu.cs.cs350.pne;

public class Section {
    private int crn;
    private String instructor;
    private String courseName;
    private int capacity;
    private int enrollment;

    public Section(int crn, String instructor, String courseName, int capacity, int enrollment) {
        this.crn = crn;
        this.instructor = instructor;
        this.courseName = courseName;
        this.capacity = capacity;
        this.enrollment = enrollment;
    }
    public int getCrn() {
        return crn;
    }
    public String getInstructor() {
        return instructor;
    }
    public String getCourseName() {
        return courseName;
    }
    public int getCapacity() {
        return capacity;
    }
    public int getEnrollment() {
        return enrollment;
    }
    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }
}
