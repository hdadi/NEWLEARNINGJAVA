package programs;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// METHOD 1 to remove duplicate words from a sentence
		String s="Harish dadi from nellore harish dadi";
		s=s.toLowerCase();		
		String result=Pattern.compile("\\s+").splitAsStream(s).distinct().collect(Collectors.joining(" "));
		System.out.println("after removing duplicates: "+result);
		
//		METHOD 1 to remove duplicate words from a sentence
		
		String s2="Harish Dadi from nellore this is dadi hariSH";
		s2=s2.toLowerCase();
		String[] arr=s2.split(" ");
		Set<String> se=new HashSet<String>();
		for(String str: arr) {
			se.add(str);
		}
		System.out.println("After removing duplicate strings: "+se.toString());
	}

}
