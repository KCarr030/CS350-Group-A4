package edu.odu.cs.cs350.pne;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.io.TempDir;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;


public class TestOffering {

    private Offering offering;
    private LocalDate date;
    private String courseName;
    private String time;
    private String group;
    private int seats;
    private int enrollment;
    private int maxCap;

    @Test
    public void setup() {
        date = LocalDate.of(2023, 3, 16);
        courseName = "Introduction to Java";
        time = "10:00-12:00";
        group = "A";
        seats = 20;
        enrollment = 10;
        maxCap = 30;
        offering = new Offering(date, courseName, time, group, seats, enrollment, maxCap);
    }
    


}
