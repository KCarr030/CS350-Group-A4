package edu.odu.cs.cs350.pne;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; // new class import for reading
import java.util.Vector;
import java.util.Collections;
import java.io.File;

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
    
    private List<Offering> offering;
    private Directory semestDirct; // don't know if we needed a list of directory -nolan
    private List<History> history;

    private String registDate, withwDate, current;
   
    
    //Constructor for integers and string variables
    public Semester(Directory semesterDirct, String registDate, String withwDate, History history, String current, Offering offering)
    {
        
        this.registDate = registDate;
        this.withwDate = withwDate;
        this.current = current;
    }

   
    ///Getters for private variables
    public Directory getSemestDirect()
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
     public void readData()
     {
        Vector<File> tempRead = this.semestDirct.files; // private member error, fix in next sprint

        for(File itr : tempRead)
        {
            try
            {
                Scanner scanner = new Scanner(itr); // new scanner
                scanner.nextLine();
                while(scanner.hasNextLine())
                {
                    String curLine = scanner.nextLine();
                    curLine = curLine.trim();
                    String[] selected = curLine.split("",""); // splits line into separate strings by comma, causes error
                    Offering tempOff = new Offering(selected);
                    offering.add(tempOff);
                }
                scanner.close();
                
            }
            catch (FileNotFoundException e) // cannot find symbol error
            {
                System.err.printIn("Error in finding files"); // cannot find symbol error
                System.exit(1);
            }
        }

     
    }
    */
}

   
