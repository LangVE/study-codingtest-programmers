package study.daybreak.programmers.week6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Joystic {
    Map<Character, Integer> alphaMap = extracted();

    public int solution(String name) {
        int answer = 0;
        int answerReverse = 0;
        char[] initialArr = getInitialArr(name);
        char[] nameArr = name.toCharArray();

        if (Arrays.equals(initialArr, nameArr)) {
            return 0;
        }

        for (int i = 0; i < nameArr.length; i++) {
            int n = alphaMap.get(nameArr[i]);
            answer += n;
            initialArr[i] = nameArr[i];

            if (Arrays.equals(initialArr, nameArr)) {
                break;
            }

            answer++; // 커서이동
        }

        initialArr = getInitialArr(name);

        for (int i = 0; i < nameArr.length; i++) {
            int index = i == 0 ? 0 : nameArr.length - i; // i:0 index:0, i:1 index:2, i:2 index:1
            int n = alphaMap.get(nameArr[index]);
            answerReverse += n;
            initialArr[index] = nameArr[index];

            if (Arrays.equals(initialArr, nameArr)) {
                break;
            }

            answerReverse++; // 커서이동
        }

        return answer > answerReverse ? answerReverse : answer;
    }

    private char[] getInitialArr(String name) {
        char[] initialArr = new char[name.length()];
        Arrays.fill(initialArr, 'A');
        return initialArr;
    }

    private Map<Character, Integer> extracted() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('B', 1);
        map.put('C', 2);
        map.put('D', 3);
        map.put('E', 4);
        map.put('F', 5);
        map.put('G', 6);
        map.put('H', 7);
        map.put('I', 8);
        map.put('J', 9);
        map.put('K', 10);
        map.put('L', 11);
        map.put('M', 12);
        map.put('N', 13);
        map.put('O', 12);
        map.put('P', 11);
        map.put('Q', 10);
        map.put('R', 9);
        map.put('S', 8);
        map.put('T', 7);
        map.put('U', 6);
        map.put('V', 5);
        map.put('W', 4);
        map.put('X', 3);
        map.put('Y', 2);
        map.put('Z', 1);

        return map;
    }
}
