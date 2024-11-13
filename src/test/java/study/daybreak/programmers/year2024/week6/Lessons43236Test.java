package study.daybreak.programmers.year2024.week6;

import org.junit.Assert;
import org.junit.Test;

public class Lessons43236Test {
    @Test
    public void test() {
        // given
        int distance = 25;
        int[] rocks = {2, 14, 11, 21, 17};
        int n = 2;

        // when
        Lessons43236 lessons43236 = new Lessons43236();
        int actual = lessons43236.solution(distance, rocks, n);

        // then
        int expected = 4;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_case2() {
        // given
        int distance = 25;
        int[] rocks = {1, 2, 3, 4, 5};
        int n = 2;

        // when
        Lessons43236 lessons43236 = new Lessons43236();
        int actual = lessons43236.solution(distance, rocks, n);

        // then
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_case3() {
        // given
        int distance = 1;
        int[] rocks = {1};
        int n = 1;

        // when
        Lessons43236 lessons43236 = new Lessons43236();
        int actual = lessons43236.solution(distance, rocks, n);

        // then
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }
}