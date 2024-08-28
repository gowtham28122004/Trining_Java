import java.util.*;

class AfterSymbol {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        // String sample = s.nextLine();
        
        // int index = sample.indexOf("@")+1;
        
        // System.out.print(sample.substring(index));
        
        // String a = s.nextLine();
        
        for(int  i = 0;i < a.length();i++)
        {
            if(a.charAt(i) == '@')
            {
                for(int j = i+1;j < a.length();j++)
                {
                    System.out.print(a.charAt(j));
                }
            }
        }
    }
}
