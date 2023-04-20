package edu.odu.cs.cs350.pne;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TestSection {

    
	@BeforeEach
	void setUp() throws Exception {
	}


    @Test
    public void testSectionDefaultConstructor() {
        Section section = new Section();
        
        assertEquals("", section.getCampus());
        assertEquals("0", section.getOverallCapacity());
        assertEquals("0", section.getOverallEnrollment());
        assertEquals(0, section.getCapacity());
        assertEquals(0, section.getNum());
        assertEquals("", section.getLink());
        assertEquals("", section.getSubject());
        assertEquals("000L", section.getCourse());
        assertEquals("", section.getCreditHours());
        assertEquals("", section.getSeats());
        assertEquals("", section.getRoom());
        assertEquals("", section.getTime());
        assertEquals("", section.getBuilding());
        assertEquals("", section.getPrint());
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
    @Test
        public void testSnapCRNComparator() {
            Section section1 = new Section();
            section1.setCRN(12345);
            Section section2 = new Section();
            section2.setCRN(67890);
            List<Section> sections = new ArrayList<>();
            sections.add(section1);
            sections.add(section2);
            Collections.sort(sections, Section.SnapCRN);
            assertEquals(section1, sections.get(0));
            assertEquals(section2, sections.get(1));
        }

    @Test
        public void testSnapNumComparator() {
            // Create some Section objects with different "num" values
            Section section1 = new Section();
            section1.setNum(1);
            Section section2 = new Section();
            section2.setNum(2);
            Section section3 = new Section();
            section3.setNum(3);
            
            // Create an ArrayList of the Section objects in a random order
            List<Section> sections = new ArrayList<>();
            sections.add(section2);
            sections.add(section1);
            sections.add(section3);
            
            // Sort the ArrayList using the SnapNum comparator
            Collections.sort(sections, Section.SnapNum);
            
            // Check that the ArrayList is sorted in ascending order by num
            assertEquals(section1, sections.get(0));
            assertEquals(section2, sections.get(1));
            assertEquals(section3, sections.get(2));
        }

    
}
