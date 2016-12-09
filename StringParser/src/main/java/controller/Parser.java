package controller;

import View.View;
import model.entity.*;
import model.marker.Element;
import util.TextFileReader;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Controller class
 * Parser
 * Created by daniel volkov on 04.12.2016.
 * @author danielvolkov@gmail.com
 */
public class Parser {
    /**
     * regular expressions for finding sentence and word in the text
     */
    public static final String SENTENCE_PATTERN = "[^.!?]+";
    public static final String WORD_PATTERN = "([a-zA-Zа-яА-Я#_]+)";

    /**
     * path to input file
     */
    private String path;

    /**
     * fields of util class for reading file
     * and View for show results
     */
    private TextFileReader fileReader;
    private View view;

    /**
     * Main Constructor
     * @param path to file
     * @param fileReader util class for reading string from .txt
     * @param view view class for show results
     */
    public Parser(String path,TextFileReader fileReader,View view) {
        this.path = path;
        this.fileReader = fileReader;
        this.view = view;
    }

    /**
     * main method of controller
     * runs process which execute parsing in corresponding order
     */
    public void runProcess() {
        Text text = parseText(fileReader.readTextFromFile(path));
        //System.out.println(text.getElements().get(0));
        List list = sortWordsBySymbol(new Symbol('о'),text);
        view.printWords(list);
    }

    /**
     * method for parsing Text from String
     * @param inputText string which should be parse
     * @return Text object which contains Elements of Text
     */
    public Text parseText(String inputText) {
        //System.out.println(inputText);
        Text text = new Text(new ArrayList<Element>());
        Pattern textPattern = Pattern.compile(SENTENCE_PATTERN);
        Matcher textMatcher = textPattern.matcher(inputText);

        while(textMatcher.find()) {
            text.addElement(
                    parseSentence(textMatcher.group()));
        }
        return text;
    }

    /**
     * method for parsing Sentence from String
     * @param inputSentence string which should be parse
     * @return Sentence object which contains Elements of Sentence
     */
    public Sentence parseSentence(String inputSentence) {
        //System.out.println(inputSentence);
        Sentence sentence = new Sentence(new ArrayList<Element>());
        Pattern sentencePattern = Pattern.compile(WORD_PATTERN);
        Matcher sentenceMatcher = sentencePattern.matcher(inputSentence);
        while(sentenceMatcher.find()) {
            sentence.addElement(
                    parseWord(sentenceMatcher.group()));
        }
        return sentence;
    }

    /**
     * method for parsing words from String
     * @param inputWord string which should be parse
     * @return Word object which contains Elements of Words
     */
    public Word parseWord(String inputWord) {
        //System.out.println(inputWord);
        Word word = new Word(new ArrayList<Element>());
        for (char symbol : inputWord.toCharArray() ) {
            //System.out.println(symbol);
            word.addElement(new Symbol(symbol));
        }
        //System.out.println(word);
        return word;
    }

    /**
     * method for sorting words by number of correspondent symbol in Word
     * @param symbol of word for calculating number of symbols
     * @param text object with elements of text
     * @return List of sorting words
     */
    List sortWordsBySymbol(Symbol symbol, Text text) {
        List listOfWords = countNumberOfSymbols(symbol,text);
        Collections.sort(listOfWords, new Word.ValueComparator());

        return listOfWords;
    }

    /**
     * Method for count number of symbol for each word
     * @param symbol
     * @param text object with elements of text
     * @return List of Words
     */
    List countNumberOfSymbols(Symbol symbol, Text text) {
        Iterator textIterator = text.getElements().iterator();
        List<Word> sortedWords = new ArrayList<>();
        while (textIterator.hasNext()) {
            Sentence sentence = (Sentence) textIterator.next();
            Iterator sentenceIterator = sentence.getElements().iterator();
            while (sentenceIterator.hasNext()){
                Word word = (Word) sentenceIterator.next();
                word.countNumbersBySymbol(symbol.getElement());
                sortedWords.add(word);
            }
        }
        return sortedWords;
    }
}
