/*

Complete the following methods.

Do not change the method signature.	

Changing the method signature will
cause the marker to throw an error.
*/

public class LoopEx
{

	//The following method should return a count of all even numbers in the array, a.
	//The array can be of any size, including 0.
	public static int countEven(int a[]){
		int count = 0;
		for (int i = 0; i < a.length; i++){
			if (a[i] % 2 == 0){
				count++;
			}
		}
		return count;
	}

	//The following method should take two arguments, an array a, and an array b.
	//It should then return a 3rd array, c, of the sum of the each corresponding element in a and b.
	//i.e. c[0] = a[0] + b[0]
	//If the two arrays are of different sizes, the smaller array should be treated as having 0 in reach remaining index.
	//i.e. if a =[2, 3, 3, 4] and b = [1, 4, 5] then c[4] = 4 + 0
	public static int[] sumArray(int[] a, int[] b){
    	int maxLen = Math.max(a.length, b.length);
    	int[] c = new int[maxLen];

    	for (int i = 0; i < maxLen; i++) {
        	int av = (i < a.length) ? a[i] : 0;
        	int bv = (i < b.length) ? b[i] : 0;
        	c[i] = av + bv;
    	}
    	return c;
	}

	//The following loop is broken, and does not end.
	//It should generate random numbers, until one is higher than 10
	//and then return the sum of all the random numbers.
	public static double brokenLoop(){
		
		double total = 0;
		double x = 0.0;

		while (x < 10.0) {

			x = Math.random() * 20;
			total = total + x;

			if (x > 10) {
				//Do not delete - this string is checked during marking for correct behaviour
				System.out.println("Loop over!");
			}

		}

		//Do not delete - this string is checked during marking for correct behaviour
		System.out.println("Sum Complete!");

		return total;

	}
}
