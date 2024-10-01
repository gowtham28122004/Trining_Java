// method 1 Brute Force(Array) i+=2 and i < n-1

import java.util.*;

class AdjecentSwap {
    public static void main(String[] args) {
        
        int n = 6;
        int arr[] = {1,2,3,4,5,6};
        
        for(int i = 0;i < n-1;i+=2) {
            arr[i] = arr[i]^arr[i+1]; // 1 ^ 2 = 3
            arr[i+1] = arr[i]^arr[i+1]; // 3 ^ 2 = 1
            arr[i] = arr[i] ^arr[i+1]; // 3 ^ 1 = 2
        }
        for(int k = 0;k < 6;k++) {
            System.out.print(arr[k]);
        }
        
    }
}

// method 2 Integer reverse and %100 , (n & 1 == 0) -> even

import java.util.*;

class AdjecentSwap {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int rev = 0;
        int f = 0;
        
        for(;n > 0;rev = rev * 10 + (n%10),n/=10 );
        
        for(int i = rev;i > 0;i/=100)
        {
            if(i/10 > 0) {
                f = f*100+ (i%100);
            }
            else {
                f = f*10+(i%10);
            }
        }
      /*for(;n > 0;rev = rev * 10 + (n%10),n/=10 ,c++);
        
        for(int i = rev;i > 0;f = f*100+ (i%100),i/=100);
        
        System.out.print(((c&1) != 0) ? f = f%10 + f/10 : f);
      */
        System.out.print(f);
    }
}

