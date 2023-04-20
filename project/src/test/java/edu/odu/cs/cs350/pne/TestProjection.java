package edu.odu.cs.cs350.pne;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestProjection {

    @Test
    public void testprojectionSem(){
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
        //assertTrue(out2.contains("2021-01-09.csv"));
    }

    @Test
    public void testdetailedProjection(){
        // Test file location input 

    }

}