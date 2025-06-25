package study.daybreak.programmers.year2024.week11;

import org.junit.Assert;
import org.junit.Test;

public class Lessons84021Test {

    @Test
    public void test() {
        // given
        int[][] gameBorad = {{1, 0}, {1, 0}};
        int[][] table = {{1, 0}, {1, 0}};

        // when
        Lessons84021 lessons84021 = new Lessons84021();
        int actual = lessons84021.solution(gameBorad, table);

        // then
        Assert.assertEquals(2, actual);
    }

    @Test
    public void test_case1() {
        // given
        int[][] gameBorad = {{1, 0}, {0, 0}};
        int[][] table = {{0, 1}, {1, 1}};

        // when
        Lessons84021 lessons84021 = new Lessons84021();
        int actual = lessons84021.solution(gameBorad, table);

        // then
        Assert.assertEquals(3, actual);
    }

    @Test
    public void test_case2() {
        // given
        int[][] gameBorad = {{1, 0}, {1, 0}};
        int[][] table = {{1, 1}, {0, 0}};

        // when
        Lessons84021 lessons84021 = new Lessons84021();
        int actual = lessons84021.solution(gameBorad, table);

        // then
        Assert.assertEquals(2, actual);
    }


    @Test
    public void test_case0() {
        // given
        int[][] gameBorad = {{1, 1, 0, 0, 1, 0}, {0, 0, 1, 0, 1, 0}, {0, 1, 1, 0, 0, 1}, {1, 1, 0, 1, 1, 1}, {1, 0, 0, 0, 1, 0}, {0, 1, 1, 1, 0, 0}};
        int[][] table = {{1, 0, 0, 1, 1, 0}, {1, 0, 1, 0, 1, 0}, {0, 1, 1, 0, 1, 1}, {0, 0, 1, 0, 0, 0}, {1, 1, 0, 1, 1, 0}, {0, 1, 0, 0, 0, 0}};

        // when
        Lessons84021 lessons84021 = new Lessons84021();
        int actual = lessons84021.solution(gameBorad, table);

        // then
        Assert.assertEquals(14, actual);
    }
}