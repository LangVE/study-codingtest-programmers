package study.daybreak.programmers.year2021.week5;

import java.util.Arrays;

public class NumberK {

    public static final int START_INDEX = 0;
    public static final int END_INDEX = 1;
    public static final int TARGET_INDEX = 2;

    public int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];
        int n = 0;

        for (int[] c : commands) {
            int[] sliceArr = Arrays.copyOfRange(array, c[START_INDEX] - 1, c[END_INDEX]);
            Arrays.sort(sliceArr);
            answer[n] = sliceArr[c[TARGET_INDEX] - 1];
            n++;
        }

        return answer;
    }
}
