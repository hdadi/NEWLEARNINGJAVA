package programs;
import java.util.*;
public class ReverseStringPreservingSpaces {

		    public static void main(String[] args) {
		        String input = "hello world";
		        String result = reversePreservingSpaces(input);
		        System.out.println("Original: " + input);
		        System.out.println("Reversed: " + result);
		    }

		    public static String reversePreservingSpaces(String str) {
		        char[] arr = str.toCharArray();
		        List<Character> letters = new ArrayList<>();

		        // Extract non-space characters
		        for (char c : arr) {
		            if (c != ' ') {
		                letters.add(c);
		            }
		        }

		        // Reverse the list of non-space characters
		        Collections.reverse(letters);

		        // Reinsert reversed characters, keeping spaces unchanged
		        int index = 0;
		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] != ' ') {
		                arr[i] = letters.get(index++);
		            }
		        }

		        return new String(arr);
		    }
}
