package selflearn.selflearn;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class WriteTextFile {

	public static void main(String[] args) throws IOException {
		/*
		 * try {
		 * 
		 * @SuppressWarnings("resource") FileWriter wr=new
		 * FileWriter("sampletextfile.txt"); wr.write("Hello, This is a new line");
		 * wr.write("Addition of sentence to the text file");
		 * System.out.println("Added data to text file successfully"); }
		 * catch(IOException e) { e.printStackTrace(); }
		 */
		
		/*
		 * try { BufferedWriter r=new BufferedWriter(new
		 * FileWriter("sampletextfile.txt")); r.write("Hello TO Programming"); }
		 * catch(IOException e) { e.printStackTrace(); }
		 */
		List<String> lines=Arrays.asList("Hello World","This is the second line","This is the third line");
		try {
			Files.write(Paths.get("sampletextfile.txt"),lines);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
