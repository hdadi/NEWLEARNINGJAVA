package programs;

public class PalindromeCheck {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="AMMA";
		s=s.toLowerCase();
		//to store reverse string
		StringBuilder rev=new StringBuilder();
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev.append(s.charAt(i));
		}
		System.out.println("reverse string is: "+rev.toString());
		if(s.equals(rev.toString())) System.out.println("String is palindrome");

	}

}
