package programs;
import java.util.Scanner;

public class PyramidOfNumbers {
		// TODO Auto-generated method stub
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the number of rows: ");
		        int rows = scanner.nextInt();
		        scanner.close();

		        for (int i = 1; i <= rows; i++) {
		            // Print spaces for alignment
		            for (int j = rows; j > i; j--) {
		                System.out.print(" ");
		            }
		            // Print numbers
		            for (int k = 1; k <= (2 * i - 1); k++) {
		                System.out.print(k);
		            }
		            System.out.println();
		        }
		        for(int i=rows-1;i>=1;i--) {
		        	for(int j=rows;j>i;j--) {
		        		System.out.print(" ");
		        	}
		        	for(int k=1;k<=(2*i-1);k++) {
		        		System.out.print(k);
		        	}
		        	System.out.println();
		        	
		        }	

	}

}
