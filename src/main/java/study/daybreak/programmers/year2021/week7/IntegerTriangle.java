package study.daybreak.programmers.year2021.week7;

public class IntegerTriangle {
    public int solution(int[][] triangle) {
        int answer = 0;

        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (i != 0) {
                    if (j == 0) {
                        // 0 일때
                        triangle[i][j] += triangle[i - 1][j];
                    } else if (j == triangle[i].length - 1) {
                        // 마지막일때
                        triangle[i][j] += triangle[i - 1][j - 1];
                    } else {
                        // 중간영역일때
                        triangle[i][j] += Math.max(triangle[i - 1][j - 1], triangle[i - 1][j]);
                    }
                }
            }
        }

        // 마지막 배열에서 최대수 찾기
        for (int tmp : triangle[triangle.length - 1]) {
            if (answer < tmp) {
                answer = tmp;
            }
        }

        return answer;
    }
}
