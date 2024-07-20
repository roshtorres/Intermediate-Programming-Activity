package _3StudentPackage;

public class StudentInfo 
{

	public static void Studentinfo()
	{

	}
	
	public static void display_student(String studentName, int age, char studentGenderChar, String studentAddress, int contactNumber, String fathersName, String mothersName)
	{
		//STUDENT DETAILS OUTPUT
		System.out.println("\nSTUDENT DETAILS");
		
		System.out.println("Student Name: " + studentName);
		System.out.println("Age: " + age);
		System.out.println("Student Gender: " + studentGenderChar);
		System.out.println("Student Address: " + studentAddress);
		System.out.println("Contact Number: " + contactNumber);
		System.out.println("Father's name: " + fathersName);
		System.out.println("Mother's name is: " + mothersName);
	}

}
