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


    //Time Range
    //Constructor 
    public Offering(String startDateStr, String endDateStr) throws DateTimeParseException{
        this.startTime = LocalDate.parse(startDateStr);
        this.endTime = LocalDate.parse(endDateStr);
    }
    public void setDateRange(String startDateStr, String endDateStr) throws DateTimeParseException{
        LocalDate startDate = LocalDate.parse(startDateStr);
        LocalDate endDate = LocalDate.parse(endDateStr);

        if (startDate.isAfter(endDate)){
            throw new IllegalArgumentException("Start date must be before or equal to end date");
        }
        this.startTime = startDate;
        this.endTime = endDate;
    }

    //getters for start and end
    public LocalDate getStartTime(){
        return startTime;
    }
    public LocalDate getEndTime(){
        return endTime;
    }
    
 }
