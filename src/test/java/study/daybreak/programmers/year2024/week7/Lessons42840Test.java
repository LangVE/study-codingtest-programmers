package study.daybreak.programmers.year2024.week7;

import org.junit.Assert;
import org.junit.Test;

public class Lessons42840Test {
    @Test
    public void test() {
        // given
        int[] answer = {1, 2, 3, 4, 5};

        // when
        Lessons42840 lessons42840 = new Lessons42840();
        int[] actual = lessons42840.solution(answer);

        // then
        Assert.assertArrayEquals(new int[]{1}, actual);
    }

    @Test
    public void test_case2() {
        // given
        int[] answer = {1, 3, 2, 4, 2};

        // when
        Lessons42840 lessons42840 = new Lessons42840();
        int[] actual = lessons42840.solution(answer);

        // then
        Assert.assertArrayEquals(new int[]{1, 2, 3}, actual);
    }

}