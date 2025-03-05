package study.daybreak.programmers.year2021.week3;

import org.junit.Assert;
import org.junit.Test;

public class StockPriceTest {
    @Test
    public void test_case1() {
        // given
        int[] prices = new int[]{1, 2, 3, 2, 3};

        // when
        StockPrice stockPrice = new StockPrice();
        int[] actual = stockPrice.solution(prices);

        // then
        Assert.assertArrayEquals(new int[]{4, 3, 1, 1, 0}, actual);
    }
}