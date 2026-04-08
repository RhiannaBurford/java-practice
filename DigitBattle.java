/*

It's time to d-d-d-duel. 

Why yes, I am writing this late afternoon on a friday. 

We are hosting 'digit battles', in order to find the digit champions.
(and maybe save the digit world.)

Given a number, we can 'pair off' the digits and have them compete.
In this case, the highest number wins and goes into the 'winning' number. 

For example:

526273445 produces the 'winning' number of 5675.

5 v 2 -> 5
6 v 2 -> 6
7 v 3 -> 7
4 v 4 -> A tie! No number is added to the 'winning' number.
5 - > Wins by default! De-fault! De-fault!

So, when digits are the same, neither is added to the 'winning' number
and a lone number wins automatically.

Write a method that, given a long, returns the 'winning' number.

*/

public class DigitBattle
{
	public static void main(String[] args){
		System.out.println(solve(9834451));
	}
	//Your code goes here
	public static long solve(long n){
		long answer = 0;
		long last_digit = 0;
		long penultimate_digit = 0;
		int length = String.valueOf(n).length();
		int power = 0;
		// CORRECT
		if (length % 2 != 0){
			// length is odd - one lone number
			last_digit = n % 10;
			answer = answer + last_digit; 
			n = n / 10;
			power = 1;
		}
		else {
			// No lone digit
			power = 0;
		}
		
	
		while (n >= 10){
			last_digit = n % 10;
			System.out.println("the next last digit is " + last_digit);
			n = n / 10;
			penultimate_digit = n % 10; 
			System.out.println("the penultimate digit is " + penultimate_digit);
			n = n / 10;
			if (last_digit > penultimate_digit){
				answer = answer + (last_digit * (long) Math.pow(10, power));
				power++;
			}
			else if (penultimate_digit > last_digit){
				answer = answer + (penultimate_digit * (long) Math.pow(10, power));
				power++;
			}
			
		}

		return answer;
	}

}
