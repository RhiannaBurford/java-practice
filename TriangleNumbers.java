
/*

Give a number, n, write a method that returns the nth number in
Triangle Number Sequence.

The triangle number sequence represents the total number of dots needed to
form a triangle n layers deep.

For example, the 1st triangle number is 1, then 3, then 6.

You can seem an example of the first 6 numbers in the sequence
and how thet form a triangle, here: 
https://upload.wikimedia.org/wikipedia/commons/1/1c/First_six_triangular_numbers.svg

*/

public class TriangleNumbers
{
	//Your code goes here
	public static int solve(int n){
		int sum = 0;
		for (int i = 1; i <= n; i++){
			sum = sum + i;
		}
		return sum;
	}

}