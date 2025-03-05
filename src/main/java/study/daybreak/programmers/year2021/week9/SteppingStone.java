package study.daybreak.programmers.year2021.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SteppingStone {
    public int solution(int distance, int[] rocks, int n) {
        boolean[] visited = new boolean[rocks.length];
        int[] newRocks = new int[rocks.length - n];
        filter(rocks, newRocks, visited, 1, n);

        Arrays.sort(rocks);
        List<Integer> list = new ArrayList<>();

        int prevRock = 0;

        for (int rock : rocks) {
            list.add(rock - prevRock);
            prevRock = rock;
        }

        if (prevRock != distance) {
            list.add(distance - prevRock);
        }

        System.out.println("list = " + list);

        // 최소값 얻기
        list.sort(Comparator.naturalOrder());

        System.out.println("list.get(0) = " + list.get(0));

        return list.get(0);
    }

    private void filter(int[] rocks, int[] newRocks, boolean[] visited, int depth, int n) {
        if (depth > newRocks.length) {
            System.out.println("visited = " + Arrays.toString(visited));
            System.out.println("newRocks = " + Arrays.toString(newRocks));
        } else {
            for (int i = 0; i < rocks.length; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    newRocks[depth - 1] = rocks[i];
                    filter(rocks, newRocks, visited, depth + 1, n);
                    visited[i] = false;
                }
            }
        }
    }
}
