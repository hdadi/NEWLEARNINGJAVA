package programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveDuplicateChars {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sent="happy anniversary";
		char[] arr=sent.toCharArray();
//		output: hapy nivers --  output2: happy nnivers

		StringBuilder output1=new StringBuilder();
		StringBuilder output2=new StringBuilder();
		Map<Character, Integer> hm=new LinkedHashMap<Character,Integer>();

		for(int i=0;i<arr.length;i++){
			char key=arr[i];
		if(hm.containsKey(key)) {
			int value=hm.get(key);
			hm.put(key,value+1);
		}
		else if(key==arr[i+1]){
			output2.append(key);
		}
		else {
			output1.append(key);
			output2.append(key);
			hm.put(key,1);
		}
		}
		System.out.println("Expected output1 is: "+output1.toString());
		System.out.println("Expected output2 is: "+output2.toString());

}
}
