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
	void testDefaultConstructor() {
		Section x = new Section();
		
		assertEquals(x.getNum(), 000);
		assertEquals(x.getCRNum(), 0);
		assertEquals(x.getEnr(), 0);
		assertEquals(x.getCap(), "0");
	//	assertEquals(x.getCRN(), "0");
		assertEquals(x.getSubj(), "");
		assertEquals(x.getCrse(), "000L");
		assertEquals(x.getCourse(), x.getSubj()+x.getCrse());
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
