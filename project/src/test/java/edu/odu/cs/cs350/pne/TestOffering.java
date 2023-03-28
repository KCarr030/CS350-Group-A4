package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestOffering {

    @Test
    void testConstructor(){
        String courseName = "CS 361";
        LocalDate time = LocalDate.of(2022, 4, 1);
        String directoryPath = "test/data/History/202010";
        String group = "A";
        int seats = 50;
        int enrollment = 0;
        int maxCapacity = 50;
        String instructorName = "Jay Morris";
        Offering offering = new Offering(courseName, time, directoryPath, group, seats, enrollment, maxCapacity, instructorName);
        
        assertEquals(courseName, offering.getCourseName());
        assertEquals(time, offering.getTime());
        assertEquals(directoryPath, offering.getDirectory().getPath());
        assertEquals(group, offering.getGroup());
        assertEquals(seats, offering.getSeats());
        assertEquals(enrollment, offering.getEnrollment());
        assertEquals(maxCapacity, offering.getMaxCapacity());
        assertEquals(instructorName, offering.getInstructorName());

    }
    @Test
    public void testGetCourseName(){
        Offering offering = new Offering("CS 361", LocalDate.now(), "test/data/History/202010", "A", 50, 0, 50, "Jay Morris");
        String expected = "CS 361";
        String actual = offering.getCourseName();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetTime(){
        LocalDate expected = LocalDate.of(2023, 4, 1);
        Offering offering = new Offering("CS 361", expected, "test/data/History/202010", "A", 50, 0, 50, "Jay Morris");
        assertEquals(expected, offering.getTime());
    }

    /* 
    @Test
    public void testConstructor(){
        

    @Test
    public void testSetDateRange(){

    }
    @Test
    public void testGetStartData(){
        Offering offering = null;

        try {
            offering = new Offering("2022-08-10", "2022-12-31");
            offering.setDateRange("2022-08-10", "2022-12-31");
        }catch (DateTimeParseException e) {
            
        }
    }
    
    @Test
    public void testNumSeats() {
    	Offering offer = new Offering("2022-08-10", "2022-12-31");
    	int seats = offer.setnumSeats(25);
    	AssertEquals(offer.getnumSeats(seats), 25);
    }
    
    @Test
    public void testMaxCap() {
    	Offering offer = new Offering("2022-08-10", "2022-12-31");
    	int max = offer.setMaxCap(40);
    	AssertEquals(offer.getMaxCap(max), 40);
    }
}
*/
}
