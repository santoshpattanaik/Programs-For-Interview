package mine.Strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateCharFromString {
    public static void main(String[] args) {
        System.out.print("Enter a String:");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //char[] ch = str.toCharArray();
        Set<Character> set = new HashSet<>();
//        for (Character ch1:str.toCharArray()){
//            set.add(ch1);
//        }
        for (int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        System.out.printf("Entered String: "+ str +"\nRemoving Duplicate Character from the above string: ");
        for (Character ch:set){
            System.out.print(ch);
        }

    }
}
