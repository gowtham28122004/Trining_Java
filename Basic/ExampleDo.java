import java.util.Scanner;
import java.lang.Thread;

class ExampleDo {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the CountDown : ");
        
        int i = s.nextInt();
        
        
        try {
            do{
                Thread.sleep(1000);
                System.out.println(i);
                i--;
            } while(i > 0);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println("Let's Start!");
    }
}
