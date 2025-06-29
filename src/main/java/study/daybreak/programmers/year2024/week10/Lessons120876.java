package study.daybreak.programmers.year2024.week10;

/*
    코딩테스트 연습 > 코딩테스트 입문 > 겹치는 선분의 길이
    https://school.programmers.co.kr/learn/courses/30/lessons/120876?language=java

    겹치는 선분의 길이

    문제 설명

    선분 3개가 평행하게 놓여 있습니다. 세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]] 형태로 들어있는 2차원 배열 lines가 매개변수로 주어질 때, 두 개 이상의 선분이 겹치는 부분의 길이를 return 하도록 solution 함수를 완성해보세요.

    lines가 [[0, 2], [-3, -1], [-2, 1]]일 때 그림으로 나타내면 다음과 같습니다.

    line_2.png

    선분이 두 개 이상 겹친 곳은 [-2, -1], [0, 1]로 길이 2만큼 겹쳐있습니다.
    제한사항

        lines의 길이 = 3
        lines의 원소의 길이 = 2
        모든 선분은 길이가 1 이상입니다.
        lines의 원소는 [a, b] 형태이며, a, b는 각각 선분의 양 끝점 입니다.
            -100 ≤ a < b ≤ 100

    입출력 예
    lines 	result
    [[0, 1], [2, 5], [3, 9]] 	2
    [[-1, 1], [1, 3], [3, 9]] 	0
    [[0, 5], [3, 9], [1, 10]] 	8
    입출력 예 설명

    입출력 예 #1

        두 번째, 세 번째 선분 [2, 5], [3, 9]가 [3, 5] 구간에 겹쳐있으므로 2를 return 합니다.

    입출력 예 #2

        겹친 선분이 없으므로 0을 return 합니다.

    입출력 예 #3

        첫 번째와 두 번째 선분이 [3, 5] 구간에서 겹칩니다.
        첫 번째와 세 번째 선분 [1, 5] 구간에서 겹칩니다.
        두 번째와 세 번째 선분 [3, 9] 구간에서 겹칩니다.
        따라서 [1, 9] 구간에 두 개 이상의 선분이 겹쳐있으므로, 8을 return 합니다.
* */
public class Lessons120876 {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] countLine = new int[200];

        for (int[] l : lines) {
            int start = l[0] + 100;
            int end = l[1] + 100;

            for (int i = start; i < end; i++) {
                countLine[i] = countLine[i] + 1;
            }
        }

        for (int c : countLine) {
            if (c > 1) answer++;
        }

        return answer;
    }
}
