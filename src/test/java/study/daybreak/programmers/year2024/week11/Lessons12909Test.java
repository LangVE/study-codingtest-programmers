package study.daybreak.programmers.year2024.week11;

import org.junit.Assert;
import org.junit.Test;

public class Lessons12909Test {
    @Test
    public void test() {
        // given
        String s = "()()";

        // when
        Lessons12909 lessons12909 = new Lessons12909();
        boolean actual = lessons12909.solution(s);

        // then
        Assert.assertEquals(true, actual);
    }

    @Test
    public void test1() {
        // given
        String s = "(())()";

        // when
        Lessons12909 lessons12909 = new Lessons12909();
        boolean actual = lessons12909.solution(s);

        // then
        Assert.assertEquals(true, actual);
    }

    @Test
    public void test2() {
        // given
        String s = ")()(";

        // when
        Lessons12909 lessons12909 = new Lessons12909();
        boolean actual = lessons12909.solution(s);

        // then
        Assert.assertEquals(false, actual);
    }

    @Test
    public void test3() {
        // given
        String s = "(()(";

        // when
        Lessons12909 lessons12909 = new Lessons12909();
        boolean actual = lessons12909.solution(s);

        // then
        Assert.assertEquals(false, actual);
    }

}