package study.daybreak.programmers.year2024.week7;

import org.junit.Assert;
import org.junit.Test;

public class Lessons43162Test {
    @Test
    public void test() {
        // given
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};

        // when
        Lessons43162 lessons43162 = new Lessons43162();
        int actual = lessons43162.solution(n, computers);

        // then
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_case2() {
        // given
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};

        // when
        Lessons43162 lessons43162 = new Lessons43162();
        int actual = lessons43162.solution(n, computers);

        // then
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    // 모두 연결된 케이스
    @Test
    public void test_case3() {
        // given
        int n = 3;
        int[][] computers = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};

        // when
        Lessons43162 lessons43162 = new Lessons43162();
        int actual = lessons43162.solution(n, computers);

        // then
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    // n 3 모두 떨어진 케이스
    @Test
    public void test_case4_1() {
        // given
        int n = 3;
        int[][] computers = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};

        // when
        Lessons43162 lessons43162 = new Lessons43162();
        int actual = lessons43162.solution(n, computers);

        // then
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }

    // n 4 모두 떨어진 케이스
    @Test
    public void test_case4_2() {
        // given
        int n = 4;
        int[][] computers = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};

        // when
        Lessons43162 lessons43162 = new Lessons43162();
        int actual = lessons43162.solution(n, computers);

        // then
        int expected = 4;
        Assert.assertEquals(expected, actual);
    }


    // 2,3 연결 케이스
    @Test
    public void test_case5() {
        // given
        int n = 3;
        int[][] computers = {{1, 0, 0}, {0, 1, 1}, {0, 1, 1}};

        // when
        Lessons43162 lessons43162 = new Lessons43162();
        int actual = lessons43162.solution(n, computers);

        // then
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    // n 1 인 케이스
    @Test
    public void test_case6() {
        // given
        int n = 1;
        int[][] computers = {{1}};

        // when
        Lessons43162 lessons43162 = new Lessons43162();
        int actual = lessons43162.solution(n, computers);

        // then
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    // n 4 이고 1,4 2,3 연결 케이스
    @Test
    public void test_case7() {
        // given
        int n = 4;
        int[][] computers = {{1, 0, 0, 1}, {0, 1, 1, 0}, {0, 1, 1, 0}, {1, 0, 0, 1}};

        // when
        Lessons43162 lessons43162 = new Lessons43162();
        int actual = lessons43162.solution(n, computers);

        // then
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    // n 4 이고 1,4,3,2 연결 케이스
    @Test
    public void test_case8() {
        // given
        int n = 4;
        int[][] computers = {{1, 0, 0, 1}, {0, 1, 1, 0}, {0, 1, 1, 1}, {1, 0, 1, 1}};

        // when
        Lessons43162 lessons43162 = new Lessons43162();
        int actual = lessons43162.solution(n, computers);

        // then
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    // n 4 이고 1,4,3,2 연결 케이스
    @Test
    public void test_case9() {
        // given
        int n = 4;
        int[][] computers = {
                {1, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 1, 1},
                {0, 0, 1, 1}
        };

        // when
        Lessons43162 lessons43162 = new Lessons43162();
        int actual = lessons43162.solution(n, computers);

        // then
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    // n 5 이고 컴퓨터 0-1이 하나의 네트워크, 2-3이 하나의 네트워크, 컴퓨터 4가 독립된 네트워크
    @Test
    public void test_case10() {
        // given
        int n = 5;
        int[][] computers = {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 1, 1, 0},
                {0, 0, 1, 1, 0},
                {0, 0, 0, 0, 1}
        };

        // when
        Lessons43162 lessons43162 = new Lessons43162();
        int actual = lessons43162.solution(n, computers);

        // then
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }

    // n 6 이고 모든 컴퓨터가 간접적으로 연결된 하나의 네트워크
    @Test
    public void test_case11() {
        // given
        int n = 6;
        int[][] computers = {
                {1, 1, 0, 0, 1, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 1, 1, 1, 0, 0},
                {0, 0, 1, 1, 1, 0},
                {1, 0, 0, 1, 1, 1},
                {0, 0, 0, 0, 1, 1}
        };

        // when
        Lessons43162 lessons43162 = new Lessons43162();
        int actual = lessons43162.solution(n, computers);

        // then
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_case12() {
        // given
        int n = 7;
        int[][] computers = {
                {1, 1, 0, 0, 0, 0, 0},
                {1, 1, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1},
                {0, 0, 0, 0, 1, 1, 1},
                {0, 0, 0, 0, 1, 1, 1}
        };

        // when
        Lessons43162 lessons43162 = new Lessons43162();
        int actual = lessons43162.solution(n, computers);

        // then
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }


}