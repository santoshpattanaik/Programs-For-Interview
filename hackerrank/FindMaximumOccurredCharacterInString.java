package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class FindMaximumOccurredCharacterInString {
    public static void main(String[] args) {
        String input = "abcdefgh";
        char output = findMaxOccurredCharacter(input.toCharArray());
        System.out.println("MostOccurredChar: "+output);
    }

    private static char findMaxOccurredCharacter(char[] charArray) {
        char ch =charArray[0];
        int maxCount = 0;
        Map<Character,Integer> charMap = new HashMap<>();
        for (char c:charArray) {
            if (charMap.containsKey(c)){
                int count = charMap.get(c);
                charMap.put(c,++count);
                if (count > maxCount) {
                    maxCount = count;
                    ch = c;
                }
            }else
                charMap.put(c,1);
        }
        return ch;
    }
}
