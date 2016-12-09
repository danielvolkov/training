import View.View;
import controller.Parser;
import util.TextFileReader;

/**
 * Application Runner
 *
 * Created by daniel volkov on 04.12.2016.
 * @author danielvolkov@gmail.com
 */
public class StringParserRunner {
    /**
     * path to input file
     */
    public static final String INPUT_FILE = "/home/daniel/input";

    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {
        TextFileReader fileReader = new TextFileReader();
        View view = new View();
        Parser parser = new Parser(INPUT_FILE,fileReader,view);
        parser.runProcess();

        //System.out.println(Punctuation.Syntax.POINT.getValue());
    }
}
