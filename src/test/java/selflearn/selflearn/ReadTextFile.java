package selflearn.selflearn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ReadTextFile {

	public static void main(String[] args) {
//	code to read a text file from java
		
//		Method1
		try {
			List<String> lines=Files.readAllLines(Paths.get("sampletextfile.txt"));
			for(String line: lines) {
				System.out.println(line);
			}
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
//Method2
		try(Scanner s = new Scanner(new File("sampletextfile.txt"))) {
			while(s.hasNextLine()) {
				System.out.println(s.nextLine());
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
