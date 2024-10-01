class SampleCopy
{
    public static void main(String[] args)
    {
        Tamil t = new Tamil(123,16,"foodie");
        Tamil t1 = new Tamil();
        t1.number = t.number;
        t1.age = t.age;
        t1.name = t.name;
        int a = t.hashCode();
        int b = t1.hashCode();
        System.out.println(a+" "+b);
        
        if(a == b) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}

class Tamil {
    int number;
    String name;
    int age;
    Tamil(){};
    Tamil(int n,int  a,String s) {
        number = n;
        age = a;
        name = s;
    }
}
