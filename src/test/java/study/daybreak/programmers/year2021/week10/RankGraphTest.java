package study.daybreak.programmers.year2021.week10;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RankGraphTest {

    @Test
    public void solution() {
        // given
        int n = 5;
        int[][] results = new int[][]{{4, 3}, {4, 2}, {3, 2}, {1, 2}, {2, 5}};

        // when
        RankGraph rankGraph = new RankGraph();
        int actual = rankGraph.solution(n, results);

        // then
        assertEquals(2, actual);
    }

    @Test
    public void solution_case2() {
        // given
        int n = 8;
        int[][] results = new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}, {7, 8}};

        // when
        RankGraph rankGraph = new RankGraph();
        int actual = rankGraph.solution(n, results);

        // then
        assertEquals(8, actual);
    }
}