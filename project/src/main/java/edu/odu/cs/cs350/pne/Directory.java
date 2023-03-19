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
    private Vector<String> files = new Vector(10); // The filenames within the directory

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
        File root = new File(".");
        System.out.println(root.list());
        File f = new File(dir);
        System.out.println(f);
        String[] filearr = f.list();
        System.out.println(filearr);
        for (String names : filearr) {
            System.out.println(names);
            files.add(names);
        }
    }

    /**
     * printContents is a function for checking output
     * its sole purpose is to print the content of the directory
     * to the CLI
     */
    public void printContents() {
        for (String name : files) {
            System.out.println(name);
        }
    }

    /**
     * getFileName returns the name of a file inside the directory
     * it DOES NOT give the full path to said file
     * 
     * @param index the index of the requested file
     * @return the name of the file, "" if invalid
     */
    public String getFileName(int index) {
        if (index >= 0 && index < files.size()) {
            return files.elementAt(index);
        }
        return "";
    }

    /**
     * getFilePath returns the path to a file inside
     * the directory
     * 
     * @param index the index of the requested file
     * @return the full path to the file
     */
    public String getFilePath(int index) {
        String name = getFileName(index);
        return dir + '/' + name;
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
}
