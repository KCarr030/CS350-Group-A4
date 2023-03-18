package edu.odu.cs.cs350.pne;

<<<<<<< HEAD
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
    
    private String offering; //Is offering  a string? 

    private int semestDirct, registDate, withwDate, history, current;
   
    
    //Constructor for integers and string variables
    public Semester(int semesterDirct, int registDate, int withwDate, int history, int current, String offering)
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

   
     
=======
public class Semester {
    lzdcns
>>>>>>> 720b8d66e84e81e8b86e48c024e0c67ec033dcf3
}
