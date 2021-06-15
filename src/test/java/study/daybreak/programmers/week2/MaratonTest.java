package study.daybreak.programmers.week2;

import org.junit.Assert;
import org.junit.Test;

public class MaratonTest {

    @Test
    public void solution_case1() {
        // given
        String[] participant = new String[]{"leo", "kiki", "eden"};
        String[] completion = new String[]{"eden", "kiki"};

        // when
        Maraton maraton = new Maraton();
        String actual = maraton.solution(participant, completion);

        // then
        Assert.assertEquals("leo", actual);
    }

    @Test
    public void solution_case2() {
        // given
        String[] participant = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = new String[]{"josipa", "filipa", "marina", "nikola"};

        // when
        Maraton maraton = new Maraton();
        String actual = maraton.solution(participant, completion);

        // then
        Assert.assertEquals("vinko", actual);
    }

    @Test
    public void solution_case3() {
        // given
        String[] participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] completion = new String[]{"stanko", "ana", "mislav"};

        // when
        Maraton maraton = new Maraton();
        String actual = maraton.solution(participant, completion);

        // then
        Assert.assertEquals("mislav", actual);
    }

    @Test
    public void solution_case4() {
        // given
        String[] participant = new String[]{"marina"};
        String[] completion = new String[]{};

        // when
        Maraton maraton = new Maraton();
        String actual = maraton.solution(participant, completion);

        // then
        Assert.assertEquals("marina", actual);
    }
}