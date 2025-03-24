package programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemovePunctuations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello {This}! is%$ @#)(Har-ish";
		Pattern p=Pattern.compile("\\p{Punct}");
		Matcher m=p.matcher(s);
		while(m.find()) {
			System.out.println("Match found :"+m.group());
		}

	}

}
