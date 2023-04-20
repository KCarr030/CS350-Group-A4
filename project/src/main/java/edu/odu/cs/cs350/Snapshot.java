package edu.odu.cs.cs350;
import java.io.File;
import java.util.ArrayList;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import edu.odu.cs.cs350.pne.Projection;
import edu.odu.cs.cs350.pne.Section;


public class Snapshot {
    private LocalDate date;
    private ArrayList<Section> sections;

    public Snapshot() {
        date = null;
        sections = new ArrayList<Section>();
    }

    public Snapshot(File f) {
        String fileName = f.getName();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(fileName, formatter);
        this.date = date;
        this.sections = Projection.historicalEnrollment(f);
    }

    public Snapshot(URL u) {
        this.date = null; 
        this.sections = Projection.getAllSections(u);
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
}