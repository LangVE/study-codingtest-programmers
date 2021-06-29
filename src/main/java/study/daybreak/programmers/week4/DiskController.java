package study.daybreak.programmers.week4;

import java.util.Comparator;
import java.util.PriorityQueue;

public class DiskController {
    public static final int REQUESTED_INDEX = 0;
    public static final int ELAPSED_INDEX = 1;
    private int jobsLength;

    public int solution(int[][] jobs) {
        jobsLength = jobs.length;

        PriorityQueue<Job> waitingList = new PriorityQueue<>(new JobRequestedComparator());
        PriorityQueue<Job> jobQueue = new PriorityQueue<>(new JobElapsedComparator());

        for (int[] jobArr : jobs) {
            waitingList.add(new Job(jobArr[REQUESTED_INDEX], jobArr[ELAPSED_INDEX]));
        }

        int totalElapsed = 0;
        int sumElapsed = 0;
        int processCount = 0;

        while (jobsLength > processCount) {
            if (!waitingList.isEmpty() && waitingList.peek().getRequested() <= totalElapsed) {
                jobQueue.add(waitingList.poll());
            } else if (!jobQueue.isEmpty()) {
                Job processingJob = jobQueue.poll();
                totalElapsed += processingJob.getElapsed();
                sumElapsed += totalElapsed - processingJob.getRequested();
                processCount++;
            } else {
                totalElapsed++;
            }
        }

        return sumElapsed / jobsLength;
    }
}

class Job {
    private int requested;
    private int elapsed;

    public Job(int requested, int elapsed) {
        this.requested = requested;
        this.elapsed = elapsed;
    }

    public int getRequested() {
        return requested;
    }

    public int getElapsed() {
        return elapsed;
    }

    public String toString() {
        return "start: " + requested + ", elapsed: " + elapsed;
    }
}

class JobElapsedComparator implements Comparator<Job> {
    @Override
    public int compare(Job job1, Job job2) {
        return job1.getElapsed() - job2.getElapsed();
    }
}

class JobRequestedComparator implements Comparator<Job> {
    @Override
    public int compare(Job job1, Job job2) {
        return job1.getRequested() - job2.getRequested();
    }
}