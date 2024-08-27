import java.util.*;

class SampleTrainProgram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        
        if(a > 0 && a < 73){
            switch(a%8) {
                case 1:
                    System.out.println("Upper Berth");
                    System.out.println("Seat no : "+a);
                    System.out.println("Coach no : "+(int)a/8);
                    break;
                case 2:
                    System.out.println("Middle Berth");
                    System.out.println("Seat no : "+a);
                    System.out.println("Coach no : "+(int)a/8);
                    break;
                case 3:
                    System.out.println("Lower Berth");
                    System.out.println("Seat no : "+a);
                    System.out.println("Coach no : "+(int)a/8);
                    break;
                case 4:
                    System.out.println("Upper Berth");
                    System.out.println("Seat no : "+a);
                    System.out.println("Coach no : "+(int)a/8);
                    break;
                case 5:
                    System.out.println("Middle Berth");
                    System.out.println("Seat no : "+a);
                    System.out.println("Coach no : "+(int)a/8);
                    break;
                case 6:
                    System.out.println("Lower Berth");
                    System.out.println("Seat no : "+a);
                    System.out.println("Coach no : "+(int)a/8);
                    break;
                case 7:
                    System.out.println("Side Upper Berth");
                    System.out.println("Seat no : "+a);
                    System.out.println("Coach no : "+(int)a/8);
                    break;
                case 0:
                    System.out.println("Side Lower Berth");
                    System.out.println("Seat no : "+a);
                    System.out.println("Coach no : "+(int)a/8);
                    break;
            }
        }
        else{
            System.out.println("Seats out of limits");
        }
    }
}
