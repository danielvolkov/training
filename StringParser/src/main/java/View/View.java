package View;

import model.entity.Word;

import java.util.Iterator;
import java.util.List;

/**
 * View class
 * Created by daniel volkov on 04.12.2016.
 * @author danielvolkov@gmail.com
 */
public class View {
    /**
     * prints words from List in to console
     * @param words
     */
    public void printWords(List<Word> words){
        Iterator iterator = words.iterator();
        while ( iterator.hasNext() ) {
            Word word = (Word) iterator.next();
            System.out.println(word);
        }
    }
}
