package mine.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NoOfWordsInALine {
    public static void main(String[] args) {

        NoOfWordsInALine emp = new NoOfWordsInALine();
        System.out.println(emp);
        emp = new NoOfWordsInALine();
        System.out.println(emp);

        System.out.println("No Of Words in the input line :");
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Input String: "+str);
        String[] arrString = str.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for (String st : arrString){
            System.out.println(st);
            if(map.containsKey(st)){
                int count=map.get(st);
                map.put(st,++count);
            }else {
                map.put(st,1);
            }
        }
        System.out.println("Count: "+map);

    }
}
