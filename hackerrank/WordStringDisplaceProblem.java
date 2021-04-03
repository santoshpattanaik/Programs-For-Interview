package hackerrank;

import static java.lang.System.exit;
import static java.lang.System.setOut;

public class WordStringDisplaceProblem {
    public static void main(String[] args) {
        String word = "abcabc";
        int inputLen1 = 1;
        int inputLen2 = 2;
/*
        if (inputLen1 > word.length() || inputLen2 >word.length()){
            System.out.println("Invalid Input");
            exit(0);
        }
*/
        int noOfTurn = playWithString(word, inputLen1, inputLen2);
        System.out.println(noOfTurn);
        ;
    }

    private static int playWithString(String word, int inputLen1, int inputLen2) {
        int noOfTurn = 0;
        String originalWord = word;
        String newWord = "";
        while (!originalWord.equals(newWord)) {
            word = word.substring(word.length() - inputLen1).concat(word.substring(0, word.length() - inputLen1));
            System.out.println(word);
            word = word.substring(word.length() - inputLen2).concat(word.substring(0, word.length() - inputLen2));
            System.out.println(word);
            newWord = word;
            noOfTurn++;
        }
        return noOfTurn;
    }
}
