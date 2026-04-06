import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.charset.StandardCharsets;

import java.io.IOException;
import java.io.File;
import java.util.List;

/*

Given the following inputs:

Number of new active cases a day, n
Number of recovered cases a day, r
Starting number of active cases, s

Write a method that returns the number of days it will take for
active cases to reach 0. 

If active cases will never reach 0, return -1.

For example:

n = 5, r = 7, s = 35 will take 18 days (rounded up) for cases
to reach 0. So your method should return 18.

*/
public class Cases
{
	//Your code goes here
	public static int solve(int n, int r, int s){
		int diff = r - n;
		if (diff < 0){
			// New active cases is greater than recovered cases
			return -1;
		}
		return (s + diff - 1) / diff; // Always round up
	}
}
