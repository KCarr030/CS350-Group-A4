package edu.odu.cs.cs350.pne;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * This is the CSV file read class
 * 
 * @author Group A4
 *     
 *         
 */

public class Read {
    static String file;
    static ArrayList<Section> sections = new ArrayList<>();
    // Function for reading CSV files and setting each file as a section object. 
    public static void csvReadFunction() throws IOException{
        FileReader fileReader = new FileReader(file);
        CSVReader csvRead = new CSVReaderBuilder(fileReader).withSkipLines(1).build();
        String[] numLine;
        try{
            while ((numLine = csvRead.readNext()) != null){
                Section currentSection = new Section(numLine);
                sections.add(currentSection);
            }
        }catch (CsvValidationException e){
            e.printStackTrace();
        }
        csvRead.close();
        fileReader.close();
    }
}