package edu.odu.cs.cs350.pne;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Section {
    public String overall_cap;
	public String overall_enr;
	public String ptrm_start;
	public String ptrm_end;
	public String notes;
	public String comments;
    public String seats;
	public String CRN;
	public String subj;
	public String crse;
	public String cr_hrs;
	public String xlst_cap;
	public String enr;
	public String link;
	public String campus;
	public String print;
	public String time;
	public String days;
	public String bldg;
	public String room;
	public String instructor;


    	
	public Section(String[] fields) {	
        campus = fields[12];	
		print = fields[14];
		time = fields[15];
		days = fields[16];
		bldg = fields[17];
		room = fields[18];	
		seats = fields[0];
		CRN = fields[1];
		subj = fields[2];
		crse = fields[3];
		cr_hrs = fields[5];
		xlst_cap = fields[6];	
		enr = fields[7];
		link = fields[8];
		instructor = fields[20];
		overall_cap = fields[22];	
		overall_enr = fields[23];
		ptrm_start = fields[26];
		ptrm_end = fields[27];
	}

    public static Comparator<Section> SnapCRN = new Comparator<Section>() {
        public int compare(Section x, Section j) {
           int num1 = x.getCRNum();
           int num2 = j.getCRNum();
           
           return num1-num2;
       }};

    public static Comparator<Section> SnapNum = new Comparator<Section>() {
		public int compare(Section s1, Section s2) {
		   int num1 = s1.getNum();
		   int num2 = s2.getNum();
		   
		   return num1-num2;
	   }};

	public String getCrse() {	
		return crse;
	}

    public int getNum() {
		int i = Integer.parseInt(crse.substring(0,3));
		return i;
	}
    public String getInstructor() {
        return instructor;
    }
	public String getCourse() {
		return (subj+crse);
	}
	public int getCRNum() {
		int i = Integer.parseInt(CRN);
		return i;
	}
    public int getEnr() {
		return Integer.parseInt(enr);
	}
 	
	public void setEnr(int x) {
		this.enr = String.valueOf(x);
	}
    public String getCap() {
		return overall_cap;
	}
    public void setCap(int x) {
		this.overall_cap = String.valueOf(x);
	}

    public String getCRN() {
		return CRN;
	}

    public String getSubj() {
		return subj;
	}
}

