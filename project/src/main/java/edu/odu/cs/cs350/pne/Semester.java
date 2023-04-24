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
    
    private Offering offering; // not needed potentially?
    private Directory semestDirct; // don't know if we needed a list of directory -nolan
    private History history;

    private String registDate, withwDate, current;
   
    
    //Constructor for integers and string variables
    public Semester(Directory semesterDirct, String registDate, String withwDate, History history, String current, Offering offering)
    {
        
        this.registDate = registDate;
        this.withwDate = withwDate;
        this.current = current;
        this.semestDirct = semesterDirct;
        this.history = history;
        this.offering = offering;
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

    public History getHistory()
    {
       return history;
    }

    public String getCurrent()
    {
        return current;
    }

    public  Offering getOffering()
    {
        return offering;
    }

    

    

   


     public void readData()
     {
        Vector<File> tempRead = this.semestDirct.getFiles();

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
                    String[] selected = curLine.split(","); // splits line into separate strings by comma
                    Section tempOff = new Section(selected);
                    //sections.add(tempOff); // quickly switched to sections
                }
                scanner.close();
                
            }
            catch (java.io.FileNotFoundException e)
            {
                System.err.println("Error in finding files");
                System.exit(1);
            }
        }
        

     
    }

}

   
