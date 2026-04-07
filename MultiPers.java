/*

The 'multiplicative persistence' of a number is how many times you must multiply
the digits of a number together before you get a single digit number.

For example, 39 has a multiplicative persistence of 3.
3 * 9 = 27. 2 * 7 = 14. 1 * 4 = 4. 4 is a single digit number.

Write a method that, given a number, returns its multiplicative persistence.

Single digit numbers have a multiplicative persistence of 0.

*/

public class MultiPers
{

	//Your code goes here
	public static int solve(int n){
    	if (n < 10) return 0;

    	int count = 0;

    	while (n >= 10) {
        	int result = 1;

        	while (n > 0) {
            	result *= (n % 10);
            	n /= 10;
        	}

        	n = result;
        	count++;
    	}

    	return count;
	}

}
