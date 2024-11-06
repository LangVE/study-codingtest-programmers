package study.daybreak.programmers.year2024.week4;

import org.junit.Assert;
import org.junit.Test;

public class FeatureTest {
    @Test
    public void calcRemainingSchedule_case1() {
        // given
        int progresses = 30;
        int speeds = 30;

        // when
        Feature feature = new Feature(progresses, speeds);
        int actual = feature.calcRemainingSchedule();

        // then
        int expected = 3;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void calcRemainingSchedule_case2() {
        // given
        int progresses = 90;
        int speeds = 1;

        // when
        Feature feature = new Feature(progresses, speeds);
        int actual = feature.calcRemainingSchedule();

        // then
        int expected = 10;
        Assert.assertEquals(expected, actual);
    }

}