package study.daybreak.programmers.year2024.week8;

import org.junit.Assert;
import org.junit.Test;

public class Lessons43164Test {

    @Test
    public void test() {
        // given
        String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};

        // when
        Lessons43164 lessons43164 = new Lessons43164();
        String[] actual = lessons43164.solution(tickets);

        // then
        String[] expected = {"ICN", "JFK", "HND", "IAD"};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_case2() {
        // given
        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}};

        // when
        Lessons43164 lessons43164 = new Lessons43164();
        String[] actual = lessons43164.solution(tickets);

        // then
        String[] expected = {"ICN", "ATL", "ICN", "SFO", "ATL", "SFO"};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_case3() {
        // given
        String[][] tickets = {{"ICN", "SFO"}, {"SFO", "ATL"}, {"ATL", "ICN"}};

        // when
        Lessons43164 lessons43164 = new Lessons43164();
        String[] actual = lessons43164.solution(tickets);

        // then
        String[] expected = {"ICN", "SFO", "ATL", "ICN"};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_case4() {
        // given
        String[][] tickets = {{"ICN", "ATM"}, {"ICN", "ATL"}, {"ATM", "ATL"}, {"ATL", "ICN"}, {"ATL", "ATM"}};

        // when
        Lessons43164 lessons43164 = new Lessons43164();
        String[] actual = lessons43164.solution(tickets);

        // then
        String[] expected = {"ICN", "ATL", "ATM", "ATL", "ICN", "ATM"};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_case5() {
        // given
        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}};

        // when
        Lessons43164 lessons43164 = new Lessons43164();
        String[] actual = lessons43164.solution(tickets);

        // then
        String[] expected = {"ICN", "ATL", "ICN", "SFO", "ATL"};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_case6() {
        // given
        String[][] tickets = {{"ICN", "AAA"}, {"ICN", "BBB"}, {"ICN", "CCC"}, {"CCC", "ICN"}, {"BBB", "ICN"}};

        // when
        Lessons43164 lessons43164 = new Lessons43164();
        String[] actual = lessons43164.solution(tickets);

        // then
        String[] expected = {"ICN", "BBB", "ICN", "CCC", "ICN", "AAA"};
        Assert.assertArrayEquals(expected, actual);
    }
}