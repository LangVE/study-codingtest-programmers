package study.daybreak.programmers.year2024.week1;

import org.junit.Assert;
import org.junit.Test;

public class Lessons181903Test {
    @Test
    public void test() {
        int q = 3;
        int r = 1;
        String code = "qjnwezgrpirldywt";
        Lessons181903 lessons181903 = new Lessons181903();
        String actual = lessons181903.solution(q, r, code);

        Assert.assertEquals("", "jerry", actual);
        System.out.println(actual);
    }

    @Test
    public void test1() {
        int q = 1;
        int r = 0;
        String code = "programmers";
        Lessons181903 lessons181903 = new Lessons181903();
        String actual = lessons181903.solution(q, r, code);

        Assert.assertEquals("", "programmers", actual);
        System.out.println(actual);
    }
}