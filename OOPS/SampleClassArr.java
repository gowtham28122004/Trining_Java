import java.util.*;

class SampleClassArr
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("No of Students Want to Add : ");
        int n = s.nextInt();
        s.nextLine();
        
        Student st[] = new Student[n];
        for(int i = 0;i < n;i++) {
            System.out.print("Enter student name : ");
            String a = s.nextLine();
            
            System.out.print("Enter student rollno : ");
            long b = s.nextLong();
            s.nextLine();
            
            System.out.print("Enter student department : ");
            String c = s.nextLine();
            
            System.out.print("Enter student Mail : ");
            String d = s.nextLine();
            
            System.out.print("Enter student Address : ");
            String e = s.nextLine();
            
            System.out.print("Enter student Gender : ");
            String f = s.nextLine();
            
            System.out.print("Enter student Marks : ");
            float g = s.nextFloat();
            s.nextLine();
            
            System.out.print("Enter student Age : ");
            int h = s.nextInt();
            s.nextLine();

            System.out.println();
            st[i] = new Student(a,b,c,d,e,f,g,h);
            
        }
        
        for(int i = 0; i < n ; i++){
            st[i].display();
        }
    }
}

class Student {
    
    String name;
    long rollno;
    String department;
    String mail;
    String address;
    String gender;
    float marks;
    int age;
    
    Student(String name,long rollno,String department,String mail,String address,String gender,float marks,int age){
        this.name = name;
        this.rollno = rollno;
        this.department = department;
        this.mail = mail;
        this.address = address;
        this.gender = gender;
        this.marks = marks;
        this.age = age;
    }
    
    public void display() {
        System.out.println("__________________________________________________");
        System.out.println("Name : "+name);
        System.out.println("Reg.no : "+rollno);
        System.out.println("Age : "+age);
        System.out.println("Department : "+department);
        System.out.println("Mail : "+mail);
        System.out.println("Gender : "+gender);
        System.out.println("Marks : "+marks);
        System.out.println("Address : "+address);
    }
}
