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

}
