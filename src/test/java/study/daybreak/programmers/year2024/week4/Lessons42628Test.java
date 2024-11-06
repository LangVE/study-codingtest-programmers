package study.daybreak.programmers.year2024.week4;

import org.junit.Assert;
import org.junit.Test;

public class Lessons42628Test {

    @Test
    public void test_case1() {
        // given
        String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};

        // when
        Lessons42628 lessons42628 = new Lessons42628();
        int[] actual = lessons42628.solution(operations);

        // then
        int[] expected = {0, 0};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_case2() {
        // given
        String[] operations = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};

        // when
        Lessons42628 lessons42628 = new Lessons42628();
        int[] actual = lessons42628.solution(operations);

        // then
        int[] expected = {333, -45};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_case3() {
        // given
        String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "D 1", "I 123", "D -1"};

        // when
        Lessons42628 lessons42628 = new Lessons42628();
        int[] actual = lessons42628.solution(operations);

        // then
        int[] expected = {0, 0};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_case4() {
        // given
        String[] operations = {"I 16", "I 16", "I 16", "D -1"};

        // when
        Lessons42628 lessons42628 = new Lessons42628();
        int[] actual = lessons42628.solution(operations);

        // then
        int[] expected = {16, 16};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_case5() {
        // given
        String[] operations = {"D -1"};

        // when
        Lessons42628 lessons42628 = new Lessons42628();
        int[] actual = lessons42628.solution(operations);

        // then
        int[] expected = {0, 0};
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void test_case6() {
        // given
        String[] operations = {"I 10", "I 20", "D 1", "I 30", "I 40", "D -1", "D -1"};

        // when
        Lessons42628 lessons42628 = new Lessons42628();
        int[] actual = lessons42628.solution(operations);

        // then
        int[] expected = {40, 40};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_case7() {
        // given
        String[] operations = {"I 1", "I 3", "I 5", "I 7", "I 9", "D -1", "D -1", "D 1", "I 2", "D 1", "D 1"};

        // when
        Lessons42628 lessons42628 = new Lessons42628();
        int[] actual = lessons42628.solution(operations);

        // then
        int[] expected = {2, 2};
        Assert.assertArrayEquals(expected, actual);
    }
}