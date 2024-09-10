import java.util.*;

public class SwapNeighborWord
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String wood = s.nextLine();
		String[] piece = wood.split(" ");
		
		for(int i = 0;i < piece.length - 1;i+=2)
		{
		    String t = piece[i];
		    piece[i] = piece[i+1];
		    piece[i+1] = t;
		}
		for(int i = 0;i < piece.length; i++) {
		    System.out.print(piece[i]+ " ");
		}
	}
}
