package edu.odu.cs.cs350.pne;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.opencsv.exceptions.CsvValidationException;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestRead {

    @Test
    public void testCSVRead() throws CsvValidationException, IOException {
        Read.file = "./2020-04-01.csv";
        Read.csvReadFunction();
        assertFalse(Read.sections.isEmpty());
    }
}