package edu.odu.cs.cs350.pne;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestSection {

    
	@BeforeEach
	void setUp() throws Exception {
	}

    @Test
    public void testSectionConstructor() {
        Section section = new Section();
        assertEquals("Main", section.getCampus());
        assertEquals("LEC", section.getPrint());
        assertEquals("8:00 AM - 9:50 AM", section.getTime());
        assertEquals("MWF", section.getDays());
        assertEquals("Building A", section.getBuilding());
        assertEquals("Room 101", section.getRoom());
        assertEquals("50", section.getSeats());
        assertEquals(12345, section.getCRN());
        assertEquals("CS", section.getSubject());
        assertEquals("101", section.getCourse());
        assertEquals("3.0", section.getCreditHours());
        assertEquals("50", section.getCrossListCapacity());
        assertEquals(0, section.getEnrollment());
        assertEquals("https://example.com/cs101", section.getLink());
        assertEquals("M. Smith", section.getInstructor());
        assertEquals("50", section.getOverallCapacity());
        assertEquals("0", section.getOverallEnrollment());
        assertEquals("8:00 AM", section.getPtrmStart());
        assertEquals("9:50 AM", section.getPtrmEnd());
        assertEquals(50, section.getCapacity());
        assertEquals(1, section.getNum());
}

    @Test
    public void testSectionDefaultConstructor() {
        Section section = new Section();
        
        assertEquals("", section.getCampus());
        assertEquals("", section.getBuilding());
        assertEquals("", section.getDays());
        assertEquals("", section.getInstructor());
        assertEquals("", section.getLink());
        assertEquals("000L", section.getCourse());
        assertEquals(0, section.getCRN());
        assertEquals("0", section.getCrossListCapacity());
        assertEquals(7, section.getEnrollment());
        assertEquals("", section.getPtrmStart());
        assertEquals("", section.getPtrmEnd());
    }
}
