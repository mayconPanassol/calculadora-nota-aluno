package util;

public class Student {

	public double gradeA;
	public double gradeB;
	public double gradeC;
	public String name;

	public String gradeFinal() {

		if (gradeA + gradeB + gradeC > 60.00) {
			return "PASS";
		} else {
			return "FAILED";
		}
	}

	public double missingGrade() {

		return 60.00 - (gradeA + gradeB + gradeC);

	}

	public double sumFinal() {
		return gradeA + gradeB + gradeC;
	}
	
	
}
