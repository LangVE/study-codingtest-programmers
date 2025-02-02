package study.daybreak.programmers.year2024.week6;

import java.util.Arrays;

/**
 * <h1><a href="https://school.programmers.co.kr/learn/courses/30/lessons/43236">코딩테스트 연습 > 이분탐색 > 징검다리</a></h1>
 *
 *
 * <h2>문제 설명</h2>
 * <p>
 * 출발지점부터 distance만큼 떨어진 곳에 도착지점이 있습니다. 그리고 그사이에는 바위들이 놓여있습니다. 바위 중 몇 개를 제거하려고 합니다.
 * 예를 들어, 도착지점이 25만큼 떨어져 있고, 바위가 [2, 14, 11, 21, 17] 지점에 놓여있을 때 바위 2개를 제거하면 출발지점, 도착지점, 바위 간의 거리가 아래와 같습니다.
 *
 * <table border="1">
 * <thead>
 * <tr>
 * <th>제거한 바위의 위치</th>
 * <th>각 바위 사이의 거리</th>
 * <th>거리의 최솟값</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td>[21, 17]</td>
 * <td>[2, 9, 3, 11]</td>
 * <td>2</td>
 * </tr>
 * <tr>
 * <td>[2, 21]</td>
 * <td>[11, 3, 3, 8]</td>
 * <td>3</td>
 * </tr>
 * <tr>
 * <td>[2, 11]</td>
 * <td>[14, 3, 4, 4]</td>
 * <td>3</td>
 * </tr>
 * <tr>
 * <td>[11, 21]</td>
 * <td>[2, 12, 3, 8]</td>
 * <td>2</td>
 * </tr>
 * <tr>
 * <td>[2, 14]</td>
 * <td>[11, 6, 4, 4]</td>
 * <td>4</td>
 * </tr>
 * </tbody>
 * </table>
 * <p>
 * <p>
 * 위에서 구한 거리의 최솟값 중에 가장 큰 값은 4입니다.
 * <p>
 * 출발지점부터 도착지점까지의 거리 distance, 바위들이 있는 위치를 담은 배열 rocks, 제거할 바위의 수 n이 매개변수로 주어질 때, 바위를 n개 제거한 뒤 각 지점 사이의 거리의 최솟값 중에 가장 큰 값을 return 하도록 solution 함수를 작성해주세요.
 *
 * <h2>제한사항</h2>
 * <p>
 * 도착지점까지의 거리 distance는 1 이상 1,000,000,000 이하입니다.
 * 바위는 1개 이상 50,000개 이하가 있습니다.
 * n 은 1 이상 바위의 개수 이하입니다.
 *
 * <h2>입출력 예</h2>
 *
 * <table border="1">
 * <thead>
 * <tr>
 * <th>distance</th>
 * <th>rocks</th>
 * <th>n</th>
 * <th>return</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td>25</td>
 * <td>[2, 14, 11, 21, 17]</td>
 * <td>2</td>
 * <td>4</td>
 * </tr>
 * </tbody>
 * </table>
 *
 * <h2>입출력 예 설명</h2>
 * <p>
 * 문제에 나온 예와 같습니다.
 * <p>
 * 출처
 * <p>
 * ※ 공지 - 2020년 2월 17일 테스트케이스가 추가되었습니다.
 * ※ 공지 - 2023년 5월 15일 테스트케이스가 추가되었습니다. 기존에 제출한 코드가 통과하지 못할 수도 있습니다.
 */
public class Lessons43236 {
    public int solution(int distance, int[] rocks, int n) {
        int answer = 0;
        Arrays.sort(rocks);

        int sum = 0;
        int left = 1;
        int right = distance;

        while (left <= right) {

            int mid = (left + right) / 2;
            int removedRocks = 0;
            int prevPosition = 0;

            for (int rock : rocks) {
                if (rock - prevPosition < mid) {
                    removedRocks++;
                } else {
                    prevPosition = rock;
                }
            }

            if (distance - prevPosition < mid) {
                removedRocks++;
            }

            if (removedRocks <= n) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return answer;
    }
}
