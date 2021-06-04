import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateDiff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.print("Enter the date in format: (dd/mm/yyyy): ");
		String date = sc.nextLine();
		LocalDate setDate = LocalDate.parse(date, df);

		LocalDate now = LocalDate.now();

		Period diff = Period.between(setDate, now);
		System.out.println("The difference is " + diff.getYears() + " years " + diff.getMonths() + " months " + diff.getDays() + " days.");

		sc.close();
	}

}
