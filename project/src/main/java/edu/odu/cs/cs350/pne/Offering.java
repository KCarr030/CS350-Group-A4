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
<<<<<<< HEAD
    private String courseName;
    private LocalDate time;
    private Directory directory;
    private String group;
    private int seats;
    private int enrollment;
    private int maxCapacity;
    private String instructorName;

=======
    private LocalDate startTime;
    private LocalDate endTime;
    private int maxCap;
    private int numSeats;
>>>>>>> 01e593bb43a8072cbe4c2375f09c1e2c61503cc7

    
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
    
    
 }
