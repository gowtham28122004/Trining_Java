import java.util.*;

class UserDefinedException {
    public static void opt() throws Customize{
        throw new Customize("No Access");
    }
    public static void main(String[] args) throws Customize{
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        try {
            System.out.println(a/b);
            opt();
        }
        catch(Customize e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Done!");
        }
    }
}

class Customize extends Exception{
    Customize() {
        super("Customized Error");
    }
    Customize(String s) {
        super(s);
    }
}
