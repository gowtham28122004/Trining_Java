import java.io.File;
import java.io.IOException;

public class CreateFiles {
    public static void main(String args[]){
        try{
            File myObj = new File("welcome.txt");
            if(myObj.createNewFile()){
                System.out.println("Successfully Created as "+myObj.getName());
            }
            else{
                System.out.println("Already created "+myObj.getName());
            }
        }
        catch(IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
