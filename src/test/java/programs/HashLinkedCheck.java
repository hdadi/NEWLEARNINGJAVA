package programs;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashLinkedCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] values= {"Harish", "Priyanka","Yashu", "Chinnu", "Sai Saran", "Sarvika", "Sudhanvi"};
		Map<String, Integer> hm=new HashMap<String, Integer>();
		Map<String, Integer> lhm=new LinkedHashMap<String, Integer>();
		Map<String, Integer> tm=new TreeMap<String, Integer>();
		Map<String, Integer> ht=new Hashtable<String, Integer>();
		int Counter=1;
		for(String s: values) {
			hm.put(s, Counter);
			lhm.put(s, Counter);
			tm.put(s,  Counter);
			ht.put(s,  Counter);
			Counter++;
			//test
		}
		Collections.synchronizedMap(hm);
		System.out.println("Hashmap values are: "+hm.toString());
		System.out.println("LinkedHashmap values are: "+lhm.toString());
		System.out.println("TreeeMap values are: "+tm.toString());
		System.out.println("HashTable values are: "+ht.toString());
		

	}

}
