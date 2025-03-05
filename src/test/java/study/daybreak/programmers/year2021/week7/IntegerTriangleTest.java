package study.daybreak.programmers.year2021.week7;

import org.junit.Assert;
import org.junit.Test;

public class IntegerTriangleTest {

    @Test
    public void solution_case1() {
        // given
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};

        // when
        IntegerTriangle integerTriangle = new IntegerTriangle();
        int actual = integerTriangle.solution(triangle);

        // then
        Assert.assertEquals(30, actual);
    }
}