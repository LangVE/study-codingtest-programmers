package study.daybreak.programmers.week6;

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
}