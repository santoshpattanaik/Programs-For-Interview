package hackerrank;

public class BuySellMaxProfit {
    public static void main(String[] args) {
        //int[] price = {7, 1, 5, 3, 6, 4};
        int[] price = {100, 180, 260, 310, 40, 535, 695 };
        maximumProfit(price);
    }

    private static int maximumProfit(int[] price) {
        int min_price=price[0];
        int max_price=price[0];
        int max_profit = 0;
        int cost=0;
        int max_cost=0;
        for (int i = 0; i < price.length; i++) {
            min_price = Math.min(min_price,price[i]);
             cost = price[i]-min_price;
            max_price = Math.max(max_price,price[i]);
            max_profit = max_price-min_price;
            max_cost = Math.max(max_cost,cost);
            System.out.println(max_cost);
            System.out.println(min_price+" -> "+max_price +" -> " +max_profit +" -> "+max_cost );
        }
        return max_profit;
    }
}
