package study.daybreak.programmers.year2024.week2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class Lessons181862Test {
    private String myValue;
    private String[] myExpected;

    public Lessons181862Test(String[] myExpected, String myValue) {
        this.myExpected = myExpected;
        this.myValue = myValue;
    }

    @Parameterized.Parameters
    public static Collection getTestParameters() {
        return Arrays.asList(new Object[][]{
                {new String[]{"onlettu", "etom", "to"}, "baconlettucetomato"},
                {new String[]{"d"}, "abcd"},
                {new String[]{"EMPTY"}, "cabab"},
        });
    }

    @Test
    public void test() {
        // given
        String myStr = this.myValue;

        // when
        Lessons181862 lessons181862 = new Lessons181862();
        String[] actual = lessons181862.solution(myStr);

        for (int i = 0; i < actual.length; i++) {
            System.out.println(i + ":" + actual[i]);
        }

        // then
        Assert.assertArrayEquals(this.myExpected, actual);
    }
}