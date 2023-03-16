package edu.odu.cs.cs350.pne;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestCourse {

    @Test
    public void testCourseConstructor(){
        Course course = new Course("CS 361");
        assertEquals("CS 361", course.getName());
        assertNotNull(course.getOfferings());
        assertTrue(course.getOfferings().isEmpty());
        assertTrue(course.getOfferings() instanceof ArrayList);
    }
    @Test
    public void testGetName() {
        Course course = new Course("Test Course");
        assertEquals("Test Course", course.getName());
        assertNotNull(course.getName());
        assertFalse(course.getName().isEmpty());
    }
    
}
