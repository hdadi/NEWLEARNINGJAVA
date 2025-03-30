package programs;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class FindDuplicatesUsingStreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "happy anniversary";
        String output = input.chars()
                  .mapToObj(c -> (char) c)
                  .collect(Collectors.toCollection(LinkedHashSet::new))
                  .stream()
                  .map(String::valueOf)
                  .collect(Collectors.joining());
        System.out.println(output);
        String output2=removeNonConsecutiveDuplicates(input);
        System.out.println("Output2: \n"+output2);

	}
	public static String removeNonConsecutiveDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        result.append(str.charAt(0));
        
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

}
