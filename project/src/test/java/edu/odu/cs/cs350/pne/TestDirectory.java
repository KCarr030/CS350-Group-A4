package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestDirectory {

    @Test
    public void testDirectoryConstructor() {
        System.out.println(new File("src/test/data/History/202010").getAbsolutePath());
        Directory dir = new Directory(
                "src/test/data/History/202010");
        // dir.printContents();

        assertEquals(dir.getFileName(0), "2020-04-01.csv");
        assertEquals(dir.getFilePath(0), new File("src/test/data/History/202010/2020-04-01.csv"));

        assertEquals(dir.getFileName(dir.dirSize() - 1), "dates.txt");
        assertEquals(dir.getFilePath(dir.dirSize() - 1), new File("src/test/data/History/202010/dates.txt"));

        System.out.println("testDirectoryConstructor: Success");
    }

    @Test
    public void testSetDirectory() {
        Directory dir = new Directory("src/test/data/History/202010");

        assertEquals(dir.getFileName(0), "2020-04-01.csv");
        assertEquals(dir.getFilePath(0), new File("src/test/data/History/202010/2020-04-01.csv"));

        assertEquals(dir.getFileName(dir.dirSize() - 1), "dates.txt");
        assertEquals(dir.getFilePath(dir.dirSize() - 1), new File("src/test/data/History/202010/dates.txt"));

        dir.setDirectory("src/test/data/History/202020");

        assertEquals(dir.getFileName(0), "2020-10-05.csv");
        assertEquals(dir.getFilePath(0), new File("src/test/data/History/202020/2020-10-05.csv"));

        assertEquals(dir.getFileName(dir.dirSize() - 1), "dates.txt~");
        assertEquals(dir.getFilePath(dir.dirSize() - 1), new File("src/test/data/History/202020/dates.txt~"));

        // System.out.println(dir.datesIndex());
        assertEquals(dir.datesIndex(), 243);
        assertEquals(dir.getFileName(dir.datesIndex()), "dates.txt");

        System.out.println("testSetDirectory: Success");
    }

}
