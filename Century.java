

/*Given an int, which represents a year,
make a method that returns what century that 
year is in.

For example:

859 -> "9th century"
1256 -> "13th Century"
1473 -> "15th Century"
1300 -> "13th Century"

Remember that the 13th century (for example) goes from 1201 to 1300.

The year you receive will be between 1 and 2022.
*/

public class Century
{


	//Your code goes here
	public static String solve(int m){
		int century = (m + 99) / 100;
		String suffix = "th";

		if (century % 100 < 11 || century % 100 > 13){
			if (century % 10 == 1){
				suffix = "st";
			}
			else if (century % 10 == 2){
				suffix = "nd";
			}
			else if (century % 10 == 3){
				suffix = "rd";
			}
		}
		return century + suffix + " century";
	}


}
