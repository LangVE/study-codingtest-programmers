package study.daybreak.programmers.year2024.week1;

import org.junit.Assert;
import org.junit.Test;

public class Lessons181922Test {
    @Test
    public void test() {
        // given
        int[] arr = new int[]{0, 1, 2, 4, 3};
        int[][] queries = new int[][]{{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};

        // when
        Lessons181922 lessons181922 = new Lessons181922();
        int[] actual = lessons181922.solution(arr, queries);

        // then
        int[] expected = {3, 2, 4, 6, 4};

        Assert.assertArrayEquals("", expected, actual);
    }
}