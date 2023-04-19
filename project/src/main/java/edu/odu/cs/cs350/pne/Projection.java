package edu.odu.cs.cs350.pne;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/** This is the class
 * @author Group A4
 * 
 */

 public class Projection {
    public static void main(String[] args){
        System.out.println("Enter 6-digit directory code(s) or path to write detailed projection report");

        if (args.length == 1) {
            // Call projectionSem for a single directory code entry.
            // NEED to change this to include the possibility of path to file location for detailed report.
            projectionSem(args[0]);
        } else if (args.length > 1) {
            // Call historicalEnrollment for multiple directory codes being entered.
            historicalEnrollment(args);
        } 
    }

    // Function that takes a list of semester directories, indicating the location of historical enrollment data.
    public static void historicalEnrollment(String[] dirCodes){
        // Error message if the code is not 6 digits.
        for (String dirCode : dirCodes){
            if (dirCode.length() != 6) {
                System.out.println(dirCode + " is an invalid directory code...");
                continue;
            }
            String dirPath = "/src/test/data/History/" + dirCode;
            Directory dir = new Directory(dirPath);
            dir.setDirectory(dirPath);
            List<File> snapshots = dir.getFiles();
        }
            
    }

    // Function for a single directory location that indicates enrollment data for the semester for which a projection is desired.
    // Summary projection will be output.
    public static void projectionSem(String dirCode){
        
        // error message if the code is not 6 digits.
        if (dirCode.length() != 6) {
            System.out.println(dirCode + " is an invalid directory code...");
        }
        String dirPath = "/src/test/data/History" + dirCode;
        // Check if the dates.txt file is in the directory.
        File datesFile = new File(dirPath + "/dates.txt");
        if (!datesFile.exists()){
            System.out.println("Error: dates.txt file not in directory " + dirPath);
            return;
        }
        Directory dir = new Directory(dirPath);
        dir.setDirectory(dirPath);
        Vector<File> files = dir.getFiles();
        // Read dates.txt to find the pre-registration date and add deadline date.
        LocalDate preReg = null;
        LocalDate addDeadline = null;
        String preRegString;
        String addDeadlineString;
        try (Scanner scanner = new Scanner(datesFile)){
            preRegString = scanner.nextLine().trim();
            addDeadlineString = scanner.nextLine().trim();
            preReg = LocalDate.parse(preRegString);
            addDeadline = LocalDate.parse(addDeadlineString);
        } catch (FileNotFoundException e){
            return;
        }
        // Exclude the dates that are not needed.
        dir.trimDates(preRegString, addDeadlineString);
        files = dir.getFiles();
        // Loop through files and set data.
        for(int i = 0; i < files.size(); i++){
            
        }
        
    }

    // Function that will allow a user to indicate a path for the file location where the detailed projection will be written.
    public void detailedProjection(){


    }
}



 