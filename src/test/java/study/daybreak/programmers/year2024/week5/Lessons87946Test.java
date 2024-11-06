package study.daybreak.programmers.year2024.week5;

import org.junit.Assert;
import org.junit.Test;

public class Lessons87946Test {

    @Test
    public void test_case1() {
        // given
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};

        // when
        Lessons87946 lessons87946 = new Lessons87946();
        int actual = lessons87946.solution(k, dungeons);

        // then
        int expected = 3;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void test_case2() {
        // given
        int k = 0;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};

        // when
        Lessons87946 lessons87946 = new Lessons87946();
        int actual = lessons87946.solution(k, dungeons);

        // then
        int expected = 0;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void test_case3() {
        // given
        int k = 5000;
        int[][] dungeons = {{500, 500}, {500, 500}, {500, 500}, {500, 500}, {500, 500}, {500, 500}, {500, 500}, {500, 500}};

        // when
        Lessons87946 lessons87946 = new Lessons87946();
        int actual = lessons87946.solution(k, dungeons);

        // then
        int expected = 8;
        Assert.assertEquals(expected, actual);

    }
}