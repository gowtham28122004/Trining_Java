import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		
		try {
			FileWriter file =  new FileWriter("welcome.txt");
			file.write("This is having the information of the Students");
			file.write("Name : Kiran, Age : 23");
			file.write("Name : Dhanush, Age : 24");
			file.close();
			System.out.println("Some information is written into the File");
		}
		catch(IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}

}
