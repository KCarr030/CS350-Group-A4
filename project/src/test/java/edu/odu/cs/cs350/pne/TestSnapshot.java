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
        LocalDate date = snapshot.getLocalDateFromFileName("2023-04-21_example.csv");
        assertEquals(date, LocalDate.of(2023, 4, 21));
    }
}
