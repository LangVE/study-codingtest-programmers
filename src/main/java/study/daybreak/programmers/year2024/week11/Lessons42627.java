package study.daybreak.programmers.year2024.week11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Lessons42627 {
    public int solution(int[][] jobs) {

        Arrays.sort(jobs, Comparator.comparingInt(a -> a[0]));

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));

        int currentTime = 0;
        int totalTime = 0;
        int idx = 0;
        int count = 0;

        while (true) {
            if (jobs.length == count) break;

            while (jobs.length > idx && jobs[idx][0] <= currentTime) {
                pq.offer(jobs[idx]);
                idx++;
            }

            if (!pq.isEmpty()) {
                int[] job = pq.poll();
                currentTime += job[1];
                System.out.println("elapse time:" + (currentTime - job[0]));
                totalTime += currentTime - job[0];
                count++;
            } else {
                currentTime = jobs[idx][0];
            }
        }

        return totalTime / jobs.length;
    }

}