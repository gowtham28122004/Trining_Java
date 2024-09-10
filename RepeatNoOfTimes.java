import java.util.*;

public class RepeatNoOfTimes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        s.close();
        char[] piece = input.toCharArray();
        
        for (int i = 0; i < piece.length;) {
            StringBuilder sb = new StringBuilder();
            while (i < piece.length && ((piece[i] >= 'a' && piece[i] <= 'z') || (piece[i] >= 'A' && piece[i] <= 'Z'))) {
                sb.append(piece[i]);
                i++;
            }
            
            if (i >= piece.length) break;
            
            int t = 0;
            while (i < piece.length && (piece[i] >= '0' && piece[i] <= '9')) {
                t = t * 10 + (piece[i] - '0');
                i++;
            }
            
            while (t > 0) {
                System.out.print(sb);
                t--;
            }
        }
    }
}
