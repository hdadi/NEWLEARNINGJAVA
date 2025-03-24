package programs;

public class FindSpecialChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Th!s !$ H@r!sh Dadi";
		s=s.replaceAll("\\s","");
		char[] ch=s.toCharArray();
		for(char c: ch) {
			if(!(Character.isAlphabetic(c)|| Character.isDigit(c))) {
				System.out.println("\nSpecial Character peresent is: "+c);
			}
		}

	}

}
