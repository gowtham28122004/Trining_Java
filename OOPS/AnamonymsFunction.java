import java.util.*;

class AnamonymsFunction
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        new Calc().fact(s.nextInt());
    }
}

class Calc {
    void fact(int n) {
        int fact = 1;
        for(int i = 1;i <= n;i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
