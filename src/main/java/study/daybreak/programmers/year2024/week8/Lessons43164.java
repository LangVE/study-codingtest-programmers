package study.daybreak.programmers.year2024.week8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

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
    public String[] solution(String[][] tickets) {
        String[] path = new String[tickets.length + 1];

        // hashmap set
        HashMap<String, PriorityQueue<String>> ticketMap = new HashMap<>();

        for (String[] ticket : tickets) {
            if (ticketMap.containsKey(ticket[0])) {
                PriorityQueue destinationQueue = ticketMap.get(ticket[0]);
                destinationQueue.offer(ticket[1]);
                ticketMap.put(ticket[0], destinationQueue);
            } else {
                PriorityQueue destinationQueue = new PriorityQueue();
                destinationQueue.offer(ticket[1]);
                ticketMap.put(ticket[0], destinationQueue);
            }
        }

        // 출발, 최초 ICN
        String departure = "ICN";
        int i = 0;

        while (ticketMap.containsKey(departure)) {
            // 경로 추가
            path[i] = departure;
            i++;

            PriorityQueue<String> destinationQueue = ticketMap.get(departure);
            String destination = destinationQueue.poll();

            // hashmap 체크 & key 삭제
            if (destinationQueue.isEmpty()) {
                ticketMap.remove(departure);
            }

            departure = destination;
        }

        // 마지막 공항 추가
        path[i] = departure;
        System.out.println("Arrays.deepToString(path) = " + Arrays.deepToString(path));

        // hashmap 비었다면 결과 반환
        return path;
    }
}
