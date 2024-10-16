import java.util.*;

public class PrimeIndex
{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		ArrayList<Integer> a = new ArrayList<>();
		int size = s.nextInt();
		int sum = 0;
		
		for(int i = 0;i < size;i++){
		    int t = s.nextInt();
		    a.add(t);
		    if(isPrime(i)){
		        sum+=t;
		    }
		}
		
		System.out.print(sum);
		
	}
	
	public static boolean isPrime(int i){
	    if(i < 2) return false;
	    for(int j = 2;j < i;j++){
	        if(i % j == 0) return false;
	    }
	    return true;
	}
}
