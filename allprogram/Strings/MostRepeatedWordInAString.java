package mine.Strings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MostRepeatedWordInAString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
        String line="";
        String[] stringArray = new String[0];
        Map<String,Integer> map = new HashMap<>();
        int count=0;
        while ((line = reader.readLine()) != null){
            System.out.println(line);
            stringArray=line.split(" ") ;
            for (String s : stringArray){
                if(map.containsKey(s)) {
                    count=map.get(s);
                    map.put(s,++count);
                }else
                    map.put(s,1);
            }
        }
        reader.close();

        Integer max = 0;
        String repeatedWord="";
        for (Map.Entry object:map.entrySet()){
            System.out.println(object.getKey()+" : "+object.getValue());
            if((Integer)object.getValue() > max) {
                max = (Integer) object.getValue();
                repeatedWord = (String)object.getKey();
            }
        }
        System.out.println("Most Repeated Word Is : '"+repeatedWord +"' with count: "+max);
    }
}
