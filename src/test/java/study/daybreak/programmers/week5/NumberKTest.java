package study.daybreak.programmers.week5;

import org.junit.Assert;
import org.junit.Test;

public class NumberKTest {
    @Test
    public void test_case1() {
        // given
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        // when
        NumberK numberK = new NumberK();
        int[] actual = numberK.solution(array, commands);

        // then
        Assert.assertArrayEquals(new int[]{5, 6, 3}, actual);
    }
}
