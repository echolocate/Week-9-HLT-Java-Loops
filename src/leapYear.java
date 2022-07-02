
public class leapYear {

	public static void main(String[] args) {
		int year;
		// for years between 1900 and 2030 inclusive
		for (int i = 1900; i <= 2030; i++) {
			year = i;
			// is year either divisible by 4 or 400 AND not a century year ?
			// (2000 /4 =500 so leap year but 1900 /400 =4.75 so not leap year.
			if ((year % 400 == 0) || ((year % 4 == 0)) && (year % 100 != 0)) {
				System.out.println(year + " is a Leap Year.");
			}			
			else {
				System.out.println(year + " is NOT a Leap Year.");
			}
		}
	}
}

