import java.util.*;

class ExceptionExamp {
    public static void opt() throws IllegalAccessException{
        throw new IllegalAccessException("No Access");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        try {
            System.out.println(a/b);
            opt();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Done!");
        }
    }
}
