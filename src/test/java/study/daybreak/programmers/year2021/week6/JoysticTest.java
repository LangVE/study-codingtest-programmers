package study.daybreak.programmers.year2021.week6;

import org.junit.Assert;
import org.junit.Test;

public class JoysticTest {
    @Test
    public void test_case0() {
        // given
        String name = "AAA";

        // when
        Joystic joystic = new Joystic();
        int actual = joystic.solution(name);

        // then
        Assert.assertEquals(0, actual);
    }

    @Test
    public void test_case1() {
        // given
        String name = "JAN";

        // when
        Joystic joystic = new Joystic();
        int actual = joystic.solution(name);

        // then
        Assert.assertEquals(23, actual);
    }

    @Test
    public void test_case2() {
        // given
        String name = "JNA";

        // when
        Joystic joystic = new Joystic();
        int actual = joystic.solution(name);

        // then
        Assert.assertEquals(23, actual);
    }

    @Test
    public void test_case3() {
        // given
        String name = "JEROEN";

        // when
        Joystic joystic = new Joystic();
        int actual = joystic.solution(name);

        // then
        Assert.assertEquals(56, actual);
    }

    @Test
    public void test_case4() {
        // given
        String name = "ABAAAAAAAAABB";

        // when
        Joystic joystic = new Joystic();
        int actual = joystic.solution(name);

        // then
        Assert.assertEquals(7, actual);
    }

    @Test
    public void getIdxRight() {
        // given
        char[] nameArr = new char[]{'A', 'A', 'Z'};
        int idx = 0;

        // when
        Joystic joystic = new Joystic();
        int actual = joystic.getIdxRight(nameArr, idx);

        // then
        Assert.assertEquals(2, actual);
    }

    @Test
    public void getIdxRight_case2() {
        // given
        char[] nameArr = new char[]{'Z', 'A', 'A'};
        int idx = 1;

        // when
        Joystic joystic = new Joystic();
        int actual = joystic.getIdxRight(nameArr, idx);

        // then
        Assert.assertEquals(0, actual);
    }

    @Test
    public void getIdxRight_case3() {
        // given
        char[] nameArr = new char[]{'A', 'Z', 'A'};
        int idx = 2;

        // when
        Joystic joystic = new Joystic();
        int actual = joystic.getIdxRight(nameArr, idx);

        // then
        Assert.assertEquals(1, actual);
    }

    @Test
    public void getIdxLeft() {
        // given
        char[] nameArr = new char[]{'Z', 'A', 'A'};
        int idx = 2;

        // when
        Joystic joystic = new Joystic();
        int actual = joystic.getIdxLeft(nameArr, idx);

        // then
        Assert.assertEquals(0, actual);
    }

    @Test
    public void getIdxLeft_case2() {
        // given
        char[] nameArr = new char[]{'A', 'A', 'Z'};
        int idx = 1;

        // when
        Joystic joystic = new Joystic();
        int actual = joystic.getIdxLeft(nameArr, idx);

        // then
        Assert.assertEquals(2, actual);
    }

    @Test
    public void getIdxLeft_case3() {
        // given
        char[] nameArr = new char[]{'A', 'Z', 'A'};
        int idx = 0;

        // when
        Joystic joystic = new Joystic();
        int actual = joystic.getIdxLeft(nameArr, idx);

        // then
        Assert.assertEquals(1, actual);
    }

    @Test
    public void test_case5() {
        // given
        String name = "AAAAACANAAAAANANAAAAAA";

        // when
        Joystic joystic = new Joystic();
        int actual = joystic.solution(name);

        // then
        Assert.assertEquals(56, actual);
    }
}