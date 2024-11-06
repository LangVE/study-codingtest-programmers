package study.daybreak.programmers.year2024.week2;

import org.junit.Assert;
import org.junit.Test;

public class Lessons181855Test {
    @Test
    public void test() {
        // given
        String[] strArr = {"a", "bc", "d", "efg", "hi"};

        // when
        Lessons181855 lessons181855 = new Lessons181855();
        int actual = lessons181855.solution(strArr);

        // then
        Assert.assertEquals(2, actual);
    }

    @Test
    public void testWhenLength30() {
        // given
        String[] strArr = {"a", "bc", "d", "efg", "asdfgzxcvbqwertasdfgzxcvbasdfg"};

        // when
        Lessons181855 lessons181855 = new Lessons181855();
        int actual = lessons181855.solution(strArr);

        // then
        Assert.assertEquals(2, actual);
    }

}