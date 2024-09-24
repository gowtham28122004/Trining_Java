
class Overloading {
    public static void main(String[] args) {
        Overloading o = new Overloading();
        o.sum(52,65);
        o.sum(42,65,65);
    }
    
    public void sum(int a,int b) {
       System.out.println(a+b);
    }
    
    public void sum(int a,int b,int c) {
        System.out.println(a+b+c);
    }
}
