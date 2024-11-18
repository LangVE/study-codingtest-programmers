package study.daybreak.programmers.year2024.week6;

import org.junit.Assert;
import org.junit.Test;

public class Lessons42895Test {
    @Test
    public void test() {
        // given
        int n = 5;
        int number = 12;

        // when
        Lessons42895 lessons42895 = new Lessons42895();
        int actual = lessons42895.solution(n, number);

        // then
        int expected = 4;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_case2() {
        // given
        int n = 2;
        int number = 11;

        // when
        Lessons42895 lessons42895 = new Lessons42895();
        int actual = lessons42895.solution(n, number);

        // then
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }


}