
/*
A perfect number is a number that is the sum of all of its
proper divisors.

For example, consider the number 6.

6 has three proper divisors - 1, 2 and 3.

1 + 2 + 3 = 6 - so 6 is a perfect number. 

Write a method that, when given a number, returns
true if it is a perfect number and
false if it is not a perfect number. 
*/

public class PerfectNumbers
{
	//Your code goes here
	public static boolean solve(int n){
		int sum = 0;
		for (int i = 1; i < n; i++){
			if (n % i == 0){
				sum = sum + i;
			}
		}
		if (sum == n){
			return true;
		}
		else {
			return false;
		}
	}

}