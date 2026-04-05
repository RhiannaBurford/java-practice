/*

Complete the following methods.

Do not change the method signature.	

Changing the method signature (aside from parameters) will
cause the marker to throw an error.
*/

public class ChoicesEx
{

	//The following method should return 0 if a is divisible by 3, or a * 3 if it is not.
	//i.e a = 6, should return 0.
	// a = 5 should return 15.
	public static int threeMulti(int a){
		if (a % 3 == 0){
			return 0;
		}
		else {
			return (a*3);
		}
	}

	//The following method should return the string "bigger" if a > b, the string "smaller" if a < b and "equal" if a = b
	public static String checkSize(int a, int b){
		if (a > b){
			return "bigger";
		}
		else if (a < b){
			return "smaller";
		}
		else {
			return "equal";
		}
	}

	//The following case statement should have the following behaviour:
		//if a > 0, even and less than 7, the total should increase by the value of a.
		//if a > 0, odd and less than 7, the total should be doubled, and then increased by the value of a+1.
		//In any other case, the total should be set to -1.
	//Correct the case statement so that it exhibits this behaviour correctly.

	public static int brokenCase(int a, int total){

		switch(a){
		case 1, 3, 5:
			total = (total * 2) + a + 1;
			break;
		case 2, 4, 6:
			total = total + a;
			break;
		default:
			total = -1;
			break;
		}

		return total;
	}


}
