package study.daybreak.programmers.year2024.week11;


import java.util.*;

/*
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 주사위 게임 3
 * https://school.programmers.co.kr/learn/courses/30/lessons/181916?language=java
 * */
public class Lessons181916 {
    private static void findAndPut(int i, Map<Integer, Integer> map) {
        if (map.containsKey(i)) {
            map.put(i, map.get(i) + 1);
        } else {
            map.put(i, 1);
        }
    }

    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        findAndPut(a, map);
        findAndPut(b, map);
        findAndPut(c, map);
        findAndPut(d, map);

        if (map.keySet().size() == 1) {
            return 1111 * a;
        } else if (map.keySet().size() == 2) {
            Set<Integer> set = map.keySet();
            Iterator<Integer> iterator = set.iterator();
            int p = 0;
            int q = 0;

            while (iterator.hasNext()) {
                Integer k = iterator.next();
                Integer v = map.get(k);

                if (v == 3) {
                    p = k;
                } else if (v == 2) {
                    if (p == 0) {
                        p = k;
                    } else {
                        q = k;
                    }
                } else if (v == 1) {
                    q = k;
                }
            }

            if (map.containsValue(3)) {
                return Double.valueOf(Math.pow(10 * p + q, 2)).intValue();
            } else {
                return (p + q) * Math.abs(p - q);
            }

        } else if (map.keySet().size() == 3) {
            Set<Integer> set = map.keySet();
            Iterator<Integer> iterator = set.iterator();
            int q = 0;
            int r = 0;

            while (iterator.hasNext()) {
                Integer k = iterator.next();
                Integer v = map.get(k);

                if (v == 2) {
                    // p = k
                } else if (v == 1) {
                    if (q == 0) {
                        q = k;
                    } else {
                        r = k;
                    }
                }
            }

            return q * r;
        } else if (map.keySet().size() == 4) {
            Set<Integer> set = map.keySet();

            return Collections.min(set);
        }

        return answer;
    }
}
