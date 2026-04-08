/*

You must write a method that calculates the score for three players:
A, B & C.

The points scored will be given as a string of these three characters
in order of when a player won a round of the game. 

e.g. AABCABBCCCCBAACCBBBBBAACABABAAAAAAA

The rules for scoring are as follows:

A single occurrance of a character means 1 point for that player.
Two of the same characters in a row is worth 5 points.
Three of the same characters in a row is worth 8 points.
Four of the same character in a row is worth 12 points.
Five of the same character in a row is worth 20 points.

If there are more than five of a character in a row, the points reset.
So, the sixth character is treated as a single occurance, not the sixth
in a list.

So, consider the above example, broken down into runs of the same character:

AA - 5 points for A.
B - 1 point for B.
C - 1 point for C.
A - 1 point for A. Total: 6
BB - 5 points for B. Total: 6
CCCC - 12 points for C. Total: 13
B - 1 point for B. Total: 7
AA - 5 points for A. Total: 11
CC - 5 points for C. Total: 18
BBBBB - 20 points for B. Total: 27
AA - 5 points for A. Total: 16
C - 1 point for C. Total: 19
A - 1 point for A. Total: 17
B - 1 point for B. Total: 28
A - 1 point for A. Total: 18
B - 1 point for B. Total: 29
AAAAA - 20 points for A. Total: 38
AA - 5 points for A. Total: 43

Note at the end, how we split A's run of wins.
After 5 wins, we restart the counter.

At the end, A has 43 points, B has 29 points and C has 19 points.
So, your method should return an array: [43, 29, 19]
Your array will be treated as the scores for A, then B and then C in order.

*/
public class GameScore
{
	public static void main(String[] args){
		int[] results = solve("AABCABBCCCCBAACCBBBBBAACABABAAAAAAA");
		for (int i = 0; i < results.length; i++){
			System.out.println(results[i]);
		}
	}

	

	//Your code goes here
	public static int[] solve(String scores){
		char player = 'A';
		int A_points = 0;
		int B_points = 0;
		int C_points = 0;
		
		int prev_count = 0;
		char prev_player = 'D';
		// Loop through all scores
		for (int i = 0; i < scores.length(); i++){
			player = scores.charAt(i);
			if (player == prev_player){
				prev_count++;
				if (prev_count > 5){
					if (player == 'A'){
						A_points += 20;
					}
					else if (player == 'B'){
						B_points += 20;
					}
					else {
						C_points += 20;
					}
					prev_count = 1;
				}
			}
			else {
				if (prev_count > 0){
					if (prev_player == 'A'){
						A_points = updatePoints(A_points, prev_count);
					}
					else if (prev_player == 'B'){
						B_points = updatePoints(B_points, prev_count);
					}
					else {
						C_points = updatePoints(C_points, prev_count);
					}
				}
				prev_player = player;
				prev_count = 1;
			}
		}

		if (prev_count > 0){
			if (prev_player == 'A'){
				A_points = updatePoints(A_points, prev_count);
			}
			else if (prev_player == 'B'){
				B_points = updatePoints(B_points, prev_count);
			}
			else {
				C_points = updatePoints(C_points, prev_count);
			}
		}

		int[] results = {A_points, B_points, C_points};
		return results;
	}

	public static int updatePoints(int X_points, int prev_count){
		int[] points = {1, 5, 8, 12, 20};
		X_points = X_points + points[prev_count - 1];
		return X_points;
	}
	

}
