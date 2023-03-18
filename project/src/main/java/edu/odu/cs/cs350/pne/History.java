package edu.odu.cs.cs350.pne;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/** This class is where the historical information format is stored. 
 * @author Group A4
 * 
 */

 public class History {
    
    //Components for the History class
    private int CRN, CRSE, StudCap, StudEnr, StudEnrCap, TotalStudEnr; 
    //CRN, Course Number, Max students per class, Number enrolled, Max students per section, total students enrolled section
    private String Subj, CrseName, Link, XLSTGroup;
    //Department, CourseName, lec/recit/lab, sections of a course for offering

        //Constructors
        public History(int CRN, int CRSE, int StudCap, int StudEnr, int StudEnrCap, int TotalStudEnr) {
            this.CRN = CRN;
            this.CRSE = CRSE;
            this.StudCap = StudCap;
            this.StudEnr = StudEnr;
            this.StudEnrCap = StudEnrCap;
            this.TotalStudEnr = TotalStudEnr;
        }

        public History(String Subj, String CrseName, String Link, String XLSTGroup) {
            this.Subj = Subj;
            this.CrseName = CrseName;
            this.Link = Link;
            this.XLSTGroup = XLSTGroup;
        }

        //Getters for the historical data components
        public int getCRN() {
            return CRN;
        }

        public int getCRSE() {
            return CRSE;
        }

        public int getStudentCap() {
            return StudCap;
        }

        public int getStudentEnrolled() {
            return StudEnr;
        }

        public int getStudentEnrollmentCap() {
            return StudEnrCap;
        }

        public int getTotalStudentsEnrolled() {
            return TotalStudEnr;
        }

        public String getSubject() {
            return Subj;
        }

        public String getCourseName() {
            CrseName = Subj + CRSE;
            return CrseName;
        }

        public String getLink() {
            return Link;
        }

        public String getXLSTGroup() {
            return XLSTGroup;
        }
 }