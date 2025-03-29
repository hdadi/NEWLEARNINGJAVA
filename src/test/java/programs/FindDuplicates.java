package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicates {

	public static void main(String[] args) {
		// To find duplicate characters in a string
		String s="Harish Dadi ";
		s=s.replace("\\s","");
		s=s.toLowerCase();
		StringBuilder sb=new StringBuilder();
		Map<Character, Integer> hm=new HashMap<Character, Integer>();
		char[] ch=s.toCharArray();
		for(char c:ch) {
			if(hm.containsKey(c))hm.put(c, hm.get(c)+1);
			else {
				hm.put(c,1);
				sb.append(c); // to append non repetitive characters
			}
		}
		System.out.println("String after removing duplciates: "+sb.toString());
		for(Entry<Character, Integer> e:hm.entrySet()) {
			if(e.getValue()>1) {
				System.out.println("Duplicate character is : "+e.getKey()+"-"+e.getValue());
			}
		}

	}

}
