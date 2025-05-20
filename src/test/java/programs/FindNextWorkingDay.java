package programs;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class FindNextWorkingDay {
	    public static LocalDate getNextBusinessDay(LocalDate date) {
	        do {
	            date = date.plusDays(1);
	        } while (date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY);
	        return date;
	        }

	    public static void main(String[] args) {
	    	LocalDate today = LocalDate.now();
//	        LocalDate today = LocalDate.of(2025, 5, 23); // A Friday
	        LocalDate nextBusinessDay = getNextBusinessDay(today);
	        System.out.println("Next working day after " + today + " is " + nextBusinessDay);
	    }
	}
