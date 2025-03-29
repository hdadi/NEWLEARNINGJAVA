package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.math3.analysis.function.Add;

public class PrimeNumberCheck {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int remainder=n%3;
        System.out.println("Remainder is: "+remainder);
        short b=6;
        int result=PrimeNumberCheck.add(b,8); // implicit widening conversion happens and no compilation error occurs
        System.out.println("Result is: "+result);

	}
	public static int add(int a, int b) {
		return a+b;
	}

}
