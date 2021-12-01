
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SimpleTextFile {

	private static void createTextFile(String fileName) {
	    try {
	        File myFile = new File(fileName);
	        if (myFile.createNewFile()) {
	          System.out.println("File created: " + myFile.getName());
	        } else {
	          System.out.println("File " + fileName + " already exists.");
	        }
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	}
	
	private static void readText(String fileName) {
	    try {
	        File myObj = new File(fileName);
	        Scanner myReader = new Scanner(myObj);
	        while (myReader.hasNextLine()) {
	          String data = myReader.nextLine();
	          System.out.println(data);
	        }
	        myReader.close();
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	    
	}
	
	private static void writeText(String fileName, String text, 
			boolean appendMode) {
	    try {
	        FileWriter myWriter = new FileWriter(fileName, appendMode);
	        myWriter.write(text);
	        myWriter.close();
	        System.out.println("Successfully wrote to the file.");
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createTextFile("test.txt");
		String pathName = "/Users/ilirdema/uoft/teaching/csc207/utmf2021/java/classwork/w06-prep/test1.txt";
		createTextFile(pathName);
		
		writeText("test.txt", 
				"Files in Java might be tricky, but it is fun enough!\n", 
				true);
		
		readText("test.txt");
	}

}
