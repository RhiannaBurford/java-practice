/*

Given an array of ints:

- Return 'boom!' if it contains a prime number
- Return 'phew!' if it does not contain a prime number

The array will not be of a set size and will not be
ordered.

*/

public class PrimeBomb
{

	//Your code goes here
	public static String solve(int[] input){
		for (int i = 0; i < input.length; i++){
			if (isPrime(input[i])){
				return "boom!";
			}
		}
		return "phew!";
	}

	public static boolean isPrime(int num){
		if (num <= 1){
			return false;
		}
		for (int i = 2; i < num; i++){
			if (num % i == 0){
				return false;
			}
		}
		return true;
	}

}
