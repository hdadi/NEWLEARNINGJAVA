package programs;

import java.util.Arrays;

public class BubbleSortOfAnArray {

	    public static void main(String[] args) {
	        int[] values = {7, 6, 1, 4, 3, 9, 8, 12, 10};	        
	        int n = values.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (values[j] > values[j + 1]) { // Swap if needed
	                    int temp = values[j];
	                    values[j] = values[j + 1];
	                    values[j + 1] = temp;
	                }
	            }
	        }	        
	        System.out.println("Bubble Sorted: " + Arrays.toString(values));
	    }
	}
	
	


