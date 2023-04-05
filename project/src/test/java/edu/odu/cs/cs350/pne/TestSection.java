package edu.odu.cs.cs350.pne;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestSection {
    @Test
    void testSectionConstructor() {
        Section section = new Section(12345, "J.Morris", "CS 361", 50, 25);
        assertEquals(12345, section.getCrn());
        assertEquals("J.Morris", section.getInstructor());
        assertEquals("CS 361", section.getCourseName());
        assertEquals(50, section.getCapacity());
        assertEquals(25, section.getEnrollment());
}
    @Test
    void testGetCrn() {
        int crn = 12345;
        Section section = new Section(crn, "J.Morris", "CS 361", 50, 25);
        assertEquals(crn, section.getCrn());
}
    @Test
    void testGetCourseName() {
        Section section = new Section(19195, "J.Morris", "CS 361", 30, 20);
        assertEquals("CS 361", section.getCourseName());
    }
    
    @Test
    void testGetCapacity() {
        Section section = new Section(19195, "J.Morris", "CS 361", 50, 25);
        assertEquals(50, section.getCapacity());
    }
    @Test
    void testGetEnrollment() {
        Section section = new Section(19195, "J.Morris", "CS 361", 50, 25);
        assertEquals(25, section.getEnrollment());
    }
    @Test
    void testSetEnrollment() {
        Section section = new Section(19195, "J.Morris", "CS 361", 50, 20);
        section.setEnrollment(30);
        assertEquals(30, section.getEnrollment());
    }
    
}
