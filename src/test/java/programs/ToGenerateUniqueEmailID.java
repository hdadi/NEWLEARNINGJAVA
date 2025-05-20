package programs;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class ToGenerateUniqueEmailID {

	public static void main(String[] args) {
//		        String uniqueEmail = generateTimestampEmail("user", "example.com");
		        String uniqueEmail = generateUniqueEmail("user", "example.com");
		        System.out.println("Generated Email: " + uniqueEmail);
		        System.out.println("random value is: "+(int)(Math.random()*100));
		    }
	//using timeStamp
		    public static String generateTimestampEmail(String prefix, String domain) {
		        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		        return prefix + timestamp + "@" + domain;	
		    }
    //using UUID
		    public static String generateUniqueEmail(String prefix, String domain) {
		        String uuid = UUID.randomUUID().toString().replace("-", "").substring(0, 8); // Extract part of UUID
		        return prefix + uuid + "@" + domain;
		    }


}
