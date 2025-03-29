package programs;

public class FindPalindromeNumber {
	

	public static void main(String[] args) {
		// To find a palindrome in the given number
		
		FindPalindromeNumber obj=new FindPalindromeNumber();
		boolean b=obj.isPanlindrome(1441);
		if(b==true) System.out.println("The given number is a Palindrome");
		else System.out.println("The given number IS NOT a palindrome");
		

	}
	
	public boolean isPanlindrome(int number) {
		
		int original=number;
		int reverse=0;
		while(number!=0) {
			int digit=number%10;
			reverse=reverse*10+digit;
			number=number/10;			
		}
		return original==reverse;
	}

}
