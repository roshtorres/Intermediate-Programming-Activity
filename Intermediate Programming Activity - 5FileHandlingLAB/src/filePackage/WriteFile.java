package filePackage;
import java.io.PrintWriter;

public class WriteFile 
{
	public static void main(String[] args) 
	{
		 PrintWriter writer;
		 
		 try 
		 {
			 writer = new PrintWriter("../Intermediate Programming Activity - 5FileHandlingLAB/SampleText.txt");
			 writer.println("The journey of a thousand miles begins with a single step");
			 writer.println("This little light of mine, I’m gonna let it shine");
			 writer.close();
		 } 
		 catch (Exception exception) 
		 {
		       exception.printStackTrace();
		 }
	}

}
