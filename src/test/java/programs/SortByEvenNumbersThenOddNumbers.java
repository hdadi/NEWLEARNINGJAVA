package programs;
import java.util.Arrays;
import java.util.Comparator;
public class SortByEvenNumbersThenOddNumbers {
	    public static void main(String[] args) {
	        Integer[] values = {7, 6, 1, 4, 3, 9, 8, 12, 10};
	        Arrays.sort(values, Comparator.comparingInt(a -> a % 2)); // Sort even first	        
	        System.out.println("Custom Sorted: " + Arrays.toString(values));
	    }
}
