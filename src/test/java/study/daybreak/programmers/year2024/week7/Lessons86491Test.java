package study.daybreak.programmers.year2024.week7;

import org.junit.Assert;
import org.junit.Test;

public class Lessons86491Test {

    @Test
    public void test() {
        // given
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        // when
        Lessons86491 lessons86491 = new Lessons86491();
        int actual = lessons86491.solution(sizes);

        // then
        int expected = 4000;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_case2() {
        // given
        int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};

        // when
        Lessons86491 lessons86491 = new Lessons86491();
        int actual = lessons86491.solution(sizes);

        // then
        int expected = 120;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_case3() {
        // given
        int[][] sizes = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};

        // when
        Lessons86491 lessons86491 = new Lessons86491();
        int actual = lessons86491.solution(sizes);

        // then
        int expected = 133;
        Assert.assertEquals(expected, actual);
    }
}