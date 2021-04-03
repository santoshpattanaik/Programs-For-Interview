package hackerrank;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacterInString {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println(list.size());
        String s1 = "Hello";
        String s2 = "Who";
        findCommonCharacterBetweenStrings(s1.toCharArray(),s2.toCharArray());

        File file = new File("test.txt");
    }

    private static void findCommonCharacterBetweenStrings(char[] charArray1, char[] charArray2) {

    }
}
