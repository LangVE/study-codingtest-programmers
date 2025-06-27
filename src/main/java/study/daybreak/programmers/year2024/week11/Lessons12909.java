package study.daybreak.programmers.year2024.week11;

/**
 * 코딩테스트 연습 > 스택/큐 > 올바른 괄호
 * https://school.programmers.co.kr/learn/courses/30/lessons/12909
 */
public class Lessons12909 {
    boolean solution(String s) {
        boolean answer = false;
        int result = 0;

        char[] c = s.toCharArray();

        for (char c1 : c) {
            if (c1 == '(') {
                result++;
            } else {
                result--;
            }

            if (result < 0)
                return false;
        }

        if (result != 0)
            return false;

        return true;
    }
}
