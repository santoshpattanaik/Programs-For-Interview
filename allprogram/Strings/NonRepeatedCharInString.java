package mine.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatedCharInString {
    public static void main(String[] args) {
        System.out.println("Enter String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Input String: "+str);
        char[] ch = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(ch[i])){
                int count = map.get(ch[i]);
                map.put(ch[i],++count);
            }else {
                map.put(ch[i],1);
            }
        }
        System.out.println("Count of String: "+map);
        for (Map.Entry<Character,Integer> entry :map.entrySet()){
            if(entry.getValue() == 1)
                System.out.print(entry.getKey());
        }

    }
}
