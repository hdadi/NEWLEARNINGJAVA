package programs;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] values= {"Harish", "Priyanka","Yashu", "Chinnu", "Sai Saran", "Sarvika", "Sudhanvi"};
		Set<String> hs=new HashSet<String>();
		Set<String> lhs=new LinkedHashSet<String>();
		Set<String> ts=new TreeSet<String>();
		@SuppressWarnings("rawtypes")
		Set tss=new TreeSet();
		for(int i=0;i<values.length;i++) {
			hs.add(values[i]);
			lhs.add(values[i]);
			ts.add(values[i]);
			tss.add(values[i]);
		}
		tss.addAll(hs);
		System.out.println("HashSet values are: "+hs);
		System.out.println("LinkedHashet values are: "+lhs);
		System.out.println("TreeSet values are: "+ts);
		System.out.println("TreeSetTT values are: "+tss);

	}

}
