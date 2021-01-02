package uk.ac.brunel.cs1702;

public class GradeCalculator {

	//Declare all required Fields here as explained in the worksheet A1.
	
	public static final double W1 = 0.10;

	public static final double W2 = 0.10;

	public static final double W3 = 0.15;

	public static final double W4 = 0.15;

	public static final double W5 = 0.25;

	public static final double W6 = 0.25;
	
	public static final double[] arrayW = {W1, W2, W3, W4, W5, W6};
	
	public static double a1;
	
	public static double a2;
	
	public static double a3;
	
	public static double a4;
	
	public static double a5;
	
	public static double a6;
	
	public static String v1;
	
	public static String v2;
	
	public static void main(String[] args) {
	//Implement your program logic here to process the Fields declared above.
	//Feel free to declare additional local variables in the main method.
	//Feel free to create other methods and call them from the main method.
	//Your program will be assessed based on its output as explained in the worksheet A1.
		
		double aMarks = assignMarks();
		String vGrade = vivaGrade();
		boolean sndClause = clauseTwo();
		String finalGrade = "";
		
		System.out.println("Total marks: " + aMarks);
		System.out.println("Viva grade: " + vGrade);
		
		if(aMarks>=70 && "A".compareToIgnoreCase(vGrade)>=0 && sndClause == true) {
			finalGrade = "A";
		}
		else if(aMarks>=60 && "B".compareToIgnoreCase(vGrade)>=0 && sndClause == true) {
			finalGrade = "B";
		}
		else if(aMarks>=50 && "C".compareToIgnoreCase(vGrade)>=0) {
			finalGrade = "C";
		}
		else if(aMarks>=40 && "D".compareToIgnoreCase(vGrade)>=0) {
			finalGrade = "D";
		}
		else
			finalGrade = "F";
		
		System.out.println("Final grade: " + finalGrade);
	}
	
	public static double assignMarks() {
		int i; double marks = 0;
		for(i=0;i<6;i++)
			marks+=arrayA(i)*arrayW[i];
			return marks;
	}
	
	public static double arrayA(int i) {
		double[] arrayA = {a1, a2, a3, a4, a5, a6};
		return arrayA[i];
	}
	
	public static String vivaGrade(){
		if(v1.compareToIgnoreCase(v2)<0)
			return v1;
			return v2;
	}
	
	public static boolean clauseTwo() {
		if(arrayA(4)>=40 && arrayA(5) >= 40)
			return true;
			return false;
		
		}
		
	}
