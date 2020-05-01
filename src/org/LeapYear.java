package org;
public class LeapYear {

	public boolean leapYear(int year) {
		int providedYear = year;

		boolean flag = false;

		if (providedYear % 4 == 0) {
			if (providedYear % 100 == 0) {
				if (providedYear % 400 == 0)
					flag = true;
				else
					flag = false;
			} else
				flag = true;
		} else {
			flag = false;
		}

		if (flag == true)
			System.out.println(providedYear + " is a Leap Year.");
		else
			System.out.println(providedYear + " is not a Leap Year.");
		
		
		return flag;

	}
	
}
