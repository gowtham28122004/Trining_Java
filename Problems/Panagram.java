import java.util.*;

class Panagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        scanner.close();
        
        if (isPangram(input)) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }

    public static boolean isPangram(String str) {
        // Create a boolean array to mark the presence of each letter
        boolean[] mark = new boolean[26];
        int index = 0;

        // Traverse the input string
        for (int i = 0; i < str.length(); i++) {
            if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a'; // Calculate index for each letter
                mark[index] = true;          // Mark this letter as found
            }
        }

        // Check if all letters were marked
        for (int i = 0; i < 26; i++) {
            if (!mark[i]) {
                return false;
            }
        }

        return true;
    }
}
