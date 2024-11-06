package study.daybreak.programmers.year2024.week3;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Lessons181832Test {
    @Test
    public void test() {
        // given
        int n = 4;

        // when
        Lessons181832 lessons181832 = new Lessons181832();
        int[][] actual = lessons181832.solution(n);


        for (int y = 0; y < actual.length; y++) {
            for (int x = 0; x < actual[y].length; x++) {
                System.out.println("actual[" + y + "][" + x + "]:" + actual[y][x]);
            }
        }

        // then
        int[][] expected = {{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15, 6}, {10, 9, 8, 7}};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testCase5() {
        // given
        int n = 5;

        // when
        Lessons181832 lessons181832 = new Lessons181832();
        int[][] actual = lessons181832.solution(n);

        for (int y = 0; y < actual.length; y++) {
            for (int x = 0; x < actual[y].length; x++) {
                System.out.println("actual[" + y + "][" + x + "]:" + actual[y][x]);
            }
        }

        // then
        int[][] expected = {{1, 2, 3, 4, 5}, {16, 17, 18, 19, 6}, {15, 24, 25, 20, 7}, {14, 23, 22, 21, 8}, {13, 12, 11, 10, 9}};
        assertArrayEquals(expected, actual);
    }
}