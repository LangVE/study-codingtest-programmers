package study.daybreak.programmers.year2024.week6;

import org.junit.Assert;
import org.junit.Test;

public class Lessons49191Test {
    @Test
    public void test() {
        // given
        int n = 5;
        int[][] results = {{4, 3}, {4, 2}, {3, 2}, {1, 2}, {2, 5}};

        // when
        Lessons49191 lessons49191 = new Lessons49191();
        int actual = lessons49191.solution(n, results);

        // then
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_case2() {
        // given
        int n = 5;
        int[][] results = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};

        // when
        Lessons49191 lessons49191 = new Lessons49191();
        int actual = lessons49191.solution(n, results);

        // then
        int expected = 5;
        Assert.assertEquals(expected, actual);
    }
}