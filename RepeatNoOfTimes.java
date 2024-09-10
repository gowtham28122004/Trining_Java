import java.util.*;

public class RepeatNoOfTimes
{
	public static void main(String[] args) {
	    
		Scanner s = new Scanner(System.in);
		char[] piece = s.nextLine().toCharArray();
		
		for(int i = 0;i < piece.length;)
		{
		    int f = i;
		    i++;
		    int t = 0;
		    
		    while(i < piece.length && (piece[i] >= '0' && piece[i] <= '9')) {
		        t *= 10;
		        t += piece[i] - '0';
		        i++;
		    }
		    
		    while(t > 0) {
		        System.out.print(piece[f]);
		        t--;
		    }
		}
	}
}
