package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestOffering {
    @Test
    public void testConstructor(){
        String startDateStr = "2022-08-10";
        String endDateStr = "2022-12-31";
        Offering offering = null;
        try {
            offering = new Offering(startDateStr, endDateStr);
        }catch (DateTimeParseException e) {
            fail("Error.");
        }
        assertEquals(LocalDate.parse(startDateStr), offering.getStartTime());
        assertEquals(LocalDate.parse(endDateStr), offering.getEndTime());
    }

    @Test
    public void testSetDateRange(){
        Offering offering = null;
        try {
            offering = new Offering("2022-08-10", "2022-12-31");
            offering.setDateRange("2022-08-10", "2022-12-31");
        }catch (DateTimeParseException e) {
            
        }
    }
    @Test
    public void testGetStartData(){
        Offering offering = null;

        try {
            offering = new Offering("2022-08-10", "2022-12-31");
            offering.setDateRange("2022-08-10", "2022-12-31");
        }catch (DateTimeParseException e) {
            
        }
    }
    
    @Test
    public void testNumSeats() {
    	Offering offer = new Offering("2022-08-10", "2022-12-31");
    	int seats = offer.setnumSeats(25);
    	AssertEquals(offer.getnumSeats(seats), 25);
    }
    
    @Test
    public void testMaxCap() {
    	Offering offer = new Offering("2022-08-10", "2022-12-31");
    	int max = offer.setMaxCap(40);
    	AssertEquals(offer.getMaxCap(max), 40);
    }
}

