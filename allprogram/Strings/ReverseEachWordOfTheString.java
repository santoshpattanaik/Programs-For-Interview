package mine.Strings;

import java.util.Scanner;

public class ReverseEachWordOfTheString {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArray = str.split(" ");
        String finalWord="";
        for (String s : strArray){
            String reverseEachWord=reverseString(s);
            finalWord= finalWord+reverseEachWord+" ";
        }
        System.out.println("Reversing Each WORD of the input String : -> " +str+ " is as follows ->"+finalWord);
    }

    public static String reverseString(String s) {
        if(s.isEmpty()){
            return s;
        }
        return reverseString(s.substring(1))+s.charAt(0);
    }
}
