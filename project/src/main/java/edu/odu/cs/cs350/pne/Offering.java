package edu.odu.cs.cs350.pne;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;




/** This is the class
 * @author Group A4
 * 
 */

 public class Offering {
    private LocalDate startTime;
    private LocalDate endTime;

    //Constructor 
    public Offering(String startDateStr, String endDateStr) throws DateTimeParseException{
        this.startTime = LocalDate.parse(startDateStr);
        this.endTime = LocalDate.parse(endDateStr);
    }
    
 }
