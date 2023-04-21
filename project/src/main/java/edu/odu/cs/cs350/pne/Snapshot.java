package edu.odu.cs.cs350.pne;
import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import edu.odu.cs.cs350.pne.Read;
import edu.odu.cs.cs350.pne.Section;


public class Snapshot {
    private LocalDate date;
    private ArrayList<Section> sections;

    public Snapshot() {
        this.date = null;
        this.sections = new ArrayList<>();
    }

    public Snapshot(Path filePath) {
        this.date = getDateFromFileName(filePath.getFileName().toString());
        this.sections = Read.csvReadFunction(filePath.toFile());
    }

    public Snapshot(URL url) {
        this.date = null; 
        this.sections = Read.csvReadFunction(url);
    }

    public LocalDate getDate() {
        return this.date;
    }

    public ArrayList<Section> getSections() {
        return this.sections;
    }

    public Section getSection(int index) {
        return this.sections.get(index);
    }

    private LocalDate getDateFromFileName(String fileName) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(fileName.substring(0, 10), formatter);
    }

    public static void main(String[] args) {
        // Create a new Section object
        Section section = new Section("Example Section");

        // Call the getName() method on the Section object
        String name = section.getName();
        System.out.println("Section name: " + name);
    }
}