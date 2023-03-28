package edu.odu.cs.cs350.pne;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.HashSet;
import java.util.Set;




/** This is the class
 * @author Group A4
 * 
 */

 public class Offering {
    private String courseName;
    private LocalDate time;
    private Directory directory;
    private String group;
    private int seats;
    private int enrollment;
    private int maxCapacity;
    private String instructorName;


    //Constructor for integers and string variables
    public Offering(String courseName, LocalDate time, String directoryPath, String group, int seats,
                    int enrollment, int maxCapacity, String instructorName) {
        this.courseName = courseName;
        this.time = time;
        this.directory = new Directory(directoryPath);
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
        public Set<String> getFileNames() {
            Set<String> fileNames = new HashSet<>();
            for (int i = 0; i < directory.dirSize(); i++) {
                fileNames.add(directory.getFileName(i));
            }
            return fileNames;
        }

        public Set<String> getFilePaths() {
            Set<String> filePaths = new HashSet<>();
            for (int i = 0; i < directory.dirSize(); i++) {
                filePaths.add(directory.getFilePath(i));
            }
            return filePaths;
        }

        public String toString() {
            return String.format("%s %s %s %d/%d (%.1f%%) %s", courseName, time, group, enrollment, maxCapacity,
                    getPercentFilled(), instructorName);
        }




   /* 
    public int setMaxCap(int maxCap) {
    	this.maxCap = maxCap;
		return maxCap;
    }
    
    public int setnumSeats(int numSeats) {
    	this.numSeats = numSeats;
		return numSeats;
    }
    
    public int getnumSeats(int numSeats) {
		return numSeats;
    }
    
    public int getMaxCap(int maxCap) {
		return maxCap;
    }
    
    */ 
 }
