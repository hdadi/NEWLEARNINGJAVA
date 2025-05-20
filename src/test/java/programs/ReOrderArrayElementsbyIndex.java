package programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class ReOrderArrayElementsbyIndex {
	    public static void reverseByCounter(int[] arr, int counter) {
	        if (counter <= 1 || counter > arr.length) {
	            System.out.println("Invalid counter value.");
	            return;
	        }	        
	        for (int i = 0; i < arr.length; i += counter) {
	            int left = i;
	            int right = Math.min(i + counter - 1, arr.length - 1);	            
	            while (left < right) {
	                int temp = arr[left];
	                arr[left] = arr[right];
	                arr[right] = temp;
	                left++;
	                right--;
	            }
	        }
	    }
	    public static void main(String[] args) {
	        int[] values = {7, 6, 1, 4, 3, 9, 8, 12, 10};
	        int counter = 3; // Reverse every 3 elements

	        System.out.println("Original: " + Arrays.toString(values));
	        reverseByCounter(values, counter);
	        System.out.println("Reversed by counter: " + Arrays.toString(values));
	    }
}



