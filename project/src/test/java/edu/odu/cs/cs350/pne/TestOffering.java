package edu.odu.cs.cs350.pne;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestOffering {

    @Test
    public void testGetters() {
        Offering offering = new Offering("CS 361", LocalDate.of(2022, 4, 1), "A", 20, 10, 30, "J.Morris");
        assertEquals("CS 361", offering.getCourseName());
        assertEquals(LocalDate.of(2022, 4, 1), offering.getTime());
        assertEquals("A", offering.getGroup());
        assertEquals(20, offering.getSeats());
        assertEquals(10, offering.getEnrollment());
        assertEquals(30, offering.getMaxCapacity());
        assertEquals("J.Morris", offering.getInstructorName());
    }

    @Test
    public void testGetCourseName() {
        Offering offering = new Offering("CS361", LocalDate.of(2022, 4, 1), "A", 50, 0, 50, "J.Morris");
        assertEquals("CS361", offering.getCourseName());
    }

    @Test
    public void testGetTime() {
        LocalDate expectedTime = LocalDate.of(2022, 4, 1);
        Offering offering = new Offering("CS 361", expectedTime, "A", 50, 20, 30, "J.Morris");
        LocalDate actualTime = offering.getTime();
        assertEquals(expectedTime, actualTime);
    }

    @Test
    public void testGetGroup() {
        Offering offering = new Offering("CS 361", LocalDate.of(2023, 3, 27), "A", 50, 10, 60, "J.Morris");
        assertEquals("A", offering.getGroup());
    }

    @Test
    public void testGetSeats() {
        Offering offering = new Offering("CS101", LocalDate.of(2023, 3, 27), "A", 50, 30, 100, "J.Morris");
        assertEquals(50, offering.getSeats());
}
    @Test
    public void testGetEnrollment() {
        Offering offering = new Offering("CS 361", LocalDate.of(2023, 3, 27), "A", 50, 10, 60, "J.Morris");
        assertEquals(10, offering.getEnrollment());
    }

    @Test
    public void testGetMaxCapacity() {
        Offering offering = new Offering("CS 361", LocalDate.of(2022, 4, 1),  "A", 50, 20, 100, "J.Morris");
        assertEquals(100, offering.getMaxCapacity());
}

    @Test
    public void testIsDuplicate() {
        Offering offering1 = new Offering("CS 361", LocalDate.of(2022, 4, 1), "A", 20, 10, 30, "J.Morris");

        Offering offering2 = new Offering("CS 361", LocalDate.of(2022, 4, 1), "A", 20, 5, 30, "F.Wang");

        Offering offering3 = new Offering("CS 361", LocalDate.of(2022, 4, 1), "B", 20, 10, 30, "J.Sun");

        assertTrue(offering1.isDuplicate(offering2));
        assertFalse(offering1.isDuplicate(offering3));
    }

    @Test
    public void testGetInstructorName() {
        Offering offering = new Offering("CS350", LocalDate.of(2022, 9, 1), "A", 50, 30, 50, "J.Morris");
        Offering offering2 = new Offering("CS 361", LocalDate.of(2022, 4, 1), "A", 20, 5, 30, "F.Wang");
        Offering offering3 = new Offering("CS 361", LocalDate.of(2022, 4, 1), "B", 20, 10, 30, "J.Sun");
        assertEquals("J.Morris", offering.getInstructorName());
        assertEquals("F.Wang", offering2.getInstructorName());
        assertEquals("J.Sun", offering3.getInstructorName());
    }

    @Test
    public void testGetPercentFilled() {
        Offering offering = new Offering("CS 361", LocalDate.of(2022, 4, 1), "A", 20, 10, 30, "J.Morris");

        assertEquals(33.3, offering.getPercentFilled(), 0.1);
    }

    @Test
    public void testOfferingConstructor() {
        // Prepare test data with valid integer values
        String[] fields = new String[] { "field0", "field1", "field2", "courseName", "field4", "field5", "30",
                "field7", "field8", "group", "field10", "field11", "field12", "field13", "field14", "field15", "field16",
                "field17", "field18", "field19", "field20", "field21", "field22", "23" };
    
        // Create Offering object using the constructor
        Offering offering = new Offering(fields);
    
        // Assert that the Offering object is created correctly
        assertEquals("courseName", offering.getCourseName());
        assertEquals("group", offering.getGroup());
        assertEquals(0, offering.getEnrollment());
        assertEquals(30, offering.getMaxCapacity());
        assertEquals(23, offering.getSeats());
       // assertEquals("instructorName", offering.getInstructorName());
    }
    
/* 
    @Test
    public void testToString() {
        Offering offering = new Offering("CS 361", LocalDate.of(2022, 4, 1), "A", 20, 10, 30, "J.Morris");

     assertEquals("CS 361", offering.toString());
    }
 */
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
