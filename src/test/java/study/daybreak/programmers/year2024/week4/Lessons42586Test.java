package study.daybreak.programmers.year2024.week4;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Lessons42586Test {
    @Test
    public void test() {
        // given
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        // when
        Lessons42586 lessons42586 = new Lessons42586();
        int[] actual = lessons42586.solution(progresses, speeds);


        Arrays.stream(actual).forEach(i -> System.out.println("actual = " + i));

        // then
        int[] expected = {2, 1};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_case2() {
        // given
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        // when
        Lessons42586 lessons42586 = new Lessons42586();
        int[] actual = lessons42586.solution(progresses, speeds);


        Arrays.stream(actual).forEach(i -> System.out.println("actual = " + i));

        // then
        int[] expected = {1, 3, 2};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_case3() {
        // given
        int[] progresses = {95, 90, 99, 99, 95, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        // when
        Lessons42586 lessons42586 = new Lessons42586();
        int[] actual = lessons42586.solution(progresses, speeds);


        Arrays.stream(actual).forEach(i -> System.out.println("actual = " + i));

        // then
        int[] expected = {1, 5};
        Assert.assertArrayEquals(expected, actual);
    }

}