package edu.odu.cs.cs350.pne;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Where the Semester Data is stored- Semester consists of muliple courses.
//Semester
public class Semester 
{
    /*Parts of Semester Class
        semestDirct =  Semester Directory 
        RegistDate = Registration Date
        withwDate = Withdraw Date 
        offering = courses being offered for desired semester --string? 
        history = previous semester
        current = current semester*/
    
    // Not great with designing classes, these may need to be some sort of list or other ADT
    private Offering offering; // changed offering to offering class
    private Directory semestDirct; // changed directory to directory class, please get back to me about whether this directory is same as directory in directory class
    private History history; // changed history to history class

    private int registDate, withwDate, current;  // current is int?  Wouldn't current be another semester object? -nolan
    // Unsure if we would want these values to be ints, these could be type string instead -nolan
   
    
    //Constructor for integers and string variables
    public Semester(Directory semesterDirct, int registDate, int withwDate, History history, int current, Offering offering)
    {
        this.semestDirct = semesterDirct;
        this.registDate = registDate;
        this.withwDate = withwDate;
        this.history = history; //will we be connecting the history class?
        this.current = current;
        this.offering = offering; 

    }

   
    ///Getters for private variables
    public int getSemestDirect()
    {
        return semestDirct;
    }

    public int getRegistDate()
    {
        return registDate;
    }

    public int getWithwDate()
    {
        return withwDate;
    }

    public int getHistory()
    {
       return history;
    }

    public int getCurrent()
    {
        return current;
    }

    public String getOffering()
    {
        return offering;
    }

     /*Setters for prvate varaibles -- Do we need setters? 
        Or are the constructors the setters*/

     public void setSemestDirect(int nSemestDirect)
     {
         this.semestDirct = nSemestDirect;
     }
 
     public void getregistDate(int nRegistDate)
     {
        this.registDate = nRegistDate;
     }
 
     public void withwDate(int nWithwDate)
     {
         this.withwDate = nWithwDate;
     }
 
     public void history(int nHistory)
     {
         this.history = nHistory;
     }
 
     public void current(int nCurrent)
     {
         this.current = nCurrent;
     }
 
     public void offering(String nOffering)
     {
         this.offering = nOffering;
     }
     /*
     ******FUNCTION IS UNFINISHED******
     As of creation the classes are not fully developed and exact functions/variables
     have yet to be decided, so this function will be mainly pseudocode until the classes
     are more developed
     */

     public void readData(File input)
     {
        // Assuming main has asked the user to provide the semester, this function is called by main
        // is this function reading in from a file like in data/history?
        // Also, we might make code much easier if we were to look into open source libraries for reading csv's
        // Following example https://www.javatpoint.com/how-to-read-csv-file-in-java
        String line = "";
        String splitBy =',';

        try
        {
            BufferedReader br = new BufferedReader(new FileReader(input));
            while((line = br.readLine()) != null)
            {
                // TEMP STRUCTURE, FIND WHAT INFORMATION IS ACTUALLY NEEDED AND SEE IF WE CAN'T SKIP OVER COLUMNS IF DATA ISN'T NEEDED
                // FIND OUT IF STRINGS ARE THE BEST FOR READING INPUT (SEE IF STRINGS IS EASILY CONVERTED; STRING -> INT, STRING -> RANDOM DATA TYPE)
                String[] tempRead = line.split(splitBy); // separate by commas, tempRead temporarily stores all data
                // there are 31 columns that actually contain data, the position in the array acts as a means of choosing a column
                // for example, CRN is column 2, assuming Course.java will store CRN we can store crn as
                // Course.setCrn() = tempRead[1];
                // and do that for each of the entries required
            }
        }
        catch (IOException e)
        {
            e.printStackTrace()
        }
        

     }

     
    }

   
