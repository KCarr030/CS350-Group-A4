package edu.odu.cs.cs350.pne;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;


/** This is the class
 * @author Group A4
 * 
 */

 public class Offering {
    private LocalDate date;
    private String courseName;
    private String time;
    private String group;
    private int seats;
    private int enrollment;
    private int maxCap;

    public Offering(LocalDate date, String courseName, String time, String group, int seats, int enrollment, int maxCap) {
        this.date = date;
        this.courseName = courseName;
        this.time = time;
        this.group = group;
        this.seats = seats;
        this.enrollment = enrollment;
        this.maxCap = maxCap;
    }


   /*  public void toCsv(String filename) throws IOException {
        FileWriter writer = new FileWriter(filename);
        writer.append("Date,Course Name,Time,Group,Seats,Enrollment,Max Cap\n");
        writer.append(String.format("%s,%s,%s,%s,%d,%d,%d\n", date.toString(), courseName, time, group, seats, enrollment, maxCap));
        writer.flush();
        writer.close();
    }
    */
 }
