package programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindSecondHighestElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rawValues= "Mango26,Sapota44,Banana12,Guauva49";
		String[] fruits=rawValues.split(",");
		TreeSet<Integer> numbers=new TreeSet<Integer>();
		int i=0;
		for(String s: fruits) {
			Pattern p=Pattern.compile("\\d+");
			Matcher m=p.matcher(s);
			while(m.find()) {
				int value=Integer.valueOf(m.group());
				numbers.add(value);				
			}	
			i++;
		}
		Iterator<Integer> iterator=numbers.descendingIterator();
		System.out.println("TreeSet size is: "+numbers.size());
		iterator.next();
		
		int desiredValue=iterator.next();
		for(String st: fruits) {
			if(st.contains(String.valueOf(desiredValue))) {
				System.out.println("The second highest value of fruit is: "+st);
			}
			
		}
		

	}

}
