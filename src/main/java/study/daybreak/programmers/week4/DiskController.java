package study.daybreak.programmers.week4;

import java.util.*;

public class DiskController {
    private int jobsLength;
    private List<PriorityQueue<Job>> jobQueueList = new ArrayList<>();

    public int solution(int[][] jobs) {
        int answer = 0;
        jobsLength = jobs.length;

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int[] jobArr : jobs) {
            if (map.containsKey(jobArr[0])) {
                List<Integer> list = map.get(jobArr[0]);
                list.add(jobArr[1]);
                map.put(jobArr[0], list);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(jobArr[1]);
                map.put(jobArr[0], list);
            }
        }

        int totalElapsed = 0;
        PriorityQueue<Job> jobQueue = new PriorityQueue<>(new JobComparator());
        ;

        for (int i = 0; i <= 1000; i++) {
            if (map.containsKey(i)) {
                if (totalElapsed < i) {
                    jobQueueList.add(jobQueue);
                    jobQueue = new PriorityQueue<>(new JobComparator());
                }

                List<Integer> list = map.get(i);
                map.remove(i);

                for (Integer elapsed : list) {
                    totalElapsed += elapsed;

                    jobQueue.add(new Job(i, elapsed));
                }
            }
        }

        if (jobQueue.size() > 0) {
            jobQueueList.add(jobQueue);
        }

        return avarage2();
    }

    private int avarage2() {
        int appendElapsed = 0;
        int avarageTarget = 0;

        for (PriorityQueue<Job> jobQueue : jobQueueList) {
            appendElapsed = 0;
            while (!jobQueue.isEmpty()) {
                Job job = jobQueue.poll();
                if (appendElapsed == 0)
                    appendElapsed += (job.getStart() + job.getElapsed());
                else
                    appendElapsed += job.getElapsed();
                int myElapsed = appendElapsed - job.getStart();
                //System.out.println("job = " + job + ", myElapsed = " + myElapsed);
                avarageTarget += myElapsed;
            }
        }

        return avarageTarget / jobsLength;
    }

    private int avarage(PriorityQueue<Job> queue) {
        int appendElapsed = 0;
        int avarageTarget = 0;

        for (int i = 0; i < jobsLength; i++) {
            Job job = queue.poll();
            appendElapsed += job.getElapsed();
            int myElapsed = appendElapsed - job.getStart();
            avarageTarget += myElapsed;
        }
        return avarageTarget / jobsLength;
    }
}

class Job {
    private int start;
    private int elapsed;

    public Job(int start, int elapsed) {
        this.start = start;
        this.elapsed = elapsed;
    }

    public int getStart() {
        return start;
    }

    public int getElapsed() {
        return elapsed;
    }

    public String toString() {
        return "start: " + start + ", elapsed: " + elapsed;
    }
}

class JobComparator implements Comparator<Job> {
    @Override
    public int compare(Job job1, Job job2) {
        if (job1.getElapsed() > job2.getElapsed())
            return 1;
        else if (job1.getElapsed() < job2.getElapsed())
            return -1;
        return 0;
    }
}