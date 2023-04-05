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
    public void addOffering(Offering offering) {
        offerings.add(offering);
    }
    public int getCurrentEnrollment() {
        int totalEnrollment = 0;
        for (Offering offering : offerings) {
            totalEnrollment += offering.getEnrollment();
        }
        return totalEnrollment;
    }
}
