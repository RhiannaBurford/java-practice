

/*Given two ints, m and n, produce a method
that is length n, populated by multiples of m.

The multiples should start with m and increase linerly

For example, if m = 7 and n = 5, your method should return:

[7, 14, 21, 28, 35]*/

public class ArrayMulti
{

	//Your code goes here
	public static int[] solve(int m, int n){
		int[] arr = new int[n];
		for (int i = 0; i < n; i++){
			arr[i] = m * (i+1);
		}
		return arr;
	}

}
