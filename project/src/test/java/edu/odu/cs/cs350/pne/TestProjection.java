package edu.odu.cs.cs350.pne;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestProjection {

    @TempDir
    File tempdir;

    private File subdirectory;
    private File dates;
    private File File1;
    private File File2;

    @Test
    public void testprojectionSem1(){
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        try {
            Projection.projectionSem("202030");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.setOut(System.out);
        String out2 = out.toString();
        assertTrue(out2.contains("dates.txt"));
    }

    @Test
    public void testProjectionSem2(){
        // test for an incorrect directory
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        try {
            Projection.projectionSem("202");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.setOut(System.out);
        String out2 = out.toString();
        assertTrue(out2.contains(" is an invalid directory code..."));
    }

    @Test
    public void testProjection3(){
        // test for files in the directory
        subdirectory = new File(tempdir, "History" + "202030");
        subdirectory.mkdir();
        dates = new File(subdirectory, "dates.txt");
        try {
            FileWriter write = new FileWriter(dates);
            write.write("2020-10-19\n");
            write.write("2021-05-02\n");
            write.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File1 = new File(subdirectory, "File1.csv");
        try {
            File1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File2 = new File(subdirectory, "File2.csv");
        try {
            File2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String path = subdirectory.getAbsolutePath();
        Directory dir = new Directory(path);
        assertEquals(3, dir.dirSize());
        assertTrue(dir.getFiles().contains(File1));
        assertTrue(dir.getFiles().contains(File2));
        subdirectory.delete();
    }

    @Test
    public void testdetailedProjection(){
        // Test file location input 
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Projection.detailedProjection("/src/test/data/testDetailed");
        System.setOut(System.out);
        String out2 = out.toString();
        assertTrue(out2.contains("Excel"));
    }

}