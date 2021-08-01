package study.daybreak.programmers.week8;

import org.junit.Assert;
import org.junit.Test;

public class WordConvertTest {

    @Test
    public void solution() {
        // given
        String begin = "hit";
        String target = "cog";
        String[] words = new String[]{"hot", "dot", "dog", "lot", "log", "cog"};

        // when
        WordConvert wordConvert = new WordConvert();
        int actual = wordConvert.solution(begin, target, words);

        // then
        Assert.assertEquals(4, actual);
    }

    @Test
    public void solution_case2() {
        // given
        String begin = "hit";
        String target = "cog";
        String[] words = new String[]{"hot", "dot", "dog", "lot", "log"};

        // when
        WordConvert wordConvert = new WordConvert();
        int actual = wordConvert.solution(begin, target, words);

        // then
        Assert.assertEquals(0, actual);
    }

    @Test
    public void valid() {
        // given
        String begin = "hit";
        String target = "hot";

        // when
        boolean actual = WordConvert.valid(begin, target);

        // then
        Assert.assertEquals(true, actual);
    }

    @Test
    public void valid_case2() {
        // given
        String begin = "hit";
        String target = "hog";

        // when
        boolean actual = WordConvert.valid(begin, target);

        // then
        Assert.assertEquals(false, actual);
    }

    @Test
    public void valid_case3() {
        // given
        String begin = "hit";
        String target = "cog";

        // when
        boolean actual = WordConvert.valid(begin, target);

        // then
        Assert.assertEquals(false, actual);
    }
}