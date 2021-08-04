package study.daybreak.programmers.week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class WordConvert {
    private String target;

    static boolean valid(String word, String currWord) {
        // currWord + target 한글자 조합으로 찾아보기


        // 한글자를 제외하고 동일한지 검사
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == currWord.charAt(i))
                count++;
        }

        return count == word.length() - 1 ? true : false;
    }

    public int solution(String begin, String target, String[] words) {
        this.target = target;

        int answer = 0;

        if (!isExist(target, words)) {
            return 0;
        }

        boolean[] visited = new boolean[words.length];
        Arrays.fill(visited, false);

        answer = find(words, visited, 0, begin);

        return answer;
    }

    private int find(String[] words, boolean[] visited, int depth, String currWord) {
        if (currWord.equals(target))
            return depth;

        // 마지막까지 탐색
        if (depth == words.length)
            return 0;

        List<Integer> countList = new ArrayList<Integer>();

        for (int i = 0; i < words.length; i++) {
            if (visited[i] == true)
                continue;

            String word = words[i];

            if (valid(word, currWord)) {
                visited[i] = true;
                int result = find(words, visited, depth + 1, word);
                visited[i] = false;

                if (result > 0)
                    countList.add(result);
            }
        }

        if (countList.size() == 0)
            return 0; // 이동 불가의 경우

        countList.sort(Comparator.naturalOrder());
        return countList.get(0);
    }

    private boolean isExist(String target, String[] words) {
        boolean exist = false;

        for (String word : words) {
            if (word.equals(target)) {
                exist = true;
                break;
            }
        }
        return exist;
    }
}
