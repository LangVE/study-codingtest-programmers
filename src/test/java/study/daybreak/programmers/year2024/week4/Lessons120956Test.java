package study.daybreak.programmers.year2024.week4;

import org.junit.Assert;
import org.junit.Test;

public class Lessons120956Test {

    @Test
    public void test_case1() {
        // given
        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};

        // when
        Lessons120956 lessons120956 = new Lessons120956();
        int actual = lessons120956.solution(babbling);

        // then
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_case2() {
        // given
        String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

        // when
        Lessons120956 lessons120956 = new Lessons120956();
        int actual = lessons120956.solution(babbling);

        // then
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }
}