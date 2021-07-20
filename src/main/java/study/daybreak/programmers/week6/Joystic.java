package study.daybreak.programmers.week6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Joystic {
    Map<Character, Integer> alphaMap = extracted();

    public int solution(String name) {
        char[] tempNameArr = getInitialArr(name);
        char[] nameArr = name.toCharArray();

        int count = 0;
        int currIndex = 0;

        while (!Arrays.equals(tempNameArr, nameArr)) {
            if (nameArr[currIndex] != 'A' && tempNameArr[currIndex] == 'A') {
                int n = alphaMap.get(nameArr[currIndex]);
                count += n;
                nameArr[currIndex] = 'A';
            } else {
                // 우측이동
                int indexRight = getIdxRight(nameArr, currIndex);
                int moveRight = calcMoveRight(nameArr, currIndex, indexRight);

                // 좌측이동
                int indexLeft = getIdxLeft(nameArr, currIndex);
                int moveLeft = calcMoveLeft(nameArr, currIndex, indexLeft);

                currIndex = moveRight > moveLeft ? indexLeft : indexRight;
                count += moveRight > moveLeft ? moveLeft : moveRight;
            }
        }

        return count;
    }

    private int calcMoveLeft(char[] nameArr, int idx, int idxLeft) {
        int moveLeft;
        if (idxLeft <= idx) {
            moveLeft = idx - idxLeft;
        } else {
            moveLeft = (nameArr.length - 1 - idxLeft) + idx + 1;
        }
        return moveLeft;
    }

    private int calcMoveRight(char[] nameArr, int idx, int idxRight) {
        int moveRight;
        if (idxRight >= idx) {
            moveRight = idxRight - idx;
        } else {
            moveRight = (nameArr.length - 1 - idx) + idxRight + 1;
        }
        return moveRight;
    }

    int getIdxRight(char[] nameArr, int idx) {
        while (true) {
            if (nameArr.length > (idx + 1)) {
                idx++;
            } else {
                idx = 0;
            }

            if (nameArr[idx] != 'A') {
                break;
            }
        }
        return idx;
    }

    int getIdxLeft(char[] nameArr, int idx) {
        while (true) {
            if (0 <= (idx - 1)) {
                idx--;
            } else {
                idx = nameArr.length - 1;
            }

            if (nameArr[idx] != 'A') {
                break;
            }
        }
        return idx;
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
