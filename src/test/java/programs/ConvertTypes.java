package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"Harish", "Priyanka", "Yashaswini", "Chinnu", "Sarvika"};
		List<String> al=Arrays.asList(names);		
		Object[] convertedNames=al.toArray();
		for(Object n: convertedNames) {
			System.out.println("converted names: "+n.toString());
		}
	}

}
