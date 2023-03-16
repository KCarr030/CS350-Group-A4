package edu.odu.cs.cs350.pne;

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
            this.offerings = new ArrayList<>(); 
        }

        // Getters
        public String getName() {
            return name;
        }

        public List<Offering> getOfferings() {
            return offerings;
        }

        // Add an offering to the course
        public void addOffering(Offering offering) {
            if (!offerings.contains(offering)) {
                offerings.add(offering); 
        }
    }
 }
