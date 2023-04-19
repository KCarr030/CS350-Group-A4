package edu.odu.cs.cs350.pne;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Section {
    public String seats;
	public String CRN;
	public String subj;
	public String crse;
	public String title;
	public String cr_hrs;
	public String xlst_cap;
	public String enr;
	public String link;
	public String xlst_group;
	public String sched_type;
	public String campus;
	public String insm;
	public String print;
	public String time;
	public String days;
	public String bldg;
	public String room;
	public String override;
	public String instructor;
	public String overall_cap;
	public String overall_enr;
	public String ptrm_start;
	public String ptrm_end;
	public String wl_cap;
	public String wl;
	public String wl_remain;
	public String notes;
	public String comments;
	public String coll;	
}
    	
	public Section(String[] fields) {		
		seats = fields[0];
		CRN = fields[1];
		subj = fields[2];
		crse = fields[3];
		title = fields[4];
		cr_hrs = fields[5];
		xlst_cap = fields[6];	
		enr = fields[7];
		link = fields[8];
		xlst_group = fields[9];
		sched_type = fields[10];
		campus = fields[12];	
		insm = fields[13];
		print = fields[14];
		time = fields[15];
		days = fields[16];
		bldg = fields[17];
		room = fields[18];
		override = fields[19];
		instructor = fields[20];
		overall_cap = fields[22];	
		overall_enr = fields[23];
		ptrm_start = fields[26];
		ptrm_end = fields[27];
		wl_cap = fields[28];
		wl = fields[29];
		wl_remain = fields[30];
	}


	public String getCrse() {	
		return crse;
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
