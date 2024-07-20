package _1MainPackage;
import _2EmployeePackage.*;
import _3StudentPackage.*;
import java.util.Scanner;

public class MainProgram 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int numOfStudents = 2;
		
		for(int a = 1; a <= numOfStudents; a++)
		{
			//STUDENT DETAILS INPUT
			System.out.println("STUDENT DETAILS");
		
			System.out.print("Student Name: ");
			String studentName = input.nextLine();
			
			System.out.print("Age: ");
			int age = input.nextInt();
		
			System.out.print("Student Gender: ");
			String studentGenderStr = input.next();
			studentGenderStr = studentGenderStr.toUpperCase();
			char studentGenderChar = studentGenderStr.charAt(0);
		
			System.out.print("Student Address: ");
			String studentAddress = input.next();
		
			System.out.print("Contact Number: ");
			int contactNumber = input.nextInt();
			input.nextLine();
		
			System.out.print("Father's name: ");
			String fathersName = input.nextLine();
		
			System.out.print("Mother's name is: ");
			String mothersName = input.nextLine();
		
			//EMPLOYEE'S DETAILS INPUT
			System.out.println("\nEMPLOYEE'S DETAILS");
				
			System.out.print("Employee Name: ");
			String employeeName = input.nextLine();
				
			System.out.print("Designation: ");
			String designation = input.nextLine();
				
			System.out.print("Academic Position: ");
			String academicPosition = input.nextLine();
			
			AcadInfo.Acadinfo();
			StudentInfo.display_student(studentName, age, studentGenderChar, studentAddress, contactNumber, fathersName, mothersName);
			EmployeeInfo.display_employee(employeeName, designation, academicPosition);
			AcadInfo.displayEducDetails();
			
			//NEXT STUDENT
			if(a <= (numOfStudents - 1))
			{
				System.out.println("\n\nNEXT STUDENT\n");
			}
		}
	}
	
}
