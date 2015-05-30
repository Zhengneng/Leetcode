public class BestTimeBuyAndSell {
	public int maxProfit(int[] prices) {
		int[] min = new int[prices.length];
		int profit, max = 0;
		for (int i = 0; i < prices.length; i++) {
			if (i == 0)
				min[i] = prices[0];
			else
				min[i] = prices[i] < min[i-1] ? prices[i] : min[i - 1];
			profit = prices[i] - min[i];
			max = profit > max ? profit : max;

		}
		return max;
	}
}
