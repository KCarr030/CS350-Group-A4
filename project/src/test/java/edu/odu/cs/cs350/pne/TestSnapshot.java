package edu.odu.cs.cs350.pne;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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

public class TestSnapshot {
    
    @Test
    public void testConstructorWithFilePath() {
        // Create a Path object for a test CSV file
        Path filePath = Paths.get("test.csv");

        // Create a new Snapshot object using the test CSV file
        Snapshot snapshot = new Snapshot(filePath);

        // Check that the date was parsed correctly
        assertEquals("2022-01-01", snapshot.getDate().toString());

        // Check that the sections were loaded correctly
        ArrayList<Section> sections = snapshot.getSections();
        assertEquals(3, sections.size());

        // Check the contents of each section
        Section section1 = sections.get(0);
        assertEquals("Section 1", section1.getName());
        assertEquals(10, section1.getCapacity());

        Section section2 = sections.get(1);
        assertEquals("Section 2", section2.getName());
        assertEquals(20, section2.getCapacity());

        Section section3 = sections.get(2);
        assertEquals("Section 3", section3.getName());
        assertEquals(30, section3.getCapacity());
    }
}
