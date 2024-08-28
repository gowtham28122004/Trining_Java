import java.util.*;

class ExceptChar {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        String name = s.nextLine();
        
        char except = s.next().charAt(0);
        
        for (int i = 0;i < name.length();i++)
        {
            if(name.charAt(i) != except)
            {
                System.out.print(name.charAt(i));
            }
        }
    }
}
