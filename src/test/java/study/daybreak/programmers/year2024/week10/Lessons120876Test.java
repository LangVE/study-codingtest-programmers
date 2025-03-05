package study.daybreak.programmers.year2024.week10;

import org.junit.Assert;
import org.junit.Test;

public class Lessons120876Test {

    @Test
    public void test() {
        // given
        int[][] lines = {{0, 2}, {-3, -1}, {-2, 1}};

        // when
        Lessons120876 lessons120876 = new Lessons120876();
        int actual = lessons120876.solution(lines);

        // then
        Assert.assertEquals(2, actual);
    }

    @Test
    public void test_case1() {
        // given
        int[][] lines = {{0, 1}, {2, 5}, {3, 9}};

        // when
        Lessons120876 lessons120876 = new Lessons120876();
        int actual = lessons120876.solution(lines);

        // then
        Assert.assertEquals(2, actual);
    }

    @Test
    public void test_case2() {
        // given
        int[][] lines = {{-1, 1}, {1, 3}, {3, 9}};

        // when
        Lessons120876 lessons120876 = new Lessons120876();
        int actual = lessons120876.solution(lines);

        // then
        Assert.assertEquals(0, actual);
    }

    @Test
    public void test_case3() {
        // given
        int[][] lines = {{0, 5}, {3, 9}, {1, 10}};

        // when
        Lessons120876 lessons120876 = new Lessons120876();
        int actual = lessons120876.solution(lines);

        // then
        Assert.assertEquals(8, actual);
    }

}