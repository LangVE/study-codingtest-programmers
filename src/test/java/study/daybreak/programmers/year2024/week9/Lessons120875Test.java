package study.daybreak.programmers.year2024.week9;

import org.junit.Assert;
import org.junit.Test;

public class Lessons120875Test {

    @Test
    public void test() {
        // given
        int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};

        // when
        Lessons120875 lessons120875 = new Lessons120875();
        int actual = lessons120875.solution(dots);

        // then
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        int[][] dots = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};

        // when
        Lessons120875 lessons120875 = new Lessons120875();
        int actual = lessons120875.solution(dots);

        // then
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }
}