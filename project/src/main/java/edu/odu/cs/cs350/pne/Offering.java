package edu.odu.cs.cs350.pne;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.HashSet;
import java.util.Set;

/*
 * Object that will contain all the information for each individual offerings. 
 * (each unique class offering in CSV files)
 * 
 */

/** This is the class
 * @author Group A4
 * 
 */

 public class Offering {
    private String courseName;
    private LocalDate time;
   // private Directory directory;
    private String group;
    private int seats;
    private int enrollment;
    private int maxCapacity;
    private String instructorName;


    //Constructor for integers and string variables
    public Offering(String courseName, LocalDate time, String group, int seats, int enrollment, int maxCapacity, String instructorName) {
        this.courseName = courseName;
        this.time = time;
       // this.directory = new Directory(directoryPath);
        this.group = group;
        this.seats = seats;
        this.enrollment = enrollment;
        this.maxCapacity = maxCapacity;
        this.instructorName = instructorName;
        }
// getters
        public String getCourseName() {
            return courseName;
        }
    
        public LocalDate getTime() {
            return time;
        }
    
        public String getGroup() {
            return group;
        }
    
        public int getSeats() {
            return seats;
        }
    
        public int getEnrollment() {
            return enrollment;
        }
    
        public int getMaxCapacity() {
            return maxCapacity;
        }
    
        public String getInstructorName() {
            return instructorName;
        }

        public boolean isDuplicate(Offering other) {
            return courseName.equals(other.courseName) && time.equals(other.time) && group.equals(other.group);
        }

        public double getPercentFilled() {
            return (double) enrollment / maxCapacity * 100;
        }

        
        //create an offering object by providing a row of data (String) from the CSV file as param.         
        public Offering(String[] fields)
        {
            this.courseName = fields[3];
           // this.time = time;
           // this.directory = new Directory(directoryPath);
            this.group = fields[9];
            this.seats = Integer.parseInt(fields[23]);
            this.enrollment = 0;
            this.maxCapacity = Integer.parseInt(fields[6]);
            this.instructorName = fields[20];
        }

        public String toString() {
            return String.format("%s %s %s %d/%d (%.1f%%) %s", courseName, time, group, enrollment, maxCapacity,
                    getPercentFilled(), instructorName);
        }
    }
        



