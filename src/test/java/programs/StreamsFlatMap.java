package programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMap {

	public static void main(String[] args) {
		//FLATMAP returns a stream of objects/collection where as the MAP return single stream
		
		//removing duplicate values and sorted in ascending
		List<Integer> ls1=Arrays.asList(2,8,4,7,9,7,4);
		ls1.stream().distinct().sorted().collect(Collectors.toList()).forEach(System.out::println);
		
		//using FLATMAP for collection of collections
		List<Integer> ls2=Arrays.asList(2,8,6,6,9);
		List<Integer> ls3=Arrays.asList(21,18,36);
		List<Integer> ls4=Arrays.asList(22,87,36,69);
		List<Integer> ls5=Arrays.asList(82,81,22,66);
		List<Integer> ls6=Arrays.asList(52,48,81,53);
		List<List<Integer>> lsc=Arrays.asList(ls2,ls3,ls4,ls5,ls6);
		List<Integer> resultList=lsc.stream().flatMap(l->l.stream()).distinct().sorted().collect(Collectors.toList());
		System.out.println("Flattened List is: "+resultList);

	}

}
