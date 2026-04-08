/*Given an array of ints, which represents the change in your pocket, and a price,
write a method that determines if you can pay the price with the change.

The array will list the amount of certain coin in your pocket.
In order, the entries of the array will represent the amount of 1p, 5p, 20p, 50p and £1 coins in your pocket.

So, for example [5, 3, 2, 6, 4] means that you have:
5 1p coins
3 5p coins
2 20p coins
6 50p coins
4 £1 coins

Your method should return one of 3 states:
If you cannot pay the price listed, return '-1'
If you can pay the price listed, but not exactly, return '0'
If you can make exact change, return '1'

The price will be a double, representing pounds and pence.
For example, a price of 4.32 means £4 and 32p.*/

public class ExactChange
{


	//Your code goes here
	public static int solve(int[] change, double price){
		int price_in_pence = (int) (price * 100);
		int total = (change[0] * 1) + (change[1] * 5) + (change[2] * 20) + (change[3] * 50) + (change[4] * 100);
		int[] values = {1, 5, 20, 50, 100};

		if (total < price_in_pence){
			return -1;
		}

		int diff = total - price_in_pence;
		for (int i = 4; i >= 0; i--){
			while (change[i] > 0 && diff >= values[i]){
				diff = diff - values[i];
				change[i]--;
			}
		}
		if (diff == 0){
			return 1;
		}
		return 0;
	}


}
