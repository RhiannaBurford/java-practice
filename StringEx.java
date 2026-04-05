/*

Complete the following methods.

Do not change the method signature.	

Changing the method signature will
cause the marker to throw an error.
*/

public class StringEx
{

	//The following method takes a single parameter, a String s.
	//It should return a string of s with all the letters reversed and their case flipped.
	//i.e. if s = Hello, it should return: OLLEh
	// Strings are immutable
	public static String reverse(String s){
    	String result = "";

    	for (int i = s.length() - 1; i >= 0; i--) {
        	char c = s.charAt(i);

        	if (Character.isUpperCase(c)) {
           		result = result + Character.toLowerCase(c);
        	} else if (Character.isLowerCase(c)) {
            	result = result + Character.toUpperCase(c);
        	} else {
            	result = result + c; // non‑letters stay the same
        	}
    	}

    	return result;
	}


	//The following method should remove all characters from the input
	//string that are not letters (a - z, A - Z), and return that output.
	// i.e. c6%dl)P -> cdlP
	public static String purge(String s){
		String result = "";
		for (int i = 0; i < s.length(); i++){
			char character = s.charAt(i);
			if (Character.isLetter(character)){
				result = result + character;
			}
		}
		return result;
	}

	//The following method should replacer all occurances of
	// char c1 in String s with char c2 and return that new String
	//i.e. s = Hello, c1 = l, c2 = t, output = Hetto
	public static String replace (String s, char c1, char c2){
		String result = "";
		for (int i = 0; i < s.length(); i++){
			char character = s.charAt(i);
			if (character == c1){
				result = result + c2;
			}
			else {
				result = result + character;
			}
		}
		return result;
	}

	//The following method should insert string s2 directly in the middle of
	//string s1. If String s1 is odd (so cannot be split evenly), you should remove
	//the middle character entirely.
	//I.e. s1 = Hiya, s2 = woo, output = Hiwooya
	//i.e. s1 = Hello, s2 = World, output = HeWorldlo
	public static String insert (String s1, String s2){
		boolean odd = (s1.length() % 2 != 0);
		int mid = s1.length() / 2;
		String newString = "";
		if (odd){
			newString = s1.substring(0, mid) + s2 + s1.substring(mid + 1);
		}
		else {
			newString = s1.substring(0, mid) + s2 + s1.substring(mid);
		}
		return newString;
	}

	//The following method detect if the input string is a
	// plaindrome (the same backwards and forwards) and return true or false.
	public static boolean palindrome (String s){
		boolean palindrome = true;
		for (int i = 0; i < s.length()/2; i++){
			if (s.charAt(i) != s.charAt(s.length() - i - 1)){
				palindrome = false;
			}
		}
		return palindrome;
	}


}
