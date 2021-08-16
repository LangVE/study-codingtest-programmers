package study.daybreak.programmers.week9;

import org.junit.Assert;
import org.junit.Test;

public class SteppingStoneTest {

    @Test
    public void solution() {
        // given
        int distance = 25;
        int[] rocks = new int[]{2, 14, 11, 21, 17};
        int n = 2;

        // when
        SteppingStone steppingStone = new SteppingStone();
        int actual = steppingStone.solution(distance, rocks, n);

        // then
        Assert.assertEquals(4, actual);
    }
}