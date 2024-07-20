package javaPackage;
import java.util.Scanner;
import java.text.DecimalFormat;

public class StudentTestRun 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("##.00");
		
		String fname,lname;
		int q1,q2,q3;
		
		System.out.print("Enter Student First Name: ");
		fname=input.next();
		System.out.print("Enter Student Last Name: ");
		lname=input.next();
		System.out.print("Enter Student Grades[Quiz1, Quiz2, Quiz3]: ");
		q1=input.nextInt();
		q2=input.nextInt();
		q3=input.nextInt();
		
		Student stud=new Student(fname,lname,q1,q2,q3);
		
		System.out.println("Hello, "+lname+", "+fname+" Your average grade is "+df.format(stud.computeAverage()));
		stud.displayRemarks();
		
		stud.setQuiz1(100);
		stud.setQuiz2(85);
		stud.setQuiz3(75);
		
		System.out.println(fname+" "+lname+" Your new grade is "+df.format(stud.computeAverage()));
		stud.displayRemarks();
	}

}
