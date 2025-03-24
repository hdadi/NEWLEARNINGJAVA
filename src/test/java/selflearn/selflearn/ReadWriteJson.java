package selflearn.selflearn;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class ReadWriteJson {

	public static void main(String[] args) {
		// READING DATA FROM THE JSON FILE USING ORG.JSON PACKAGE
		try {
        String content = new String(Files.readAllBytes(Paths.get("SampleJson.json")));
        JSONObject jsonObject = new JSONObject(content);
        System.out.println(jsonObject.toString());
//        JSONObject jsonObject2 = new JSONObject(jsonObject.));
//        System.out.println("Name is: "+jsonObject.getString("jobTitleName"));
        JSONArray arr=(JSONArray) (jsonObject.getJSONArray("Employees"));
        JSONObject obj2=arr.getJSONObject(1);
        System.out.println("First arrya is: "+obj2.toString());
        
    } catch (IOException e) {
        e.printStackTrace();
    }

	// WRITING DATA TO THE JSON FILE USING ORG.JSON PACKAGE
		JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Harish");
        jsonObject.put("age", 34);
        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("name", "Priyanka");
        jsonObject2.put("age", 30);

        try (FileWriter file = new FileWriter("WriteData.json")) {
            file.write(jsonObject.toString());
            System.out.println("JSON data written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
      //***********************USING JACKSON DATABIND************************************
        ObjectMapper mapper= new ObjectMapper();
        ObjectWriter writer=mapper.writerWithDefaultPrettyPrinter();
        myEmp obj1=new myEmp("Harish", 35);
        myEmp obj2=new myEmp("Yashu", 2);
        List<myEmp> ls=Arrays.asList(obj1,obj2);
        try {
        	writer.writeValue(new File("Output.json"), ls);
        	System.out.println("File written successfully");
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
        
        
        
        
        
        
        
        
        
	}

}
class myEmp{
	private String name;
	private int age;
	public myEmp(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public String setName(String name) {
		return this.name=name;
	}	
	public int getage() {
		return age;
	}
	public int setAge(int age) {
		return this.age=age;
	}
}
