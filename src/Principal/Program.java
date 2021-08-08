package Principal;

import java.util.Locale;
import java.util.Scanner;

import util.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		Student student = new Student();

		student.name = sc.nextLine();
		student.gradeA = sc.nextDouble();
		student.gradeB = sc.nextDouble();
		student.gradeC = sc.nextDouble();

		System.out.println();
		System.out.println("FINAL GRADE " + student.name + " = " + String.format("%.2f", student.sumFinal()));
		System.out.println(student.gradeFinal());

		if (student.gradeFinal() != "PASS") {
		System.out.println("MISSING " + String.format("%.2f", student.missingGrade()) + " POINTS");
		}

		sc.close();

	}

}
