package study.daybreak.programmers.year2024.week3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Lessons181897Test {
    private int n;
    private int[] slicer;

    private int[] num_list;

    private int[] expected;

    public Lessons181897Test(int n, int[] slicer, int[] num_list, int[] expected) {
        this.n = n;
        this.slicer = slicer;
        this.num_list = num_list;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection getTestParameters() {
        return Arrays.asList(new Object[][]{
                {3, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{2, 3, 4, 5, 6}},
                {4, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{2, 4, 6}}
        });
    }

    @Test
    public void test() {
        // given
//        int n = 3;
//        int[] slicer = {1, 5, 2};
//        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // when
        Lessons181897 lessons181897 = new Lessons181897();
        int[] actual = lessons181897.solution(n, slicer, num_list);

        // then
//        int[] expected = {2, 3, 4, 5, 6};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testCase4() {
        // given
//        int n = 4;
//        int[] slicer = {1, 5, 2};
//        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // when
        Lessons181897 lessons181897 = new Lessons181897();
        int[] actual = lessons181897.solution(n, slicer, num_list);

        // then
//        int[] expected = {2, 4, 6};
        Assert.assertArrayEquals(expected, actual);
    }
}