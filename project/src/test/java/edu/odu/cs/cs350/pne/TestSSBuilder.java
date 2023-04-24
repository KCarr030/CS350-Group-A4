package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestSSBuilder {

    // This test currently writes a testing .xlsx file to src/test/data/TestSheets
    // The file after this test should consist of one header and one row of
    // information.
    @Test
    public void testProduceFile() {
        String pathname = ("src/test/data/TestSheets");
        String[] headers = { "Header1", "Header2", "", "Header3" };
        SSBuilder con = new SSBuilder("TestSheet", headers);
        Integer[] info1 = { 1, 3, null, 4 };
        con.addRow(info1);
        con.outputFile(pathname, "TestFile.xlsx");
    }

    @Test
    public void testFileSpecChars() {
        String pathname = ("src/test/data/TestSheets");
        String[] headers = { " ", ">", ".", "_" }; // Special chars
        SSBuilder con = new SSBuilder("_;.!", headers); // Special chars
        Integer[] info1 = { 0, -3, null, 49 }; // Negatives and 0
        con.addRow(info1);
        String[] info2 = { "", "--", null }; // Row smaller than # headers
        con.addRow(info2);
        Double[] info3 = { .01, .99, -.000003, 1.203, 0.0 }; // Row larger than # headers.
        con.addRow(info3);
        con.outputFile(pathname, "TestSpecialChars.xlsx");
    }
}
