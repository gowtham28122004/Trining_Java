import java.util.*;

class NumberConversion {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter Decimal Number to convert it to Binary : ");
        int a = s.nextInt();
        System.out.println(Integer.toBinaryString(a));
        
        System.out.print("Enter Binary Number to convert it to Decimal : ");
        String b = s.next();
        System.out.println(Integer.parseInt(b,2));
        
        System.out.print("Enter Decimal Number to convert it to Octal : ");
        int c = s.nextInt();
        System.out.println(Integer.toOctalString(c));
        
        System.out.print("Enter Octal Number to convert it to Decimal : ");
        String d = s.next();
        System.out.println(Integer.parseInt(d,8));
        
        System.out.print("Enter Decimal Number to convert it to Hexa Decimal : ");
        int e = s.nextInt();
        System.out.println(Integer.toHexString(e));
        
        System.out.print("Enter Hexa Decimal Number to convert it to Decimal : ");
        String f = s.next();
        System.out.println(Integer.parseInt(f,16));
    }
}
