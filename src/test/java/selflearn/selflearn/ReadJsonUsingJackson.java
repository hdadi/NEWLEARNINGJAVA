package selflearn.selflearn;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJsonUsingJackson {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		// TO read JSON file using Jackson library
		ObjectMapper mapper=new ObjectMapper();
		List<UserPojo> pojo=mapper.readValue(new File("Output.json"), new TypeReference<List<UserPojo>>() {});
		System.out.println("User data is: "+pojo);
;
	}

}
