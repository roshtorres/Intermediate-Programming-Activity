package _3StudentPackage;
import java.util.Scanner;
import java.text.DecimalFormat;

public class AcadInfo 
{
	public static int studentNumber;
	public static double studentGradeAverage;
	public static int studentAttendance;
	
	public static void Acadinfo()
	{
		Scanner input = new Scanner(System.in);
		
		//STUDENT EDUCATIONAL DETAILS INPUT
		System.out.println("\nSTUDENT EDUCATIONAL DETAILS");
		
		//Student Number
		System.out.print("Student Number: ");
		studentNumber = input.nextInt();
		
		//Student Grade Average
		System.out.print("Quiz 1 Grade: ");
		int quiz1Grade = input.nextInt();
		
		System.out.print("Quiz 2 Grade: ");
		int quiz2Grade = input.nextInt();
		
		System.out.print("Midterm Grade: ");
		double midtermGrade = input.nextDouble();
		
		System.out.print("Finals Grade: ");
		double finalsGrade = input.nextDouble();
		
		studentGradeAverage = ((quiz1Grade + quiz2Grade + midtermGrade + finalsGrade)/4);
		
		//Student Attendance
		System.out.print("Student Attendance: ");
		studentAttendance = input.nextInt();

	}
	
	public static void displayEducDetails()
	{
		DecimalFormat df = new DecimalFormat("##.00");
		
		//STUDENT EDUCATIONAL DETAILS OUTPUT
		System.out.println("\nSTUDENT EDUCATIONAL DETAILS");
		
		System.out.println("Student Number: " + studentNumber);
		System.out.println("Student Grade Average: " + df.format(studentGradeAverage));
		System.out.println("Student Attendance: " + studentAttendance + "%");
	}

}
