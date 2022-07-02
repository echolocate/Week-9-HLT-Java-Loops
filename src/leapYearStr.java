
public class leapYearStr {

	public static void main(String[] args) {
		int year;
		// for years between 1900 and 2030 inclusive
		for (int i = 1900; i <= 2030; i++) {
			year = i;
			// Had to look this formula up !
			String ifLeapYear = ((year % 400 == 0) 
					|| ((year % 4 == 0)) && (year % 100 != 0)) 
					? " is a Leap Year." 
					: " is NOT a Leap Year.";
			System.out.println(year + ifLeapYear);
		}
	}
}


