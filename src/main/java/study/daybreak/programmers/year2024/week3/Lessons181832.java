package study.daybreak.programmers.year2024.week3;

/*
    코딩테스트 연습 > 코딩 기초 트레이닝 > 정수를 나선형으로 배치하기
    https://school.programmers.co.kr/learn/courses/30/lessons/181832

    문제 설명

    양의 정수 n이 매개변수로 주어집니다. n × n 배열에 1부터 n2 까지 정수를 인덱스 [0][0]부터 시계방향 나선형으로 배치한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.
    제한사항

        1 ≤ n ≤ 30

    입출력 예
    n 	result
    4 	[[1, 2, 3, 4], [12, 13, 14, 5], [11, 16, 15, 6], [10, 9, 8, 7]]
    5 	[[1, 2, 3, 4, 5], [16, 17, 18, 19, 6], [15, 24, 25, 20, 7], [14, 23, 22, 21, 8], [13, 12, 11, 10, 9]]
    입출력 예 설명

    입출력 예 #1

        예제 1번의 n의 값은 4로 4 × 4 배열에 다음과 같이 1부터 16까지 숫자를 채울 수 있습니다.
        행 \ 열 	0 	1 	2 	3
        0 	1 	2 	3 	4
        1 	12 	13 	14 	5
        2 	11 	16 	15 	6
        3 	10 	9 	8 	7

        따라서 [[1, 2, 3, 4], [12, 13, 14, 5], [11, 16, 15, 6], [10, 9, 8, 7]]를 return 합니다.

currenTurn   f   move    point
0   오른쪽 %4=0    4   0,0 0,1 0,2 0,3 +x 0 1 2 3  0 0 0 0
1   아래쪽 %4=1    3   1,3 2,3 3,3     +y 3 3 3    1 2 3
2   왼쪽   %4=2    3   3,2 3,1 3,0     -x 2 1 0    3 3 3
3   위쪽   %4=3    2   2,0 1,0         -y 0 0      2 1
4   오른쪽 %4=0    2   1,1 1,2         +x 1 2      1 1
5   아래쪽 %4=1    1   2,2             +y 2        2
6   왼쪽   %4=2    1   2,1             -x 1        2

1 1
2 3
3 5
4 7
5 9

    입출력 예 #2

        예제 2번의 n의 값은 5로 5 × 5 배열에 다음과 같이 1부터 25까지 숫자를 채울 수 있습니다.
        행 \ 열 	0 	1 	2 	3 	4
        0 	1 	2 	3 	4 	5
        1 	16 	17 	18 	19 	6
        2 	15 	24 	25 	20 	7
        3 	14 	23 	22 	21 	8
        4 	13 	12 	11 	10 	9

        따라서 [[1, 2, 3, 4, 5], [16, 17, 18, 19, 6], [15, 24, 25, 20, 7], [14, 23, 22, 21, 8], [13, 12, 11, 10, 9]]를 return 합니다.

currenTurn   f   move    point
0   오른쪽 %4=0    5   0,0 0,1 0,2 0,3 0,4 +x
1   아래쪽 %4=1    4   1,4 2,4 3,4 4,4 +y
2   왼쪽   %4=2    4   4,3 4,2 4,1 4,0 -x
3   위쪽   %4=3    3   3,0 2,0 1,0 -y
4   오른쪽 %4=0    3   1,1 1,2 1,3 +x
5   아래쪽 %4=1    2   2,3 3,3 +y
6   왼쪽   %4=2    2   3,2 3,1 -x
7   위쪽   %4=3    1   2,1 -y
8   오른쪽 %4=0    1   2,2 +x
* */
public class Lessons181832 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int turn = n * 2 - 1;
        int move = n;
        int x = 0;
        int y = 0;
        int num = 1;

        for (int currentTurn = 0; currentTurn < turn; currentTurn++) {
            System.out.println("currentTurn = " + currentTurn);
            System.out.println("move = " + move);

            // 방향 결정
            int f = currentTurn % 4;
            System.out.println("f:" + f);

            // 움직이며 세팅
            for (int j = 0; j < move; j++) {
                System.out.println("y:" + y + ", x:" + x + ", num:" + num);
                answer[y][x] = num;

                if (f == 0) {
                    if ((move - 1 != j)) {
                        x++;
                    } else {
                        y++;
                    }
                } else if (f == 1) {
                    if ((move - 1 != j)) {
                        y++;
                    } else {
                        x--;
                    }
                } else if (f == 2) {
                    if ((move - 1 != j)) {
                        x--;
                    } else {
                        y--;
                    }
                } else if (f == 3) {
                    if ((move - 1 != j)) {
                        y--;
                    } else {
                        x++;
                    }
                }

                num++;
            }

            if (currentTurn % 2 == 0) {
                move--;
            }

            System.out.println("");
        }

        return answer;
    }
}
