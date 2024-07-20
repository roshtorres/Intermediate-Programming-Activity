package filePackage;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class OutputFile 
{
	  public static void main(String[] args) throws IOException
	  {
		  String writer;
		  PrintWriter output;
		 
	        try 
	        {
	        	writer = new String("../Intermediate Programming Activity - 5FileHandlingLAB/SampleText.txt");
	        	output = new PrintWriter("../Intermediate Programming Activity - 5FileHandlingLAB/SampleOutputText.txt");
	            
	        	FileInputStream fis = new FileInputStream(writer);
	            InputStreamReader fr = new InputStreamReader(fis);
	            BufferedReader br = new BufferedReader(fr);
	        	

	            String currentLine = "";
	            int numberOfWords = 0;
	            int length = 0;
	            int i = 1;
	            
	            while ((currentLine = br.readLine()) != null) 
	            {
	                if(currentLine.equals(""))
	                {
	                	i++;
	                }
	                else
	                {
	                	String[] listOfWords = currentLine.split("\\s+");
	                	
	                	numberOfWords = numberOfWords + listOfWords.length;
	                	length = length + currentLine.length();
	                }
	            	output.println("Length: " + (length));
	            	output.println("Specific Path: ../Intermediate Programming Activity - 5FileHandlingLAB/SampleText.txt");
	            	output.println("Number of Words: " + numberOfWords);
	            	output.close();
	            }
	        } 
	        catch (Exception exception) 
	        {
	            exception.printStackTrace();
	        }
	  }

}
