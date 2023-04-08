package edu.odu.cs.cs350.pne;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.io.File;

/**
 * This is the Directory class
 * 
 * @author Group A4
 *         The Directory class is responsible for storing the list of files and
 *         their paths for a SINGLE directory.
 */

public class Directory {

    private String dir; // The directory selected
    private Vector<File> files = new Vector(10); // The filenames within the directory

    /**
     * Constructor of Directory takes a directory path as input
     * 
     * @param d A path leading to a directory (ex. /data/History/202010)
     */
    public Directory(String d) {
        this.dir = d;
        grabFiles();
    }

    /**
     * setDirectory sets the directory currently stored
     * 
     * @param d the directory to store
     */
    public void setDirectory(String d) {
        this.dir = d;
        grabFiles();
    }

    /**
     * grabFiles fills the Vector files with the names of all files
     * currently contained in the directory specified by dir.
     * 
     * DO NOT call this function directly,
     * it is meant to be called by other functions
     * to update existing data,
     * and will be called automatically when needed in
     * this class.
     */
    public void grabFiles() {
        files.clear(); /// The vector needs to be emptied prior to refilling with new data
        File d = new File(dir);
        // System.out.println(d);
        // System.out.println(d.listFiles());
        File[] filearr = d.listFiles();
        // System.out.println(filearr);
        for (File names : filearr) {
            // System.out.println(names);
            files.add(names);
        }
    }

    /**
     * printContents is a function for checking output
     * its sole purpose is to print the content of the directory
     * to the CLI
     */
    public void printContents() {
        for (File name : files) {
            System.out.println(name.getName());
        }
    }

    /**
     * getFileName returns the name of a file inside the directory
     * it DOES NOT give the full path to said file
     * 
     * @param index the index of the requested file
     * @return the name of the file, null if invalid
     */
    public String getFileName(int index) {
        if (index >= 0 && index < files.size()) {
            return files.elementAt(index).getName();
        }
        return null;
    }

    /**
     * getFilePath returns the path to a file inside
     * the directory
     * 
     * @param index the index of the requested file
     * @return the File describing the full path to the file
     */
    public File getFilePath(int index) {
        String name = getFileName(index);
        return new File(dir + '/' + name);
    }

    /**
     * the size of the directory
     * measured by the number of files inside
     * 
     * @return the number of files inside the directory
     */
    public int dirSize() {
        return files.size();
    }

    public String getPath() {
        return dir;
    }

    /**
     * Returns the index of the dates.txt file within the File array
     * 
     * @return the index of dates.txt, -1 if it does not exist
     */
    public int datesIndex() {
        for (int x = dirSize() - 1; x >= 0; x--) {
            if (files.get(x).getName().equals("dates.txt")) {
                return x;
            }
        }
        return -1;
    }

    /**
     * Removes all data stored in the vector earlier than a date specified
     * 
     * @param lower The lower bound indicated in the format YYYY-MM-DD
     */
    public void trimStartDate(String lower) {
        for (int i = dirSize() - 1; i >= 0; i--) {
            if (files.get(i).getName().compareTo(lower) < 0) {
                files.remove(i);
            }
        }
    }

    /**
     * Removes all data stored in the vector later than a date specified
     * 
     * @param upper The upper bound indicated in the format YYYY-MM-DD
     */
    public void trimEndDate(String upper) {
        for (int i = dirSize() - 1; i >= 0; i--) {
            if (files.get(i).getName().compareTo(upper) > 0 && !(files.get(i).getName().equals("dates.txt")
                    || files.get(i).getName().equals("dates.txt~"))) {
                files.remove(i);
            }
        }
    }

    /**
     * 
     * @param lower The lower bound indicated in the format YYYY-MM-DD
     * @param upper The upper bound indicated in the format YYYY-MM-DD
     */
    public void trimDates(String lower, String upper) {
        trimStartDate(lower);
        trimEndDate(upper);
    }
}
