package study.daybreak.programmers.week1;

import org.junit.Assert;
import org.junit.Test;

public class CarpetTest {

    @Test
    public void solution() {
        // given
        int brown = 24;
        int yellow = 24;

        // when
        Carpet carpet = new Carpet();
        int[] actual = carpet.solution(brown, yellow);

        // then
        Assert.assertArrayEquals(new int[]{8, 6}, actual);
    }
}