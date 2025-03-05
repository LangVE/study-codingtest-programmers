package study.daybreak.programmers.year2021.week1;

import org.junit.Assert;
import org.junit.Test;

public class FindPrimeTest {

    @Test
    public void solution_cas1() {
        // given
        String numbers = "17";

        // when
        FindPrime findPrime = new FindPrime();
        int actual = findPrime.solution(numbers);

        // then
        Assert.assertEquals(3, actual);
    }

    @Test
    public void solution_case2() {
        // given
        String numbers = "110";

        // when
        FindPrime findPrime = new FindPrime();
        int actual = findPrime.solution(numbers);

        // then
        Assert.assertEquals(2, actual);
    }

    @Test
    public void test() {
        System.out.println(Integer.parseInt("011"));
    }
}