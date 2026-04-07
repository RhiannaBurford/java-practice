/*

You are playing a game with a friend. 

Each of you have a hand of five cards, which each have a number 
between 0-9 on them.

You win if, using two cards, you can make a higher two digit number
than your opponent can. 

For example:

Your hand: [3, 1, 5, 7, 4]
Opponent hand: [2, 1, 4, 6, 1]

The highest two digit number you can make is 75
The highest the opponent can make is 64.
So, you win!

Write a method that, given two arrays of ints, yourHand and
oppHand, returns true if you can win the game or false otherwise.

The arrays will not be ordered, and a draw should return false.

*/

public class CardGame
{


	//Your code goes here
	public static boolean solve(int[] yourHand, int[] oppHand){
		int yourHandmax = findMaximums(yourHand);
		int oppHandmax = findMaximums(oppHand);
		if (yourHandmax > oppHandmax){
			return true;
		}
		return false;
	}

	public static int findMaximums(int[] cards){
		int max1 = 0;
		int max2 = 0;
		int temp = 0;
		for (int i = 0; i < cards.length; i++){
			if (cards[i] > max1){
				temp = max1;
				max1 = cards[i];
				max2 = temp;
			}
			else if (cards[i] > max2){
				max2 = cards[i];
			}
		}
		return (max1 * 10) + max2;
	}


}
