package selflearn.selflearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample{

	public static void main(String[] args) {
		ArrayList<EmpPojo> al=new ArrayList<EmpPojo>();
		al.add(new EmpPojo("Harish",1009,35));
		al.add(new EmpPojo("Priyanka",1010,32));
		al.add(new EmpPojo("Satish",1008,41));
		al.add(new EmpPojo("Lakshmi",1007,38));
		al.add(new EmpPojo("Yashu",1011,3));
		
		Collections.sort(al, new GetDataByName());
		System.out.println("**************Sorted data by name************");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		Collections.sort(al, new GetDataByAge());
		System.out.println("**************Sorted data by age*************");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		Collections.sort(al, new GetDataByID());
		System.out.println("**************Sorted data by ID*************");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}

	}

}
class GetDataByName implements Comparator<EmpPojo>{
	@Override
	public int compare(EmpPojo o1, EmpPojo o2) {
		// TODO Auto-generated method stub
		return o1.getEmpName().toString().compareTo(o2.getEmpName().toString());
	}
	
}
class GetDataByAge implements Comparator<EmpPojo>{

	@Override
	public int compare(EmpPojo o1, EmpPojo o2) {
		// TODO Auto-generated method stub
		return o1.getEmpAge()-o2.getEmpAge();
	}	
}
class GetDataByID implements Comparator<EmpPojo>{

	@Override
	public int compare(EmpPojo o1, EmpPojo o2) {
		// TODO Auto-generated method stub
		return o1.getEmpID()-o2.getEmpID();
	}
	
}
