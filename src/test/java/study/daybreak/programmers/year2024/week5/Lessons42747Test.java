package study.daybreak.programmers.year2024.week5;

import org.junit.Assert;
import org.junit.Test;

public class Lessons42747Test {
    @Test
    public void test_case1() {
        // given
        int[] citations = {3, 0, 6, 1, 5};

        // when
        Lessons42747 lessons42747 = new Lessons42747();
        int actual = lessons42747.solution(citations);

        // then
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_case2() {
        // given
        int[] citations = {0};

        // when
        Lessons42747 lessons42747 = new Lessons42747();
        int actual = lessons42747.solution(citations);

        // then
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_case3() {
        // given
        int[] citations = {10000};

        // when
        Lessons42747 lessons42747 = new Lessons42747();
        int actual = lessons42747.solution(citations);

        // then
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_case4() {
        // given
        int[] citations = {2, 2};

        // when
        Lessons42747 lessons42747 = new Lessons42747();
        int actual = lessons42747.solution(citations);

        // then
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }
}