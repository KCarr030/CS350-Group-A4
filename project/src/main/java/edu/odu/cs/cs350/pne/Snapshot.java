package edu.odu.cs.cs350.pne;
import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.net.URL;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import edu.odu.cs.cs350.pne.Read;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;


/** This is the Snapshot class
 * @author Group A4
 * 
 */


 public class Snapshot {
    private LocalDate date;
    private ArrayList<Section> sections = new ArrayList<>();

    public Snapshot() {
        this.date = null;
        this.sections = new ArrayList<>();
    }

    public Snapshot(Path filePath) throws IOException {
        Read.file = filePath.toString();
        Read.csvReadFunction();
        sections = Read.sections;
    }

    public Snapshot(URL url) throws IOException {
        Read.file = url.toString();
        Read.csvReadFunction();
        sections = Read.sections;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public ArrayList<Section> getSections() {
        return sections;
    }

    public void setSections(ArrayList<Section> sections) {
        this.sections = sections;
    }

    public LocalDate getLocalDateFromFileName(String fileName) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(fileName.substring(0, 10), formatter);
    }

    private static class Read {
        static String file;
        static ArrayList<Section> sections = new ArrayList<>();

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

    public static void main(String[] args) {
        // Create a new Section object
        Section section = new Section("Example Section");

        // Call the getName() method on the Section object
        String name = section.getName();
        System.out.println("Section name: " + name);
    }
}