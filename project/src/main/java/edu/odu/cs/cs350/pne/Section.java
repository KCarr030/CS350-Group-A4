package edu.odu.cs.cs350.pne;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Section {
    private String overallCapacity;
    private String overallEnrollment;
    private String ptrmStart;
    private String ptrmEnd;
    private String notes;
    private String comments;
    private String seats;
    private String CRN;
    private String subject;
    private String course;
    private String creditHours;
    private String crossListCapacity;
    private String enrollment;
    private String link;
    private String campus;
    private String print;
    private String time;
    private String days;
    private String building;
    private String room;
    private String instructor;
    private int num;





    	
	public Section(String[] fields) {	
		this.campus = fields[12];
        this.print = fields[14];
        this.time = fields[15];
        this.days = fields[16];
        this.building = fields[17];
        this.room = fields[18];
        this.seats = fields[0];
        this.CRN = fields[1];
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

    public Section() {	
		link = "";
        campus = "";
        print = "";
        time = "";
        days = "";
        building = "";
        room = "";
        seats = "";
        CRN = "0";
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
        notes = "";
        comments = "";
}

    public static Comparator<Section> SnapCRN = new Comparator<Section>() {
        public int compare(Section s1, Section s2) {
            int crn1 = s1.getCRN();
            int crn2 = s2.getCRN();
            return crn1 - crn2;
        }
       };

    public static Comparator<Section> SnapNum = new Comparator<Section>() {
		public int compare(Section s1, Section s2) {
		   int num1 = s1.getNum();
		   int num2 = s2.getNum();
		   
		   return num1-num2;
	   }};

	   public static void mathFR(ArrayList<Section> data) {
		ArrayList<Section> alpha = new ArrayList<Section>();
		int sum = 0;
		int capSum = 0;
		char spec = ' ';
	
		Collections.sort(data, Section.SnapCRN);
		Collections.sort(data, Section.SnapNum);
	
		for(int i = 0; i < data.size(); i++) {
			Section current = data.get(i);
			if(i + 1 < data.size() && current.getCourse().equals(data.get(i+1).getCourse())) {
				sum += current.getEnr();
				if(!current.getCRN().equals(data.get(i+1).getCRN())){
					int currentCap = 0;
					try {
						currentCap = Integer.parseInt(current.getCap());
					} catch (NumberFormatException e) {
						// catch exception in case the cap field is empty or not a number
					}
					capSum += currentCap;
				}
			} else {
				// create new section instance with the aggregated data
				int currentCap = 0;
				try {
					currentCap = Integer.parseInt(current.getCap());
				} catch (NumberFormatException e) {
					// catch exception in case the cap field is empty or not a number
				}
				alpha.add(new Section(new String[] {
						current.getSeats(),
						current.getCRN(),
						current.getSubj(),
						current.getCrse(),
						current.getCampus(),
						current.getDays(),
						current.getCrHrs(),
						String.valueOf(sum),
						current.getLink(),
						"",
						current.getInstructor(),
						"",
						"",
						"",
						"",
						"",
						"",
						"",
						"",
						"",
						"",
						String.valueOf(currentCap),
						"",
						String.valueOf(capSum),
						"",
						"",
						current.getPtrmStart(),
						current.getPtrmEnd(),
						"",
						"",
						current.getBldg(),
						"",
						current.getRoom(),
						"",
						"",
						"",
						"",
						"",
						""
				}));
				sum = current.getEnr();
				capSum = currentCap;
			}
		}
	
		Collections.sort(alpha, Section.SnapNum);
	
		for(int i = 0; i < alpha.size(); i++) {
			System.out.print(spec + alpha.get(i).getCourse() + "\t" + alpha.get(i).getEnr() + "\t\t\t\t" + alpha.get(i).getCap() + "\n");
		}
	}
	

    public String getCourseCode() {
        return subj + crse;
    }

    public int getCourseNumber() {
        return Integer.parseInt(crse.substring(0, 3));
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
        return Integer.parseInt(CRN);
    }

    public int getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

