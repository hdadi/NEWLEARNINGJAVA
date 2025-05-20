package programs;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class SkipWeekends {
	    public static void main(String[] args) {
//	        LocalDate date = LocalDate.of(2025, 5, 20); // Starting date
	    	LocalDate date=LocalDate.now();
	        for (int i = 0; i < 7; i++) { // Process 7 weekdays
	            date = date.plusDays(1); // Move to next day
	            while (date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY) {
	                date = date.plusDays(1); // Skip weekend
	            }
	            System.out.println("Next weekday: " + date);
	        }
	    }
}
