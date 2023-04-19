package edu.odu.cs.cs350.pne;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestSection {

    
	@BeforeEach
	void setUp() throws Exception {
	}

    @Test
public void testSectionConstructor() {
    String csvFilePath = "/src/test/data/History/";
    String[] fields = null;
    try (BufferedReader reader = new BufferedReader(new FileReader(csvFilePath))) {
        // Read the first line of the file and split it into fields
        fields = reader.readLine().split(",");
    } catch (IOException e) {
        fail("Error reading CSV file: " + e.getMessage());
    }

    Section section = new Section(fields);

    assertEquals("12345", section.getCRN());
    assertEquals("CS361", section.getSubject());
    assertEquals("101", section.getCourse());
    assertEquals("30", section.getCrossListCapacity());
    assertEquals("20", section.getEnrollment());
    assertEquals("9:00am-9:50am", section.getTime());
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
        assertEquals("0", section.getCRN());
        assertEquals("0", section.getCrossListCapacity());
        assertEquals("0", section.getEnrollment());
        assertEquals("", section.getPtrmStart());
        assertEquals("", section.getPtrmEnd());
    }
}
