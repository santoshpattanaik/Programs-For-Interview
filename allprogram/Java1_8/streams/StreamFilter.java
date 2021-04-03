package allprogram.Java1_8.streams;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StreamFilter {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("A",123);
        map.put("B",345);
        map.put("C",123);
        System.out.println(map);
        Set<Integer> set = new HashSet<>();

        System.out.println(map.entrySet().stream().distinct());
        for(Map.Entry obj:map.entrySet()){
            System.out.println(obj.getKey()+":"+obj.getValue());
            set.add(Integer.valueOf(obj.getValue().toString()));
        }
        System.out.println(set);
    }
}
