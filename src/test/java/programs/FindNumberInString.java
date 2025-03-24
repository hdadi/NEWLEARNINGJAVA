package programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindNumberInString {

	public static void main(String[] args) {
		String s="Harish1009Dadi0808";
		//Method 1
//		char[] arr=s.toCharArray();
//		for(char c:arr) {
//			if(Character.isDigit(c)) System.out.println("\nMethod 1 found a digit: "+c);
//		}
        //Method 2
		String h="This is 1001 to fetch the bulk digits 2486 in the String 786";
		Pattern p=Pattern.compile("\\d+");
		Matcher m=p.matcher(h);
		while(m.find()) {
			System.out.println("\nMethod 2 found digits are: "+m.group());
		}
	}

}
