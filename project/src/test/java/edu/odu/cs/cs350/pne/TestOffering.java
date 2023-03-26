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
        int seats = 20;
        int enrollment = 10;
        int maxCapacity = 30;
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
