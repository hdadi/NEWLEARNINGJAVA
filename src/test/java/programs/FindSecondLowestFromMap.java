package programs;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindSecondLowestFromMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> hm=new HashMap<String, Integer>();
		hm.put("Mango",26);
		hm.put("Sapota",44);
		hm.put("Banana",12);
		hm.put("Guauva",49);
		
		Integer secondLowest=hm.values().stream().sorted().skip(1).findFirst().get();		
		for(Entry<String, Integer> entry: hm.entrySet()) {
			if(entry.getValue()==secondLowest) {
				System.out.println("Second highest fruit and its value is: "+entry.getKey()+"="+entry.getValue());
			}
		}	
	}

}
