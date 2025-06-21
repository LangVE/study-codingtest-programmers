package study.daybreak.programmers.year2024.week11;

import org.junit.Assert;
import org.junit.Test;

public class Lessons181916Test {

    @Test
    public void test_case1() {
        // given
        int a = 2;
        int b = 2;
        int c = 2;
        int d = 2;

        // when
        Lessons181916 lessons181916 = new Lessons181916();
        int actual = lessons181916.solution(a, b, c, d);

        // then
        Assert.assertEquals(2222, actual);
    }

    @Test
    public void test_case2() {
        // given
        int a = 4;
        int b = 1;
        int c = 4;
        int d = 4;

        // when
        Lessons181916 lessons181916 = new Lessons181916();
        int actual = lessons181916.solution(a, b, c, d);

        // then
        Assert.assertEquals(1681, actual);
    }

    @Test
    public void test_case3() {
        // given
        int a = 6;
        int b = 3;
        int c = 3;
        int d = 6;

        // when
        Lessons181916 lessons181916 = new Lessons181916();
        int actual = lessons181916.solution(a, b, c, d);

        // then
        Assert.assertEquals(27, actual);
    }

    @Test
    public void test_case4() {
        // given
        int a = 2;
        int b = 5;
        int c = 2;
        int d = 6;

        // when
        Lessons181916 lessons181916 = new Lessons181916();
        int actual = lessons181916.solution(a, b, c, d);

        // then
        Assert.assertEquals(30, actual);
    }

    @Test
    public void test_case5() {
        // given
        int a = 6;
        int b = 4;
        int c = 2;
        int d = 5;

        // when
        Lessons181916 lessons181916 = new Lessons181916();
        int actual = lessons181916.solution(a, b, c, d);

        // then
        Assert.assertEquals(2, actual);
    }
}