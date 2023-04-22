package edu.odu.cs.cs350.pne;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;


/** This is the Snapshot class
 * @author Group A4
 * 
 */

 /**
 * It represents a snapshot of the sections and their details at a particular date.
 * It can read data from a CSV file or a URL, and create a list of Section objects from the data.
 * It can also get the date from the name of the CSV file, and retrieve the list of sections and their details.
 */


 public class Snapshot {
    private LocalDate date; // The date of the snapshot
    private ArrayList<Section> sections = new ArrayList<>(); // A list of sections
    private LocalDate cutoffDate; // The cutoff date beyond which snapshot date is ignored

 

     /**
     * Constructs a new Snapshot object with a null date and an empty list of sections.
     */
    public Snapshot() {
        this.date = null;
        this.sections = new ArrayList<>();
    }


    /**
     * Constructs a new Snapshot object by reading data from a CSV file.
     * @param filePath The path to the CSV file.
     * @throws IOException if there is an error reading the file.
     */
    public Snapshot(Path filePath) throws IOException {
        Read.file = filePath.toString();
        Read.csvReadFunction();
        sections = Read.sections;
    }


     /**
     * Constructs a new Snapshot object by reading data from a URL.
     * @param url The URL of the CSV file.
     * @throws IOException if there is an error reading the file.
     */
    public Snapshot(URL url) throws IOException {
        Read.file = url.toString();
        Read.csvReadFunction();
        sections = Read.sections;
    }


    /**
     * Returns the date of the snapshot.
     * @return The date of the snapshot.
     */
    public LocalDate getDate() {
        return this.date;
    }


    /**
     * Returns the list of sections and their details.
     * @return The list of sections and their details.
     */
    public ArrayList<Section> getSections() {
        return sections;
    }

     /**
     * Sets the list of sections and their details.
     * @param sections The list of sections and their details.
     */
    public void setSections(ArrayList<Section> sections) {
        this.sections = sections;
    }

    /**
     * Gets the date of the snapshot from the name of the CSV file.
     * @param fileName The name of the CSV file.
     * @return The date of the snapshot.
     */
    public LocalDate getLocalDateFromFileName(String fileName) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(fileName.substring(0, 10), formatter);
    }

    /**
     * The Read class contains a static method for reading data from a CSV file
     * and creating Section objects from the data.
     */
    private static class Read {
        static String file;
        static ArrayList<Section> sections = new ArrayList<>();

        /**
         * Reads data from a CSV file and creates Section objects from the data.
         * The Section objects are added to the sections list.
         * @throws IOException if there is an error reading the file.
         */
        public static void csvReadFunction() throws IOException {
            BufferedReader br = new BufferedReader(new FileReader(file));
                String line = "";
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(",");
                    String sectionName = data[0];
                    int sectionNumber = Integer.parseInt(data[1]);
                    // create a new Section object and add it to the sections list
                    //sections.add(new Section(sectionName, sectionNumber));
                }
                br.close();
            }
    }

     /**
     * A main method for testing the Section class.
     */
    public static void main(String[] args) {
        // Create a new Section object
        Section section = new Section("Example Section");

        // Call the getName() method on the Section object
        String name = section.getName();
        System.out.println("Section name: " + name);
    }
}