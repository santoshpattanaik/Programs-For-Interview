package mine.Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCharInsideString {
    public static void main(String[] args) {
        String str = "SSANTHOSHH";
        char[] ch = str.toCharArray();
        Set<Character> set = new HashSet<>();
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if(ch[i] == ch[j]){
                    set.add(ch[i]);
                    break;
                }
            }
        }
        for(char c :ch){
            if(map.containsKey(c)){
                int count=map.get(c);
                map.put(c,++count);
            }else {
                map.put(c,1);
            }
        }
        System.out.println(set);
        System.out.println(map);
    }
}
