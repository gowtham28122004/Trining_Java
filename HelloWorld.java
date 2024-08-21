import java.util.Scanner;

class HelloWorld 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        
        Person[] p = new Person[5];
        
        for(int i = 0;i < 5;i++)
        {
            System.out.print("Your Good Name ");
            String name = s.nextLine();
            System.out.print("Your Age ");
            int age = s.nextInt();
            p[i] = new Person(name,age);
            s.nextLine();
        }
        
        for(int i = 0;i < 5;i++){
            System.out.println("Name : "+p[i].getName());
            System.out.println("Age : "+p[i].getAge());
        }
    }
}

class Person {
    private String name;
    private int age;
    
    Person(String name,int age){
        this.name = name;
        if(age > 0) {
            this.age = age;
        }
        else {
            System.out.println("Invalid Age");
        }
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
        else {
            System.out.println("Invalid Age");
        }
    }
}

