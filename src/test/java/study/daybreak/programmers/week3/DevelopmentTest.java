package study.daybreak.programmers.week3;

import org.junit.Assert;
import org.junit.Test;

public class DevelopmentTest {
    @Test
    public void test_case1() {
        // given
        int[] progresses = new int[]{93, 30, 55};
        int[] speeds = new int[]{1, 30, 5};

        // when
        Development development = new Development();
        int[] actual = development.solution(progresses, speeds);

        // then
        Assert.assertArrayEquals(new int[]{2, 1}, actual);
    }

    @Test
    public void test_case2() {
        // given
        int[] progresses = new int[]{95, 90, 99, 99, 80, 99};
        int[] speeds = new int[]{1, 1, 1, 1, 1, 1};

        // when
        Development development = new Development();
        int[] actual = development.solution(progresses, speeds);

        // then
        Assert.assertArrayEquals(new int[]{1, 3, 2}, actual);
    }
}