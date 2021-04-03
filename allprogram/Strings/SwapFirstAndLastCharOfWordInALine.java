package allprogram.Strings;

import java.util.HashMap;
import java.util.Map;

public class SwapFirstAndLastCharOfWordInALine {
    public static void main(String[] args) {
        String input = "HoW ArE YoU SantosH##!";
        String output = playWithString(input);
        System.out.println("Input: "+input);
        System.out.println("Output: "+output);
        Map<String,String> map = new HashMap<>();
        map.put(null,null);
        System.out.println(map);
        System.out.println(map.put(null,"A"));
        System.out.println(map);

        map.put(null,"B");
        System.out.println(map);

    }

    private static String playWithString(String input) {
        String output = "";
        String[] words = input.split(" ");
        for (String word:words) {
            int i;
            char[] ch = word.toCharArray();
            for (i = ch.length-1; i >= 0; i--) {
                if((int) ch[i] >= 65 && (int) ch[i] <=90 || (int) ch[i] >= 97 && (int) ch[i] <=122)
                    break;
            }
            output = output +" "+ ch[i] + word.substring(1,i)+ch[0] + word.substring(i+1);
        }
        return output;
    }
}
