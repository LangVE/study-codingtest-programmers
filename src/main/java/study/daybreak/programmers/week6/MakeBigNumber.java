package study.daybreak.programmers.week6;

import java.util.Arrays;

public class MakeBigNumber {
    public String solution(String number, int k) {
        String answer = "";

        int beginIndex = 0;

        // 첫글자를 구한다..
        for (int i = number.length() - k; i > 0; i--) {
//            System.out.println("beginIndex = " + beginIndex + ", endIndex = " + ( number.length()-(i-1) ) );
            // 후보군
            String candidate = number.substring(beginIndex, number.length() - (i - 1)); // 마지막 인덱스에서 여유 글자 남겨둠
//            System.out.println("candidate = " + candidate);
            char[] candidateArr = candidate.toCharArray();
            Arrays.sort(candidateArr);
            char choice = candidateArr[candidateArr.length - 1]; // 가장 큰 수 선택
//            System.out.println("choice = " + choice);

            answer += String.valueOf(choice);
            beginIndex = number.indexOf(choice, beginIndex) + 1;
        }

        return answer;
    }
}
