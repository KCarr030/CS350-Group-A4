package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestDirectory {

    @Test
    public void testDirectoryConstructor() {
        Directory dir = new Directory(
                "test/data/History/202010");
        dir.printContents();

        assertEquals(dir.getFileName(0), "2020-04-01.csv");
        assertEquals(dir.getFilePath(0), "**/project/test/data/History/202010/2020-04-01.csv");

        assertEquals(dir.getFileName(dir.dirSize() - 1), "dates.txt");
        assertEquals(dir.getFilePath(dir.dirSize() - 1), "**/project/test/data/History/202010/dates.txt");

        System.out.println("testDirectoryConstructor: Success");
    }

    @Test
    public void testSetDirectory() {
        Directory dir = new Directory("**/project/test/data/History/202010");

        assertEquals(dir.getFileName(0), "2020-04-01.csv");
        assertEquals(dir.getFilePath(0), "**/project/test/data/History/202010/2020-04-01.csv");

        assertEquals(dir.getFileName(dir.dirSize() - 1), "dates.txt");
        assertEquals(dir.getFilePath(dir.dirSize() - 1), "**/project/test/data/History/202010/dates.txt");

        dir.setDirectory("**/project/test/data/History/202020");

        assertEquals(dir.getFileName(0), "2020-10-05.csv");
        assertEquals(dir.getFilePath(0), "**/project/test/data/History/202020/2020-10-05.csv");

        assertEquals(dir.getFileName(dir.dirSize() - 1), "dates.txt");
        assertEquals(dir.getFilePath(dir.dirSize() - 1), "**/project/test/data/History/202020/dates.txt");

        System.out.println("testSetDirectory: Success");
    }
}
