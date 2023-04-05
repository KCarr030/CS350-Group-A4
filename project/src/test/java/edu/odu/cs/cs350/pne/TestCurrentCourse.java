package edu.odu.cs.cs350.pne;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestCurrentCourse {

    @Test
    public void testConstructor() {
        String courseName = "CS 361";
        CurrentCourse currentCourse = new CurrentCourse(courseName);
        assertEquals(courseName, currentCourse.getCourseName());
        assertTrue(currentCourse.getOfferings().isEmpty());
}

    @Test
    void testGetCourseName() {
        CurrentCourse course = new CurrentCourse("CS 361");
        assertEquals("CS 361", course.getCourseName());
    }
    @Test
    void testGetOfferingsEmpty() {
        CurrentCourse currentCourse = new CurrentCourse("CS 361");
        assertTrue(currentCourse.getOfferings().isEmpty());
        }
  /*  @Test
    void testGetOfferingsNonEmpty() {
        CurrentCourse currentCourse = new CurrentCourse("CS61");
        Offering offering1 = new Offering(LocalDate.of(2022, 1, 1), LocalDate.of(2022, 5, 1), "CS 361", "MWF", "10:00 AM", "11:00 AM", "Dragas", "J.Morris", 50, 0);
        Offering offering2 = new Offering(LocalDate.of(2022, 1, 1), LocalDate.of(2022, 5, 1), "CS 361", "TR", "2:00 PM", "3:15 PM", "Dragas", "J.Sun", 40, 0);
        currentCourse.addOffering(offering1);
        currentCourse.addOffering(offering2);
        assertFalse(currentCourse.getOfferings().isEmpty());
        assertEquals(2, currentCourse.getOfferings().size());
        }

        */
}
