import View.View;
import controller.Parser;
import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import util.TextFileReader;

/**
 * Test class for testing
 * Created by daniel volkov on 04.12.2016.
 * @author danielvolkov@gmail.com
 */
public class ParserTest {
    public static final String TEST_TEXT = "This is text. Has two sentences.";
    public static final String TEST_SENTENCE = "This is sentence.";
    public static final String TEST_WORD = "This";
    private static Parser parser;

    @BeforeClass
    public static void createParser(){
        parser = new Parser("test",
                            mock(TextFileReader.class),
                            mock(View.class) );
    }

    /**
     * test for parseText method of Parser class
     */
    @Test
    public void parseTextTest() {
        int count = parser.parseText(TEST_TEXT).getElements().size();
        System.out.println(count);
        Assert.assertTrue(count ==  2);
    }
    /**
     * test for parseSentence method of Parser class
     */
    @Test
    public void parseSentenceTest() {
        Assert.assertTrue(parser.parseSentence(TEST_SENTENCE).getElements().size() == 3);
    }
    /**
     * test for parseWord method of Parser class
     */
    @Test
    public void parseWordTest() {
        Assert.assertTrue(parser.parseWord(TEST_WORD).getElements().size() == 4);
    }
}
