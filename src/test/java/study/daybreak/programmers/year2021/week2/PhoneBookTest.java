package study.daybreak.programmers.year2021.week2;

import org.junit.Assert;
import org.junit.Test;

public class PhoneBookTest {

    @Test
    public void solution_case1() {
        // given
        String[] phoneArr = new String[]{"119", "97674223", "1195524421"};

        // when
        PhoneBook phoneBook = new PhoneBook();
        boolean actual = phoneBook.solution(phoneArr);

        // then
        Assert.assertFalse(actual);
    }

    @Test
    public void solution_case2() {
        // given
        String[] phoneArr = new String[]{"123", "456", "789"};

        // when
        PhoneBook phoneBook = new PhoneBook();
        boolean actual = phoneBook.solution(phoneArr);

        // then
        Assert.assertTrue(actual);
    }

    @Test
    public void solution_case3() {
        // given
        String[] phoneArr = new String[]{"12", "123", "1235", "567", "88"};

        // when
        PhoneBook phoneBook = new PhoneBook();
        boolean actual = phoneBook.solution(phoneArr);

        // then
        Assert.assertFalse(actual);
    }


    @Test
    public void solution_case4() {
        // given
        String[] phoneArr = new String[]{"123", "12"};

        // when
        PhoneBook phoneBook = new PhoneBook();
        boolean actual = phoneBook.solution(phoneArr);

        // then
        Assert.assertFalse(actual);
    }
}