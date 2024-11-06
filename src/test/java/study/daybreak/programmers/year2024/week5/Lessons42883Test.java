package study.daybreak.programmers.year2024.week5;

import org.junit.Assert;
import org.junit.Test;

public class Lessons42883Test {
    @Test
    public void test() {
        // given
        String number = "1924";
        int k = 2;

        // when
        Lessons42883 lessons42883 = new Lessons42883();
        String actual = lessons42883.solution(number, k);

        // then
        String expected = "94";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_case2() {
        // given
        String number = "1231234";
        int k = 3;

        // when
        Lessons42883 lessons42883 = new Lessons42883();
        String actual = lessons42883.solution(number, k);

        // then
        String expected = "3234";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_case3() {
        // given
        String number = "4177252841";
        int k = 4;

        // when
        Lessons42883 lessons42883 = new Lessons42883();
        String actual = lessons42883.solution(number, k);

        // then
        String expected = "775841";
        Assert.assertEquals(expected, actual);
    }
}