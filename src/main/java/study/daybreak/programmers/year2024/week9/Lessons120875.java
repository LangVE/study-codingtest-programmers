package study.daybreak.programmers.year2024.week9;

/*
    코딩테스트 연습 > 코딩테스트 입문 > 평행
    https://school.programmers.co.kr/learn/courses/30/lessons/120875?language=java

    문제 설명

    점 네 개의 좌표를 담은 이차원 배열  dots가 다음과 같이 매개변수로 주어집니다.

        [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]

    주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1을 없으면 0을 return 하도록 solution 함수를 완성해보세요.

    제한사항

        dots의 길이 = 4
        dots의 원소는 [x, y] 형태이며 x, y는 정수입니다.
            0 ≤ x, y ≤ 100
        서로 다른 두개 이상의 점이 겹치는 경우는 없습니다.
        두 직선이 겹치는 경우(일치하는 경우)에도 1을 return 해주세요.
        임의의 두 점을 이은 직선이 x축 또는 y축과 평행한 경우는 주어지지 않습니다.

    입출력 예

    dots 	result
    [[1, 4], [9, 2], [3, 8], [11, 6]] 	1
    [[3, 5], [4, 1], [2, 4], [5, 10]] 	0

    입출력 예 설명

    입출력 예 #1

        점 [1, 4], [3, 8]을 잇고 [9, 2], [11, 6]를 이으면 두 선분은 평행합니다.

    입출력 예 #2

        점을 어떻게 연결해도 평행하지 않습니다.

* */
public class Lessons120875 {
    public int solution(int[][] dots) {
        int answer = 0;

        int p1 = 0;
        int p2 = 1;
        int p3 = 2;
        int p4 = 3;

        // 1,2 vs 3,4
        if (check(dots[p1], dots[p2], dots[p3], dots[p4]) == 1)
            return 1;

        // 1,3 vs 2,4
        if (check(dots[p1], dots[p3], dots[p2], dots[p4]) == 1)
            return 1;

        // 1,4 vs 2,3
        if (check(dots[p1], dots[p4], dots[p2], dots[p3]) == 1)
            return 1;

        return 0;
    }

    private int check(int[] point1, int[] point2, int[] point3, int[] point4) {
        int idxX = 0;
        int idxY = 1;

        float xDiff1 = point1[idxX] - point2[idxX];
        float yDiff1 = point1[idxY] - point2[idxY];

        float xDiff2 = point3[idxX] - point4[idxX];
        float yDiff2 = point3[idxY] - point4[idxY];

        if (xDiff1 / yDiff1 == xDiff2 / yDiff2)
            return 1;

        return 0;
    }
}
