package edu.odu.cs.cs350.pne;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestSemester {
    private File subdirectory;
    private File dates;
    @Test
    public void testGetDirectory(){
        subdirectory = new File("2023");
        subdirectory.mkdir();
        dates = new File(subdirectory, "dates.txt");

        String n = "directory1";
        Directory dir = new Directory(subdirectory.toString());
        History hist = new History("CS", 350, "INTRO", "A1", "B1");
        Offering offerings = new Offering(new String[]{"", "", "", "", "", "", "10","","", "", "", "", "", "", "","","", "", "", "", "", "", "","20"});
        Semester sem = new Semester(dir, "10/09/2021", "12/03/2021", hist, "Fall 2021", offerings);
        assertEquals(dir, sem.getSemestDirect());
        assertEquals("10/09/2021", sem.getRegistDate());
        assertEquals("12/03/2021", sem.getWithwDate());
        assertEquals(hist, sem.getHistory());
        assertEquals("Fall 2021", sem.getCurrent());
        assertEquals(offerings, sem.getOffering());
        subdirectory.delete();
    }

}
