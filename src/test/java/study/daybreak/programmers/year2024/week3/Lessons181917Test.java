package study.daybreak.programmers.year2024.week3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lessons181917Test {
    @Test
    public void test() {
        // given
        boolean x1 = false;
        boolean x2 = true;
        boolean x3 = true;
        boolean x4 = true;

        // when
        Lessons181917 lessons181917 = new Lessons181917();
        boolean actual = lessons181917.solution(x1, x2, x3, x4);

        // then
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        // given
        boolean x1 = true;
        boolean x2 = false;
        boolean x3 = false;
        boolean x4 = false;

        // when
        Lessons181917 lessons181917 = new Lessons181917();
        boolean actual = lessons181917.solution(x1, x2, x3, x4);

        // then
        boolean expected = false;
        assertEquals(expected, actual);
    }
}