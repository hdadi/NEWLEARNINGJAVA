package programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("Harish", "Priyanka", "Yashaswini", "Satish", "Sarvika", "Sudhanvi");
		
		//finding the first name in the list
		Optional<String> firstName=names.stream().findFirst();
		System.out.println("\nFindFirst");
		firstName.ifPresent(System.out::println);
		
		//finding names starting with "S"
		List<String> sNames=names.stream().filter(name-> name.startsWith("S")).collect(Collectors.toList());		
		System.out.println("\nNames starting with \'S\' are : ");
		sNames.forEach(System.out::println);
		

	}

}
