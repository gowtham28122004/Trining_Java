import java.util.Scanner;

class ExampleSwitch {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        boolean loop = true;
        
        while(loop){
            
            System.out.print("Enter the Day : ");
            String day = s.nextLine().toLowerCase();
            
            switch(day){
                case "monday": 
                    System.out.println("Day 1");
                    break;
                case "tuesday":
                    System.out.println("Day 2");
                    break;
                case "wednesday": 
                    System.out.println("Day 3");
                    break;
                case "thursday":
                    System.out.println("Day 4");
                    break;
                case "friday": 
                    System.out.println("Day 5");
                    break;
                case "saturday":
                    System.out.println("Day 6");
                    break;
                case "sunday": 
                    System.out.println("Day 7");
                    break;
                case "stop":
                    loop = false;
                    break;
                default:
                    System.out.println("Wrongly Entered!");
            }
            
        }
        
    }
}
