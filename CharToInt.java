import java.util.*;

class CharToInt {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        String name = s.nextLine();
        
        System.out.println("Position : ");
        for(int i = 0;i < name.length();i++) {
            System.out.println((int) (name.toUpperCase().charAt(i) - 'A')+1);
        }
        System.out.println();
        
        System.out.println("Upper Character : ");
        for(int i = 0;i < name.length();i++) {
            System.out.println((int) name.toUpperCase().charAt(i));
        }
        System.out.println();

        System.out.println("Lower Character : ");
        for(int i = 0;i < name.length();i++) {
            System.out.println((int) name.toLowerCase().charAt(i));
        }
        
    }
}
