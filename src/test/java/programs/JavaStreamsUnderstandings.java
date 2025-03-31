package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamsUnderstandings {

	public static void main(String[] args) {
		// using Streams to get even numbers from the list
		List<Integer> ls=Arrays.asList(10,13,14,16,18,20,21,22,24,30,40,60);
//		code to print even numbers
		ls.stream().filter(n->n%2==0).forEach(System.out::println);		
//		code to print odd numbers
		ls.stream().filter(n->n%2!=0).forEach(System.out::println);		
		
		//******************filter string with less than or equal to 6 characters******************************
		List<String> names=Arrays.asList("HarishD","SatishD","Yashu","Chinnu","Priyanka");
		names.stream().filter(str->str.length()<=6).collect(Collectors.toList()).forEach(System.out::println);
		
		//******************remove duplicate characters******************************
		String input = "happynns anniversaryyan";
        String output = input.chars()
                  .mapToObj(c->(char)c).collect(Collectors.toCollection(LinkedHashSet::new))
                  .stream()
                  .map(String::valueOf)
                  .collect(Collectors.joining());
        System.out.println(output);
        
        //******************filter price from the product object with greater than or equal to 45000******************************

		List<Product> products=new ArrayList<Product>();
		products.add(new Product("Lenovo IdeaPad I3", 1,24999));
		products.add(new Product("Lenovo ThinkPad I3", 2,44999));
		products.add(new Product("Lenovo IdeaPad I5", 3,46000));
		products.add(new Product("Lenovo ThinkPad I5", 4,54999));
		System.out.println("Total number of products below 45k are: "+products.stream().filter(p->p.pPrice<45000).count());
		products.stream().filter(p->p.pPrice<45000).forEach(p->System.out.println(p.pName+"-->"+p.pPrice));
	}

}
class Product{
	String pName;
	int pID;
	int pPrice;
	Product(String name,int ID, int Price){
		this.pName=name;
		this.pID=ID;
		this.pPrice=Price;
	}
}

