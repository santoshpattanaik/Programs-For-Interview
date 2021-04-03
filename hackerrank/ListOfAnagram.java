package hackerrank;

import java.util.*;

public class ListOfAnagram {
    public static void main(String[] args) {
        List<List<String>> groupAnagramWords = playWithAnagram(Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat"));
        System.out.println(groupAnagramWords);
    }

    private static List<List<String>> playWithAnagram(List<String> anagramList) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> finalList = new ArrayList<>();
        for (String str : anagramList) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sortedString = String.valueOf(ch);
            if (map.containsKey(sortedString)) {
                List<String> newList = map.get(sortedString);
                newList.add(str);
                map.put(sortedString,newList);
            } else
                map.put(sortedString,new ArrayList<>(Arrays.asList(str)));
        }
        for (Map.Entry entry: map.entrySet()) {
            System.out.println(entry.getValue());
            finalList.add((List<String>) entry.getValue());
        }
        return finalList;
    }
}
