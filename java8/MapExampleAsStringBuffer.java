package java8;

import java.util.HashMap;
import java.util.Map;

public class MapExampleAsStringBuffer {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put(new String("ABC"),123);
        map.put(new String("ABC"),345);
        System.out.println(map);
    }
}
