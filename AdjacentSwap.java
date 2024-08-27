import java.util.*;

class AdjacentSwap {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        /*
        input : 
        3
        4
        1 2 3
        7 4 2 8
        
        output:
        1 2 2 3 4 7 8
        */
        
        int l1 = s.nextInt();
        int l2 = s.nextInt();
        
        int[] ar1 = new int[l1];
        int[] ar2 = new int[l2];
        
        for(int i = 0; i < l1; i++) {
            ar1[i] = s.nextInt();
        }
        
        for(int i = 0; i < l2; i++) {
            ar2[i] = s.nextInt();
        }
        
        int l3 = l1 + l2;
        int[] res = new int[l3];

        for(int i = 0;i < l1;i++) {
            res[i] = ar1[i];
        }
        
        for(int i = l1;i < l3;i++) {
            res[i] = ar2[i-l1];
        }
        
        Arrays.sort(res);
        
        /* set, nested loop, create new array*/
        Set<Integer> set = new LinkedHashSet<>();
        for(int i = 0; i < l3; i++) {
            set.add(res[i]);
        }
        
        int[] result = new int[set.size()];
        int index = 0;
        for(int value : set) {
            result[index++] = value;
        }
        
        for(int value : result) {
            System.out.print(value + " ");
        }
    }
}
