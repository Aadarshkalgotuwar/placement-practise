public class Stock {
    public static int buyAndSellstock(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int max_profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                // profit

                int profit = prices[i] - buyPrice;// todays profit
                max_profit = Math.max(max_profit, profit);
            } else {
                buyPrice = prices[i];
            }

        }
        return max_profit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyAndSellstock(prices));

    }
}