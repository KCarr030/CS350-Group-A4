package edu.odu.cs.cs350.pne;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Section {
    private String campus;
    private String print;
    private String time;
    private String days;
    private String building;
    private String room;
	private String seats;
    private int CRN;
    private String subject;
    private String course;
    private String creditHours;
    private String crossListCapacity;
    private String enrollment;
    private String link;
    private String instructor;
    private String overallCapacity;
    private String overallEnrollment;
    private String ptrmStart;
    private String ptrmEnd;
    private int capacity;
	private int num;


//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//This constructor takes an array of Strings as a parameter, which represents the fields of a section in a university course catalog.
//It then assigns the values of each field to the corresponding instance variables of the Section object being constructed. 

	public Section(String[] fields) {	
        this.campus = fields[12];
        this.print = fields[14];
        this.time = fields[15];
        this.days = fields[16];
        this.building = fields[17];
        this.room = fields[18];
		this.seats = String.valueOf(Integer.parseInt(fields[0]));
        this.CRN = Integer.parseInt("0");
        this.subject = fields[2];
        this.course = fields[3];
        this.creditHours = fields[5];
        this.crossListCapacity = fields[6];
        this.enrollment = fields[7];
        this.link = fields[8];
        this.instructor = fields[20];
        this.overallCapacity = fields[22];
        this.overallEnrollment = fields[23];
        this.ptrmStart = fields[26];
        this.ptrmEnd = fields[27];
	}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//This is a constructor for creating a new Section object from an existing Section object. 
	//This is useful for creating copies of Section objects without altering the original object.
	public Section(Section section) {
        this.CRN = section.CRN;
        this.capacity = section.capacity;
        this.campus = section.campus;
        this.print = section.print;
        this.time = section.time;
        this.days = section.days;
        this.building = section.building;
        this.room = section.room;
        this.seats = section.seats;
        this.subject = section.subject;
        this.course = section.course;
        this.creditHours = section.creditHours;
        this.crossListCapacity = section.crossListCapacity;
        this.enrollment = section.enrollment;
        this.link = section.link;
        this.instructor = section.instructor;
        this.overallCapacity = section.overallCapacity;
        this.overallEnrollment = section.overallEnrollment;
        this.ptrmStart = section.ptrmStart;
        this.ptrmEnd = section.ptrmEnd;
    }
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//constructor
	//creates a new Section object with default values for all its instance variables. These default values are empty strings or zero values.
    public Section() {	
		link = "";
        campus = "";
        print = "";
        time = "";
        days = "";
        building = "";
        room = "";
        seats = "";
        CRN = "";
        subject = "";
        course = "000L";
        creditHours = "";
        crossListCapacity = "0";
        enrollment = "0";
        instructor = "";
        overallCapacity = "0";
        overallEnrollment = "0";
        ptrmStart = "";
        ptrmEnd = "";
}
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//defining a Comparator is to provide a custom way of sorting and comparing Section objects. 

    public static Comparator<Section> SnapCRN = new Comparator<Section>() {
        public int compare(Section s1, Section s2) {
            int crn1 = s1.getCRN();
            int crn2 = s2.getCRN();
            return crn1 - crn2;
        }
       };
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//compares two Section objects based on their "num" field, which is an integer representing the course number.
//The Comparator is defined as an anonymous inner class with the name "SnapNum".

    public static Comparator<Section> SnapNum = new Comparator<Section>() {
		public int compare(Section s1, Section s2) {
		   int num1 = s1.getNum();
		   int num2 = s2.getNum();
		   
		   return num1-num2;
	   }};

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//This method, math, calculating enrollment and capacity data for each course listed in the input ArrayList of Section objects, and then printing out the data in a formatted table.

	   public static void math(ArrayList<Section> data) {
		ArrayList<Section> alpha = new ArrayList<Section>();
		int sum = 0;
		int capSum = 0;
	
		char spec = ' ';
	
		int j = data.size();
		Collections.sort(data, Section.SnapCRN);
		Collections.sort(data, Section.SnapNum);
		for(int i = 0; i < data.size(); i++) {
			if(i+1 <= j-1) {
				if(data.get(i).getCourse().equals(data.get(i+1).getCourse())){
					sum = sum+data.get(i).getEnrollment();
					if (!Integer.valueOf(data.get(i).getCRN()).equals(Integer.valueOf(data.get(i + 1).getCRN()))){
						if (data.get(i).getCapacity() == 0) {
							data.get(i).setCapacity(i);
						}
						capSum = capSum + data.get(i).getCapacity();
					}
				}
				if(!data.get(i).getCourse().equals(data.get(i+1).getCourse())) {
	
					alpha.add(new Section(data.get(i)));
					alpha.get(alpha.size()-1).setEnrollment(sum);
					alpha.get(alpha.size()-1).setCapacity(capSum);
					sum = 0;
					capSum = 0;
				}
	
			}
			else
				alpha.add(data.get(j-1));
	
		}
		Collections.sort(alpha, Section.SnapNum);
	
		for(int i = 0; i < alpha.size(); i++) {
			System.out.print(spec + alpha.get(i).getCourse() + "/src/test/data/History/" + alpha.get(i).getEnrollment() + "/src/test/data/History/" + alpha.get(i).getCapacity() + "/src/test/data/History/");
		}
	}
	
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------


    public String getCourse() {
        return subject + course;
    }
	public String getTime() {
        return time;
    }
	
    public String getCampus() {
        return campus;
    }

	public String getBuilding() {
        return building;
    }

	public String getLink() {
        return link;
    }

	public String getDays() {
        return days;
    }

    public int getCourseNumber() {
        return Integer.parseInt(course.substring(0, 3));
    }

    public String getInstructor() {
        return instructor;
    }


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getCRN() {
        return CRN;
    }

    public int getEnrollment() {
        return Integer.parseInt(enrollment);
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = Integer.toString(enrollment);
    }

    public int getCapacity() {
        return Integer.parseInt(crossListCapacity);
    }

    public void setCapacity(int capacity) {
        this.crossListCapacity = Integer.toString(capacity);
    }

	public String getCrossListCapacity() {
        return crossListCapacity;
    }

	public String getPtrmStart() {
        return ptrmStart;
    }

    public String getPtrmEnd() {
        return ptrmEnd;
    }

}

