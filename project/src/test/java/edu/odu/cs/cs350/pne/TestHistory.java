package edu.odu.cs.cs350.pne;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestHistory {
    
    @Test
    public void TestHistoryConstructor1() {
        History historical = new History(19195, 350, 4000, 2500, 40, 35);
        assertEquals(19195, historical.getCRN());
        assertEquals(350, historical.getCRSE());
        assertEquals(4000, historical.getStudentCap());
        assertEquals(2500, historical.getStudentEnrolled());
        assertEquals(40, historical.getStudentEnrollmentCap());
        assertEquals(35, historical.getTotalStudentsEnrolled());
    }

    @Test
    public void TestHistoryConstructor2() {
        History historical = new History("CS", "CS350", null, null);
        assertEquals("CS", historical.getSubject());
        assertEquals("CS350", historical.getCourseName());
        assertEquals(null, historical.getLink());
        assertEquals(null, historical.getXLSTGroup());
    }

    @Test
    public void TestGetCRN() {
        History historical = new History(19195, 350, 4000, 2500, 40, 35);
        assertEquals(19195, historical.getCRN());
        assertNotNull(historical.getCRN());
        assertNotNull(historical);
    }

    @Test
    public void TestGetCRSE() {
        History historical = new History(19195, 350, 4000, 2500, 40, 35);
        assertEquals(350, historical.getCRSE());
        assertNotNull(historical.getCRSE());
        assertNotNull(historical);
    }

    @Test
    public void TestGetStudentCap() {
        History historical = new History(19195, 350, 4000, 2500, 40, 35);
        assertEquals(4000, historical.getStudentCap());
        assertNotNull(historical.getStudentCap());
        assertNotNull(historical);
    }

    @Test
    public void TestGetStudentEnrolled() {
        History historical = new History(19195, 350, 4000, 2500, 40, 35);
        assertEquals(2500, historical.getStudentEnrolled());
        assertNotNull(historical.getStudentEnrolled());
        assertNotNull(historical);
    }

    @Test
    public void TestGetStudentEnrollmentCap() {
        History historical = new History(19195, 350, 4000, 2500, 40, 35);
        assertEquals(40, historical.getStudentEnrollmentCap());
        assertNotNull(historical.getStudentEnrollmentCap());
        assertNotNull(historical);
    }

    @Test
    public void TestGetTotalStudentsEnrolled() {
        History historical = new History(19195, 350, 4000, 2500, 40, 35);
        assertEquals(35, historical.getTotalStudentsEnrolled());
        assertNotNull(historical.getTotalStudentsEnrolled());
        assertNotNull(historical);
    }

    @Test
    public void TestGetSubject() {
        History historical = new History("CS", "CS350", null, null);
        assertEquals("CS", historical.getSubject());
        assertNotNull(historical.getSubject());
        assertNotNull(historical);
        assertFalse(historical.getSubject().isEmpty());

    }

    @Test
    public void TestGetCourseName() {
        History historical = new History("CS", "CS350", null, null);
        assertEquals("CS350", historical.getCourseName());
        assertNotNull(historical.getCourseName());
        assertFalse(historical.getCourseName().isEmpty());
        assertNotNull(historical);
        assertTrue(historical.getCourseName().startsWith("CS"));
        assertTrue(historical.getCourseName().endsWith("350"));

    }

    @Test
    public void TestGetLink() {
        History historical = new History("CS", "CS350", null, null);
        assertEquals(null, historical.getLink());
        assertTrue(historical.getLink().isEmpty());
        assertNotNull(historical);
    }

    @Test
    public void TestGetXLSTGroup() {
        History historical = new History("CS", "CS350", null, null);
        assertEquals(null, historical.getXLSTGroup());
        assertTrue(historical.getXLSTGroup().isEmpty());
        assertNotNull(historical);  
    }    
}