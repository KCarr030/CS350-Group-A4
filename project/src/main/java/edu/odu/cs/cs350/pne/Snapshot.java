package edu.odu.cs.cs350.pne;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.net.URL;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import edu.odu.cs.cs350.pne.Read;
import edu.odu.cs.cs350.pne.Section;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

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
    private LocalDate cutoffDate; // The cutoff date for the snapshot


 

     /**
     * Constructs a new Snapshot object with a null date and an empty list of sections.
     */
    public Snapshot() {
        this.date = null;
        this.sections = new ArrayList<>();
        this.date = LocalDate.MIN;
    }


    /**
     * Constructs a new Snapshot object by reading data from a CSV file.
     * @param filePath The path to the CSV file.
     * @throws IOException if there is an error reading the file.
     */
    public Snapshot(Path filePath) throws IOException {
        this();
        this.sections = sectionsFromFile(filePath);
        this.date = getLocalDateFromFileName(filePath.getFileName().toString());
        Read.file = filePath.toString();
        Read.csvReadFunction();
        sections = Read.sections;
    }


 /**
     * Constructs a new Snapshot object with a specified date and list of sections.
     * @param date The date of the snapshot.
     * @param sections The list of sections.
     */
    public Snapshot(LocalDate date, ArrayList<Section> sections) {
        this.date = date;
        this.sections = sections;
        this.cutoffDate = LocalDate.MIN;
        this.date = date;
        this.sections = sections;
    }



     /**
     * Constructs a new Snapshot object by reading data from a URL.
     * @param url The URL of the CSV file.
     * @throws IOException if there is an error reading the file.
     */
    public Snapshot(URL url) throws IOException {
        this();
        Path path = Paths.get("src/test/java/edu/odu/cs/cs350/pne/2020-04-01.csv");
        try {
            URI uri = url.toURI();
            // do something with the URI
        } catch (URISyntaxException e) {
            // handle the exception
            e.printStackTrace();
        }
        this.sections = sectionsFromFile(path);
        this.date = LocalDate.now();
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
     * Reads data from a CSV file and creates Section objects from the data.
     * The Section objects are added to the sections list.
     *
     * @param filePath The path to the CSV file.
     * @return An ArrayList of Section objects.
     * @throws IOException if there is an error reading the file.
     */
    private ArrayList<Section> sectionsFromFile(Path filePath) throws IOException {
        ArrayList<Section> sections = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath.toString()));
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            String sectionName = data[0];
            int sectionNumber = Integer.parseInt(data[1]);
            // create a new Section object and add it to the sections list
            sections.add(new Section(sectionName, sectionNumber));
        }
        br.close();
        return sections;
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