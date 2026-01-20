package Week_1;

public class Best_Time_to_Buy_and_Sell_Stock_121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(prices));
	}

	public static int maxProfit(int[] arr) {
		// buy the first stock
		int buy = arr[0];
		int profit = 0; // Initial profit is 0;
		for (int i = 1; i < arr.length; i++) {
			if (buy > arr[i]) {  // if buy price is greater than current stock price then we will buy that stock
				buy = arr[i];
			} else if (arr[i] - buy > profit) { // previous profit < current profit then we'll a
				profit = arr[i] - buy;
			}
		}
		return profit;
	}

}
