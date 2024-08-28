import java.util.*;

class RemoveDuplicateInString {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        String name = s.nextLine();
        
        // this method remove duplicate at the same time print in ascending order
        // int arr[] = new int[26];
        
        // for(int i = 0;i < name.length(); i++)
        // {
        //     arr[(int)name.charAt(i)-'a']++;
        // }
        
        // for(int i = 0;i < arr.length; i++) 
        // {
        //     if(arr[i] > 0)
        //         System.out.print((char)('a'+i));
        // }
        
        
        // this method remove duplicate and print in order that same order
        
        char ch[] = new char[name.length()];
        ch = name.toCharArray();
        
        for(int i = 0;i < ch.length;i++)
        {
            for(int j = i+1;j < ch.length;j++)
            {
                if(ch[i] == ch[j])
                {
                    ch[j] = '0';
                }
            }
            if(ch[i] != '0') {
                System.out.print(ch[i]);
            }
        }
    }
}
