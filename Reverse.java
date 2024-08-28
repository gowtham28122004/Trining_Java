import java.util.*;

class Reverse {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        
        // System.out.println(new StringBuilder(a).reverse());
        
        for(int i = a.length()-1 ; i >= 0;i--)
        {
            System.out.print(a.charAt(i));
        }
    }
}
