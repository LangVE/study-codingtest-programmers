package study.daybreak.programmers.year2024.week11;

import org.junit.Assert;
import org.junit.Test;

public class Lessons42627Test {

    @Test
    public void test() {
        // given
        int[][] jobs = {{0, 3}, {1, 9}, {3, 5}};

        // when
        Lessons42627 lessons42627 = new Lessons42627();
        int actual = lessons42627.solution(jobs);

        // then
        Assert.assertEquals(8, actual);
    }

}