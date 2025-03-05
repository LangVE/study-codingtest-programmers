package study.daybreak.programmers.year2021.week3;

import java.util.ArrayList;
import java.util.List;

public class Development {
    public int[] solution(int[] progresses, int[] speeds) {
        int complete = 100;
        int tmp = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            int remain = complete - progresses[i];
            int spend = remain / speeds[i];

            if (remain % speeds[i] != 0) {
                spend++;
            }
            //System.out.println("spend = " + spend);

            if (spend > tmp) {
                list.add(1);
                tmp = spend;
            } else {
                int lastIndex = list.size();
                list.set(lastIndex - 1, list.get(lastIndex - 1) + 1);
            }
        }
        //System.out.println("list = " + list);
        return list.stream().mapToInt(i -> i).toArray();
    }
}