package study.daybreak.programmers.week3;

public class StockPrice {
    private int[] p;
    private int[] count;

    public int[] solution(int[] prices) {
        p = prices;
        count = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int tmp = prices[i];

            compare(i, tmp);
        }

        return count;
    }

    private void compare(int i, int tmp) {
        for (int j = i + 1; j < p.length; j++) {
            int target = p[j];
            count[i]++;
            if (tmp > target) {
                break;
            }
        }
    }
}
