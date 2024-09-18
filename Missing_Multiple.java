import java.util.Arrays;
import java.util.Scanner;

public class Missing_Multiple {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int size = s.nextInt();
		int[] arr = new int[size];
		
		for(int i = 0;i < size;i++) {
			arr[i] = s.nextInt();
		}
		
		Arrays.sort(arr);
		
		int result = solution(arr,size);
		if(result != -1) {
			System.out.println(result);
		}
		else {
			System.out.println("All the values are present.");
		}
		
	}
	
	public static int solution(int[] arr,int len) {
				
		if(arr[1] % arr[0] == 0) {
			
			for(int i = 0;i < len;i++) {
				if(arr[i] != arr[0]*(i+1)) {
					return arr[0]*(i+1);
				}
			}
		}
		else {
			return (arr[0] / 2);
		}
		return -1;
	}

}
