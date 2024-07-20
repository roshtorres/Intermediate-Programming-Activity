package javaPackage;

public class Student 
{
		private String firstName;
		private String lastName;
		private double quiz1;
		private double quiz2;
		private double quiz3;
		
		public Student(String firstName,String lastName,double q1,double q2,double q3)
		{
			this.firstName=firstName;
			this.lastName=lastName;
			quiz1=q1;
			quiz2=q2;
			quiz3=q3;
		}
		
		public String getFirstName()
		{
			return firstName;
		}
		public void setFirstName(String firstName)
		{
			this.firstName=firstName;
		}
		
		public String getLastName()
		{
			return lastName;
		}
		public void setLastName(String lastName)
		{
			this.lastName=lastName;
		}
		
		public double getQuiz1()
		{
			return quiz1;
		}
		public void setQuiz1(double q1)
		{
			quiz1=q1;
		}
		
		public double getQuiz2()
		{
			return quiz2;
		}
		public void setQuiz2(double q2)
		{
			quiz2=q2;
		}
		
		public double getQuiz3()
		{
			return quiz3;
		}
		public void setQuiz3(double q3)
		{
			quiz3=q3;
		}
		
		public double computeAverage()
		{
			return (quiz1+quiz2+quiz3)/3;
		}
		
		public void displayRemarks()
		{
			String rem;
			double ave=computeAverage();
			
			if(ave<=100&&ave>=90)
			{
				rem="Excellent";
			}
			else if(ave<=89&&ave>=80)
			{
				rem="Very Good";
			}
			else if(ave<=79&&ave>=75)
			{
				rem="Passed";
			}
			else
			{
				rem="Failed";
			}
			
			System.out.println("Remarks: "+rem);
		}

}
