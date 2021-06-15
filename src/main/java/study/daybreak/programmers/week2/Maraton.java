package study.daybreak.programmers.week2;

import java.util.HashMap;
import java.util.Map;

public class Maraton {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> completionMap = getMap(completion);

        for (String p : participant) {
            if (!completionMap.containsKey(p)) {
                return p;
            } else {
                int count = completionMap.get(p);
                if (count > 0) {
                    completionMap.put(p, count - 1);
                } else {
                    return p;
                }
            }
        }

        return answer;
    }

    private Map<String, Integer> getMap(String[] completion) {
        Map<String, Integer> completionMap = new HashMap<>();

        for (String c : completion) {
            completionMap.put(c, completionMap.getOrDefault(c, 0) + 1);
        }

        return completionMap;
    }
}
