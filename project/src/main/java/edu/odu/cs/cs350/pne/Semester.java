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
    
    // Took nolans reccomendation--list -jodi
    private List<Offering> offering; // changed offering to offering class
    private List<Directory> semestDirct; // changed directory to directory class, please get back to me about whether this directory is same as directory in directory class
    private List<History> history; // changed history to history class

    private String registDate, withwDate, current;  //Current is int?  Wouldn't current be another semester object? -nolan
    //Waiting for elaboration
   
    
    //Constructor for integers and string variables
    public Semester(Directory semesterDirct, String registDate, String withwDate, History history, String current, Offering offering)
    {
        
        this.registDate = registDate;
        this.withwDate = withwDate;
        this.current = current;
    }

   
    ///Getters for private variables
    public List<Directory> getSemestDirect()
    {
        return semestDirct;
    }

    public String getRegistDate()
    {
        return registDate;
    }

    public String getWithwDate()
    {
        return withwDate;
    }

    public List<History> getHistory()
    {
       return history;
    }

    public String getCurrent()
    {
        return current;
    }

    public  List<Offering> getOffering()
    {
        return offering;
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
                //Course.setCrn() = tempRead[1];
                // and do that for each of the entries required
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

     }

     
    }

   
