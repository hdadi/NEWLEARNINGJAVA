package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls=new ArrayList<Integer>();
		ls.add(4);
		ls.add(6);
		ls.add(8);
		ls.add(9);
		int x=8;
		int res=Collections.binarySearch(ls,x);
		System.out.println("Index where the x found is: "+res);
	}

}
