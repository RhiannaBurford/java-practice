import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.charset.StandardCharsets;

import java.io.IOException;
import java.io.File;
import java.util.List;


/*

Sadly, the number war is not as exciting as it sounds.

Given an array, write a method that returns the difference
between the sum of the even numbers and the sum of the odd
numbers. 

For example:

[1, 6, 8, 13, 5] -> returns 5 (19(1+13+5) - 14(6+8))

Your return value should be positive.

The array will not be a set length.

The array will not be in numerical order.

*/

public class NumberWar
{

	//Your code goes here
	public static int solve(int[] values){
		int odd_sum = 0;
		int even_sum = 0;
		for (int i = 0; i < values.length; i++){
			int value = values[i];
			if (value % 2 == 0){
				// Value is even
				even_sum += value;
			}
			else {
				// Value is odd
				odd_sum += value;
			}
		}
		int difference = odd_sum - even_sum;
		return Math.abs(difference);
	}
	

}
