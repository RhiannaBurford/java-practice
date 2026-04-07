/*Given a string, which contains a first name and a last name, seperated by a space,
write a method that returns a new string according to the following rules:

- swap the first two characters of the first name with the first two characters of the last name
- then, swap the order of the first name and the last name

For example, the name Kristen Applebees becomes Krplebees Apisten.

You can assume the string will have only one space and each name will be at least
three characters long.*/

public class ShuffleNames
{

	//Your code goes here
	public static String solve(String name){

		// Identifying first name and last name
		boolean space_found = false;
		String first_name = "";
		String last_name = "";
		int i = 0;
		while (!space_found){
			if (name.charAt(i) == ' '){
				space_found = true;
			}
			else {
				first_name = first_name + name.charAt(i);
			}
			i++;
		}
		for (int j = i; j < name.length(); j++){
			last_name = last_name + name.charAt(j);
		}

		String first_name_two = first_name.substring(0, 2);
		String last_name_two = last_name.substring(0, 2);

		String newFirst = last_name_two + first_name.substring(2);
    	String newLast = first_name_two + last_name.substring(2);

		return newLast + " " + newFirst;
	}


}
