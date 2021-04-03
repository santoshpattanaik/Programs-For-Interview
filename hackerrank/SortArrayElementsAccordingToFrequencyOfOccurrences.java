package hackerrank;

import java.util.*;

public class SortArrayElementsAccordingToFrequencyOfOccurrences {
    public static void main(String[] args) {
        int arr[] = {2, 5, 2, 8, 5, 6, 8, 8};
        arr = sortArrayAccordingToFrequency(arr);
        for (int i:arr) {
            System.out.print(i+", ");
        }
    }

    private static int[] sortArrayAccordingToFrequency(int[] arr) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for (int i:arr) {
            if (map.containsKey(i)){
                int value = map.get(i);
                map.put(i,++value);
            }else
                map.put(i,1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        //  list.sort(Comparator.comparing(Map.Entry::getValue));
        //  list.sort((o1, o2) -> o1.getValue().compareTo(o2.getValue()));
        list.sort(new Comparator<>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        int j = 0;
        for (Map.Entry entry:list) {
            int value = (int) entry.getValue();
            int key = (int) entry.getKey();
            for (int i = 0; i < value; i++) {
                arr[j] = key;
                j++;
            }
        }
        return arr;
    }
}
