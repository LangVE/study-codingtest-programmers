package study.daybreak.programmers.week10;

public class RankGraph {
    public int solution(int n, int[][] results) {
        int answer = 0;

        Integer[][] resultBoard = new Integer[n][n];

        for (int[] r : results) {
            resultBoard[r[0] - 1][r[1] - 1] = 1; // 승리
            resultBoard[r[1] - 1][r[0] - 1] = 0; // 패배
        }

//        System.out.println("arr = " + Arrays.deepToString(arr));

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || resultBoard[i][j] == null)
                    continue;

                for (int k = 0; k < n; k++) {
                    if (resultBoard[i][j] == resultBoard[j][k] && resultBoard[i][k] == null) {
                        resultBoard[i][k] = resultBoard[i][j];
                        resultBoard[k][i] = resultBoard[i][j] == 1 ? 0 : 1;
                    }
                }
            }
        }

//        System.out.println("arr = " + Arrays.deepToString(arr));

        for (Integer[] rb : resultBoard) {
            int countNull = 0;
            for (Integer b : rb) {
                if (b == null)
                    countNull++;
            }

            if ((n - countNull) == (n - 1)) {
                answer++;
            }
        }
        return answer;
    }
}
