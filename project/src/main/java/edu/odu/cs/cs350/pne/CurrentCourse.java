package edu.odu.cs.cs350.pne;
import java.util.ArrayList;
import java.util.List;

public class CurrentCourse {
    private String courseName;
    private List<Offering> offerings;

    public CurrentCourse(String courseName) {
        this.courseName = courseName;
        this.offerings = new ArrayList<>();
    }
    public String getCourseName() {
        return courseName;
    }
    public List<Offering> getOfferings() {
        return offerings;
    }
}
