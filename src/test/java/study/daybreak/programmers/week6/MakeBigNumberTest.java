package study.daybreak.programmers.week6;

import org.junit.Assert;
import org.junit.Test;

public class MakeBigNumberTest {
    @Test
    public void test_case1() {
        // given
        String number = "1924";
        int k = 2;

        // when
        MakeBigNumber makeBigNumber = new MakeBigNumber();
        String actual = makeBigNumber.solution(number, k);

        // then
        Assert.assertEquals("94", actual);
    }

    @Test
    public void test_case2() {
        // given
        String number = "1231234";
        int k = 3;

        // when
        MakeBigNumber makeBigNumber = new MakeBigNumber();
        String actual = makeBigNumber.solution(number, k);

        // then
        Assert.assertEquals("3234", actual);
    }

    @Test
    public void test_case3() {
        // given
        String number = "4177252841";
        int k = 4;

        // when
        MakeBigNumber makeBigNumber = new MakeBigNumber();
        String actual = makeBigNumber.solution(number, k);

        // then
        Assert.assertEquals("775841", actual);
    }
}