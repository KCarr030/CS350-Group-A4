package edu.odu.cs.cs350.pne;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/** This is the class
 * @author Group A4
 * 
 */

 public class Course {
      // Course properties
    private String name;
    private List<Offering> offerings;

    // Constructor
        public Course(String name) {
            this.name = name; 
        }

        public String getName() {
            return name;
        }
        public List<Offering> getOfferings() {
            return offerings;
        }
        public void addOffering(Offering offering) {
            offerings.add(offering);
        }
        public int getCourseEnrollment() {
            int totalEnrollment = 0;
            for (Offering offering : offerings) {
                totalEnrollment += offering.getEnrollment();
            }
            return totalEnrollment;
        }
 }
