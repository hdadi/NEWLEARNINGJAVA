package programs;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
	    public static void main(String[] args) {
	        LocalDateTime date = LocalDateTime.now();
	        System.out.println("Date without formatting: "+date);
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:SS");

	        String formattedDate = date.format(formatter);
	        System.out.println("Formatted Date: " + formattedDate);
	    }
	}
