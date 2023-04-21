package edu.odu.cs.cs350.pne;
import java.util.ArrayList;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.opencsv.exceptions.CsvValidationException;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestRead {
        

    @Test
    public void testCSVRead() throws IOException {
        
        Read.file = "src/test/java/edu/odu/cs/cs350/pne/2020-04-01.csv";
        File f = new File(Read.file);
        System.out.println("File path: " + f.getAbsolutePath());
        try {
            Read.csvReadFunction();
        } catch (IOException e){
            fail("File path: " + System.getProperty("user.dir"));
        }
        ArrayList<Section> sections2 = Read.sections;
        // Make sure the ArrayList sections2 has data in it.
        assertFalse(sections2.isEmpty());
        // Check if the first value of the first section is correct.
        Section first = sections2.get(0);
        String firstSeats = first.getSeats();
        assertEquals("50", firstSeats);
    }
    
}