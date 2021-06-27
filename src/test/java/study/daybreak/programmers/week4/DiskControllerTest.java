package study.daybreak.programmers.week4;

import org.junit.Assert;
import org.junit.Test;

public class DiskControllerTest {
    @Test
    public void test_case1() {
        // given
        int[][] jobs = new int[][]{{0, 3}, {1, 9}, {2, 6}};

        // when
        DiskController diskController = new DiskController();
        int actual = diskController.solution(jobs);

        // then
        Assert.assertEquals(9, actual);
    }

    @Test
    public void test_case2() {
        // given
        int[][] jobs = new int[][]{{0, 3}, {1, 9}, {2, 6}, {20, 2}};

        // when
        DiskController diskController = new DiskController();
        int actual = diskController.solution(jobs);

        // then
        Assert.assertEquals(7, actual);
    }

    @Test
    public void test_case3() {
        // given
        int[][] jobs = new int[][]{{0, 3}, {1, 9}, {2, 6}, {20, 2}, {20, 2}};

        // when
        DiskController diskController = new DiskController();
        int actual = diskController.solution(jobs);

        // then
        Assert.assertEquals(6, actual);
    }

    @Test
    public void test_case4() {
        // given
        int[][] jobs = new int[][]{{0, 9}, {0, 4}, {0, 5}, {0, 7}, {0, 3}};

        // when
        DiskController diskController = new DiskController();
        int actual = diskController.solution(jobs);

        // then
        Assert.assertEquals(13, actual);
    }

    @Test
    public void test_case5() {
        // given
        int[][] jobs = new int[][]{{0, 3}, {4, 6}};

        // when
        DiskController diskController = new DiskController();
        int actual = diskController.solution(jobs);

        // then
        Assert.assertEquals(4, actual);
    }

    @Test
    public void test_case6() {
        // given
        int[][] jobs = new int[][]{{0, 3}, {1, 9}, {500, 6}};

        // when
        DiskController diskController = new DiskController();
        int actual = diskController.solution(jobs);

        // then
        Assert.assertEquals(6, actual);
    }

    @Test
    public void test_case7() {
        // given
        int[][] jobs = new int[][]{{1, 9}, {0, 11}};

        // when
        DiskController diskController = new DiskController();
        int actual = diskController.solution(jobs);

        // then
        Assert.assertEquals(15, actual);
    }

    @Test
    public void test_case8() {
        // given
        int[][] jobs = new int[][]{{0, 10}, {2, 10}, {9, 10}, {15, 2}};

        // when
        DiskController diskController = new DiskController();
        int actual = diskController.solution(jobs);

        // then
        Assert.assertEquals(14, actual);
    }

    @Test
    public void test_case9() {
        // given
        int[][] jobs = new int[][]{{0, 10}, {2, 12}, {9, 19}, {15, 17}};

        // when
        DiskController diskController = new DiskController();
        int actual = diskController.solution(jobs);

        // then
        Assert.assertEquals(25, actual);
    }

    @Test
    public void test_case10() {
        // given
        int[][] jobs = new int[][]{{0, 1}};

        // when
        DiskController diskController = new DiskController();
        int actual = diskController.solution(jobs);

        // then
        Assert.assertEquals(1, actual);
    }

    @Test
    public void test_case11() {
        // given
        int[][] jobs = new int[][]{{1000, 1000}};

        // when
        DiskController diskController = new DiskController();
        int actual = diskController.solution(jobs);

        // then
        Assert.assertEquals(1000, actual);
    }

    @Test
    public void test_case12() {
        // given
        int[][] jobs = new int[][]{{0, 1}, {0, 1}, {0, 1}};

        // when
        DiskController diskController = new DiskController();
        int actual = diskController.solution(jobs);

        // then
        Assert.assertEquals(2, actual);
    }


    @Test
    public void test_case13() {
        // given
        int[][] jobs = new int[][]{{0, 1}, {0, 1}, {0, 1}, {0, 1}};

        // when
        DiskController diskController = new DiskController();
        int actual = diskController.solution(jobs);

        // then
        Assert.assertEquals(2, actual);
    }

    @Test
    public void test_case14() {
        // given
        int[][] jobs = new int[][]{{100, 100}, {1000, 1000}};

        // when
        DiskController diskController = new DiskController();
        int actual = diskController.solution(jobs);

        // then
        Assert.assertEquals(550, actual);
    }

    @Test
    public void test_case15() {
        // given
        int[][] jobs = new int[][]{{10, 10}, {30, 10}, {50, 2}, {51, 2}};

        // when
        DiskController diskController = new DiskController();
        int actual = diskController.solution(jobs);

        // then
        Assert.assertEquals(6, actual);
    }

    @Test
    public void test_case16() {
        // given
        int[][] jobs = new int[][]{{10, 10}, {30, 10}, {50, 2}, {51, 2}};

        // when
        DiskController diskController = new DiskController();
        int actual = diskController.solution(jobs);

        // then
        Assert.assertEquals(6, actual);
    }
}