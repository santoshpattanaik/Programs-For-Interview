package mine.Strings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NoOfWordsCharsLinesInAtextFile {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
        String line;
        String[] textArraay = new String[100];
        char[] charArray = new char[1000];
        int noOfLines = 0,noOfWords=0,noOfChar=0;
        while ((line=bufferedReader.readLine())!=null){
            textArraay = line.split(" ");
            charArray=line.toCharArray();
            noOfLines++;
            noOfWords+=textArraay.length;
            noOfChar+=charArray.length;
        }
        bufferedReader.close();
        System.out.println("No of Words: "+noOfWords);
        System.out.println("No of Char: "+noOfChar);
        System.out.println("No of lines: "+noOfLines);
    }
}
