package programs;

public class IncreasingPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=6;
		for(int i=1;i<=value;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();	
		}
		for(int i=value-1;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();	
		}

	}

}
