package study.daybreak.programmers.year2024.week1;

import org.junit.Assert;
import org.junit.Test;

public class Lessons181894Test {
    @Test
    public void test1() {
        // 2 없는 케이스
        // given
        int[] arr = {1, 1, 1};

        // when
        Lessons181894 lessons181894 = new Lessons181894();
        int[] actual = lessons181894.solution(arr);

        // then
        int[] expected = {-1};
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void test2() {
        // 2 가 1개 있는 경우 (정방향 탐색으로 2를 마지막 인덱스에 발견했다면)
        // given
        int[] arr = {1, 1, 2};

        // when
        Lessons181894 lessons181894 = new Lessons181894();
        int[] actual = lessons181894.solution(arr);

        // then
        int[] expected = {2};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        // 2 가 1개 있는 경우 (역방향 탐색으로 2를 발견 못함)
        // given
        int[] arr = {1, 2, 1};

        // when
        Lessons181894 lessons181894 = new Lessons181894();
        int[] actual = lessons181894.solution(arr);

        // then
        int[] expected = {2};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test4() {
        // 2 가 2개 이상 경우 (역방향 탐색으로 2를 발견)
        // given
        int[] arr = {1, 2, 1, 4, 5, 2, 9};

        // when
        Lessons181894 lessons181894 = new Lessons181894();
        int[] actual = lessons181894.solution(arr);

        for (int i = 0; i < actual.length; i++) {
            System.out.print(actual[i] + " ");
        }


        // then
        int[] expected = {2, 1, 4, 5, 2};
        Assert.assertArrayEquals(expected, actual);
    }

}