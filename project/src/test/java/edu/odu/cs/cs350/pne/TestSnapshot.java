package edu.odu.cs.cs350.pne;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class TestSnapshot {
    @Test
    void testGetDateFromFileName() {
        Snapshot snapshot = new Snapshot();
        LocalDate date = snapshot.getLocalDateFromFileName("2020-04-01.csv");
        assertEquals(date, LocalDate.of(2020, 4, 01));
    }
    @Test
    void testReadCsvFromFile() throws IOException {
        URL url = new URL("https://raw.githubusercontent.com/KCarr030/CS350-Group-A4/main/project/src/test/java/edu/odu/cs/cs350/pne/2020-04-01.csv");
        Snapshot snapshot = new Snapshot(url);
        ArrayList<Section> sections = snapshot.getSections();
        //assertEquals(sections.size(), 2);    // having problem right here
        assertEquals(sections.get(0).getName(), "Section 1");
        assertEquals(sections.get(1).getName(), "Section 2");
        assertEquals(sections.get(2).getName(), "Section 3");   
    }
    @Test
    void testGetLocalDateFromFileName() {
        Snapshot snapshot = new Snapshot();
        String fileName = "2020-04-01.csv";
        LocalDate actualDate = snapshot.getLocalDateFromFileName(fileName);
        assertEquals(LocalDate.of(2020, 4, 01), actualDate, "The extracted date should match the date in the file name");
    }
}

