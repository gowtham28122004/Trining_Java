
class HelloWorld 
{
    public static void main(String[] args) 
    {
        
        Person p = new Person("Gowtham",20);
        p.setAge(21);
        
        System.out.println(p.getName());
        System.out.println(p.getAge());
        
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
            age = 0;
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

