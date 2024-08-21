import java.util.Scanner;
import java.lang.Math;

public class Armstrong {
    
    static boolean isArmstrongNumber(int number) {
        
        String digits = Integer.toString(number);
        int numDigits = digits.length();
        int sum = 0;
        
        for(int i = 0;i < numDigits;i++)
        {
            int digit = Character.getNumericValue(digits.charAt(i));
            sum += Math.pow(digit, numDigits);
        }
        
        return sum == number;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        if(isArmstrongNumber(number)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
