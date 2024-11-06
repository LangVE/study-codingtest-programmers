package study.daybreak.programmers.year2024.week4;

import org.junit.Assert;
import org.junit.Test;

public class Lessons42579Test {

    @Test
    public void test_case1() {
        // given
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        // when
        Lessons42579 lessons42579 = new Lessons42579();
        int[] actual = lessons42579.solution(genres, plays);

        // then
        int[] expecteds = {4, 1, 3, 0};
        Assert.assertArrayEquals(expecteds, actual);
    }

    @Test
    public void test_case2() {
        // given
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 500, 500, 2500};

        // when
        Lessons42579 lessons42579 = new Lessons42579();
        int[] actual = lessons42579.solution(genres, plays);

        // then
        int[] expecteds = {4, 1, 0, 2};
        Assert.assertArrayEquals(expecteds, actual);
    }
}