package selflearn.selflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        int a=16;
//        for(int i=0;i<20;i++) {
//        	if(i==16) {
//        		System.out.println("Reached the final point: "+i);
//        		break;
//        	}
//        	System.out.println("i value: "+i);      	        
//        }
        
        //SORTING ELEMENTS USING BUBBLE SORT
        int[] arr= {2,88,26,48,56,93,12,27,38};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }               
        for(int t: arr) {
        	System.out.println(t);
        }
        //SORTING ELEMENTS USING STREAMS API
        int[] arr2= {27,52,26,88,26,48,56,93,12,27,38};
		List<Integer> larrIntegers=Arrays.stream(arr2).boxed().sorted().collect(Collectors.toList());
        for(int value: larrIntegers) {
        	System.out.println("listvalue: "+value);
        }
    }
}
