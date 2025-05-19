package programs;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindSecondHighestFromMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> hm=new HashMap<String, Integer>();
		hm.put("Mango",26);
		hm.put("Sapota",44);
		hm.put("Banana",12);
		hm.put("Guauva",49);
		
		Integer secondHigh=hm.values().stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();		
		for(Entry<String, Integer> entry: hm.entrySet()) {
			if(entry.getValue()==secondHigh) {
				System.out.println("Second highest fruit and its value is: "+entry.getKey()+"="+entry.getValue());
			}
		}	
	}

}
