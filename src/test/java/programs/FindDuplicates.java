package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Harish Dadi";
		s=s.toLowerCase();
		Map<Character, Integer> hm=new HashMap<Character, Integer>();
		char[] ch=s.toCharArray();
		for(char c:ch) {
			if(hm.containsKey(c))hm.put(c, hm.get(c)+1);
			else {
				hm.put(c,1);
			}
		}
		for(Entry<Character, Integer> e:hm.entrySet()) {
			if(e.getValue()>1) {
				System.out.println("Duplicate character is : "+e.getKey()+"-"+e.getValue());
			}
		}

	}

}
