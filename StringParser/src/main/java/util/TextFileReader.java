package util;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * TextFileReader class
 * util class for reading string from text file
 *
 * Created by daniel volkov on 04.12.2016.
 * @author danielvolkov@gmail.com
 */
public class TextFileReader {
    /**
     * method reads String from txt file
     * @param path
     * @return String
     */
    public String readTextFromFile(String path){
        String text = "";

        try(Scanner in = new Scanner(new File(path)))
        {
            while( in.hasNextLine() ){

                text += in.nextLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return text;
    }
}
