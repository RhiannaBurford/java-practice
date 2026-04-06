/*Given an array, and an int n,
perform the 'odd even' transform on the entire array
n times.

The 'odd even' transformation follows these rules:

If a number is odd, increase it by 2
If a number is even, decrease it by 2.

For example, if given the array [1, 8, 5, 4] and n = 2,
you should return: [5, 4, 9, 0].*/

public class OddEven
{
	//Your code goes here
	public static int[] solve(int[] values, int n){
		for (int j = 0; j < n; j++){
			for (int i = 0; i < values.length; i++){
				if (values[i] % 2 == 0){
					// Number is even, decrease it by 2
					values[i] -= 2;
				}
				else {
					// Number is odd, increase it by 2
					values[i] += 2;
				}
			}
		}
		return values;
	}
}
