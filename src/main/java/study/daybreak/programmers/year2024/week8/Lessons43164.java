package study.daybreak.programmers.year2024.week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    코딩테스트 연습 > 깊이/너비 우선 탐색(DFS/BFS) > 여행경로
    https://school.programmers.co.kr/learn/courses/30/lessons/43164

    문제 설명

        주어진 항공권을 모두 이용하여 여행경로를 짜려고 합니다. 항상 "ICN" 공항에서 출발합니다.
        항공권 정보가 담긴 2차원 배열 tickets가 매개변수로 주어질 때, 방문하는 공항 경로를 배열에 담아 return 하도록 solution 함수를 작성해주세요.

    제한사항

        모든 공항은 알파벳 대문자 3글자로 이루어집니다.
        주어진 공항 수는 3개 이상 10,000개 이하입니다.
        tickets의 각 행 [a, b]는 a 공항에서 b 공항으로 가는 항공권이 있다는 의미입니다.
        주어진 항공권은 모두 사용해야 합니다.
        만일 가능한 경로가 2개 이상일 경우 알파벳 순서가 앞서는 경로를 return 합니다.
        모든 도시를 방문할 수 없는 경우는 주어지지 않습니다.

    입출력 예

        tickets 	return
        [["ICN", "JFK"], ["HND", "IAD"], ["JFK", "HND"]] 	["ICN", "JFK", "HND", "IAD"]
        [["ICN", "SFO"], ["ICN", "ATL"], ["SFO", "ATL"], ["ATL", "ICN"], ["ATL","SFO"]] 	["ICN", "ATL", "ICN", "SFO", "ATL", "SFO"]

    입출력 예 설명

        예제 #1

        ["ICN", "JFK", "HND", "IAD"] 순으로 방문할 수 있습니다.

        예제 #2

        ["ICN", "SFO", "ATL", "ICN", "ATL", "SFO"] 순으로 방문할 수도 있지만 ["ICN", "ATL", "ICN", "SFO", "ATL", "SFO"] 가 알파벳 순으로 앞섭니다.
* */
public class Lessons43164 {
    //private PriorityQueue<String> resultQueue = new PriorityQueue<>();
    public String[] solution(String[][] tickets) {
        List<String> path = new ArrayList<>();
        boolean[] visited = new boolean[tickets.length];

        Arrays.sort(tickets, (o1, o2) -> o1[0].equals(o2[0]) ? o1[1].compareTo(o2[1]) : o1[0].compareTo(o2[0]));

        int depth = 0;
        String start = "ICN";

        dfs(tickets, visited, start, path, depth);

        return path.toArray(new String[0]);
    }

    private boolean dfs(String[][] tickets, boolean[] visited, String start, List<String> path, int depth) {
        // 경로 등록
        // 티켓을 소진했다면 종료
        // 티켓이 남아있다면 start 를 찾는다.
        // visited 에 표시를 한다.
        // depth 카운트 한다.
        // 찾은 end 도착지 를 start 로 다시 호출 한다.
        // 찾지 못했다면 백트레킹, 경로등록 취소
        path.add(start);

        if (depth == tickets.length) {
            System.out.println("path = " + path);
            return true;
        }

        for (int i = 0; i < tickets.length; i++) {
            String[] t = tickets[i];
            if (t[0].equals(start) && !visited[i]) {
                visited[i] = true;
                if (dfs(tickets, visited, t[1], path, depth + 1)) {
                    return true;
                }
                visited[i] = false;
            }
        }

        path.remove(depth);
        return false;
    }
}
