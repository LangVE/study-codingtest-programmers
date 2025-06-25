package study.daybreak.programmers.year2024.week11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * 코딩테스트 연습 > 깊이/너비 우선 탐색(DFS/BFS) > 퍼즐 조각 채우기
 * https://school.programmers.co.kr/learn/courses/30/lessons/84021
 * */
public class Lessons84021 {

    int[] mr = {-1, 1, 0, 0};
    int[] mc = {0, 0, -1, 1};

    boolean[][] visited;
    int boardSize;

    public int solution(int[][] game_board, int[][] table) {
        int answer = 0;
        boardSize = game_board.length;

        List<List<int[]>> emptyList = findShape(game_board, 0);
        List<List<int[]>> puzzlePieces = findShape(table, 1);

        boolean[] usedPuzzlePieces = new boolean[puzzlePieces.size()];

        for (List<int[]> space : emptyList) {
            for (int i = 0; i < puzzlePieces.size(); i++) {
                List<int[]> puzzle = puzzlePieces.get(i);
                if (!usedPuzzlePieces[i] && match(space, puzzle)) {
                    answer += puzzle.size();
                    usedPuzzlePieces[i] = true;
                }
            }
        }
        return answer;
    }

    private boolean match(List<int[]> space, List<int[]> puzzle) {
        if (space.size() != puzzle.size())
            return false;

        for (int rot = 0; rot < 4; rot++) {
            if (isSame(space, puzzle)) {
                return true;
            }

            for (int[] point : puzzle) {
                int temp = point[0];
                point[0] = point[1];
                point[1] = temp * -1;
            }
        }

        return false;
    }

    private boolean isSame(List<int[]> space, List<int[]> puzzle) {
        for (int i = 0; i < space.size(); i++) {
            int[] sPoint = space.get(i);
            int[] pPoint = puzzle.get(i);

            if (sPoint[0] != pPoint[0] || sPoint[1] != pPoint[1])
                return false;
        }
        return true;
    }

    private List<List<int[]>> findShape(int[][] board, int target) {
        visited = new boolean[boardSize][boardSize];
        List<List<int[]>> shapeList = new ArrayList<>();

        // game_board 빈칸 찾기
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print("board[" + i + "][" + j + "] = " + board[i][j]);

                if (!visited[i][j] && board[i][j] == target) {
                    System.out.println(" find!");

                    shapeList.add(bfs(board, i, j, target));
                } else {
                    System.out.println("");

                    visited[i][j] = true;
                }
            }
        }

        return shapeList;
    }

    private List<int[]> bfs(int[][] board, int i, int j, int target) {
        int boardSize = board.length;

        Queue<int[]> queue = new LinkedList<>();
        List<int[]> shape = new ArrayList<>();

        queue.add(new int[]{i, j});

        int minr = boardSize;
        int minc = boardSize;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            shape.add(curr);
            visited[curr[0]][curr[1]] = true;
            minr = Math.min(curr[0], minr);
            minc = Math.min(curr[1], minc);

            for (int r = 0; r < 4; r++) {
                int nr = curr[0] - mr[r];
                int nc = curr[1] - mc[r];

                if (nr >= 0 && nc >= 0 && nr < boardSize && nc < boardSize && !visited[nr][nc] && board[nr][nc] == target) {
                    queue.add(new int[]{nr, nc});
                }
            }
        }

        for (int[] point : shape) {
            point[0] -= minr;
            point[1] -= minc;
        }

        shape.sort((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        return shape;
    }
}
