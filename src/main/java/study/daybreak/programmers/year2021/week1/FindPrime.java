package study.daybreak.programmers.year2021.week1;

import java.util.HashSet;
import java.util.Set;

public class FindPrime {
    private Set<Integer> setPermutation = new HashSet<>();

    public int solution(String numbers) {
        int answer = 0;
        // 문자열 길이 구하기
        int length = numbers.length();
        int depth = 1;
        char[] charArr = numbers.toCharArray();
        boolean[] booleanArr = new boolean[length];
        permutation(charArr, "", booleanArr, length, depth);

        System.out.println(setPermutation);

        return countPrime();
    }

    private int countPrime() {
        int count = 0;

        for (Integer i : setPermutation) {
            if (isPrime(i)) {
                count++;
            }
        }

        return count;
    }

    private boolean isPrime(int num) {
        boolean result = true;

        if (num == 1) {
            return false;
        } else if (num == 2) {
            return true;
        } else if (num % 2 == 0) { // 짝수
            return false;
        } else {
            for (int i = 3; i <= Math.sqrt(num); i += 2) {
                if (num % i == 0) {
                    return false;
                }
            }
        }

        return result;
    }

    private void permutation(char[] charArr, String curr, boolean[] booleanArr, int length, int depth) {
        if (length >= depth) {
            System.out.println(depth);

            int i = 0;
            for (char c : charArr) {
                if (!booleanArr[i]) {
                    String val = String.valueOf(c);
                    setPermutation.add(Integer.parseInt(curr + val));
                    booleanArr[i] = true;
                    permutation(charArr, curr + val, booleanArr, length, depth + 1);
                    booleanArr[i] = false;
                }
                i++;
            }
        }
    }
}
