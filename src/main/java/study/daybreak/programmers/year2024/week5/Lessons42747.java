package study.daybreak.programmers.year2024.week5;

import java.util.*;

/*
    코딩테스트 연습 > 정렬 > H-Index
    https://school.programmers.co.kr/learn/courses/30/lessons/42747

    문제 설명

    H-Index는 과학자의 생산성과 영향력을 나타내는 지표입니다. 어느 과학자의 H-Index를 나타내는 값인 h를 구하려고 합니다. 위키백과1에 따르면, H-Index는 다음과 같이 구합니다.
    어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 이 과학자의 H-Index입니다.
    어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations가 매개변수로 주어질 때, 이 과학자의 H-Index를 return 하도록 solution 함수를 작성해주세요.

    제한사항

        과학자가 발표한 논문의 수는 1편 이상 1,000편 이하입니다.
        논문별 인용 횟수는 0회 이상 10,000회 이하입니다.

    입출력 예

    citations 	return
    [3, 0, 6, 1, 5] 	3

    입출력 예 설명

    이 과학자가 발표한 논문의 수는 5편이고, 그중 3편의 논문은 3회 이상 인용되었습니다. 그리고 나머지 2편의 논문은 3회 이하 인용되었기 때문에 이 과학자의 H-Index는 3입니다.
    문제가 잘 안풀린다면😢
    ※ 공지 - 2019년 2월 28일 테스트 케이스가 추가되었습니다.
        https://en.wikipedia.org/wiki/H-index "위키백과" ↩
* */
public class Lessons42747 {
    public int solution(int[] citations) {
        int answer = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        List<Note> noteList = new ArrayList<>();

        Arrays.stream(citations).forEach(i -> priorityQueue.offer(i));

        // 인용수
        int noteCount = 0;
        for (int i = priorityQueue.peek(); i >= 0; i--) {
            Note note;

            if (priorityQueue.peek() != null) {
                while (priorityQueue.peek() != null && i <= priorityQueue.peek()) {
                    noteCount++;
                    int reference = priorityQueue.poll();
                    noteList.stream().forEach(n -> n.setLessNoteCount(n.getLessNoteCount() + 1));
                }
                note = new Note(i, noteCount);
            } else {
                note = new Note(i, noteCount);
            }

            noteList.add(note);
        }
        System.out.println("noteList = " + noteList);
//        System.out.println("priorityQueue = " + priorityQueue);

        for (int i = 0; i < noteList.size(); i++) {
            if (noteList.get(i).validate()) {
                return noteList.get(i).gethIndex();
            }
        }

        return 0;
    }
}

class Note {
    private int hIndex;

    // 인용 논문수
    private int noteCount;

    // hIndex
    private int lessNoteCount;

    public Note(int hIndex, int noteCount) {
        this.hIndex = hIndex;
        this.noteCount = noteCount;
    }

    public boolean validate() {
        if (hIndex <= noteCount && hIndex > lessNoteCount)
            return true;

        return false;
    }

    public int gethIndex() {
        return hIndex;
    }

    public int getNoteCount() {
        return noteCount;
    }

    public int getLessNoteCount() {
        return lessNoteCount;
    }

    public void setLessNoteCount(int lessNoteCount) {
        this.lessNoteCount = lessNoteCount;
    }

    @Override
    public String toString() {
        return "Note{" +
                "hIndex=" + hIndex +
                ", noteCount=" + noteCount +
                ", lessNoteCount=" + lessNoteCount +
                '}';
    }
}