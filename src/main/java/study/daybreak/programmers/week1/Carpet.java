package study.daybreak.programmers.week1;

import java.util.ArrayList;
import java.util.List;

public class Carpet {

    private List<Pair> pairList = new ArrayList<>();
    private int sum = 0;

    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        sum = brown + yellow;

        // 소인수 분해
        factorization(yellow);

        System.out.println(pairList);

        return findCarpetSize(brown);
    }

    private void factorization(int yellow) {

        for (int i = 1; i <= Math.sqrt(yellow); i++) {
            if (yellow % i == 0) {
                Pair pair = new Pair();
                pair.setHight(i);
                pair.setWidth(yellow / i);

                pairList.add(pair);
            }
        }
    }

    private int[] findCarpetSize(int brown) {
        for (Pair p : pairList) {
            if (sum == (p.getWidth() + 2) * (p.getHight() + 2)) {
                System.out.println(p);
                return new int[]{p.getWidth() + 2, p.getHight() + 2};
            }
        }

        throw new RuntimeException("사이즈를 찾을수 없습니다");
    }
}

class Pair {
    private int width;
    private int hight;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "width=" + width +
                ", hight=" + hight +
                '}';
    }
}