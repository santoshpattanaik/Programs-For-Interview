package mine.Strings;

import java.util.Scanner;

public class CheckIfStringContainsDigitOrNot {
    public static void main(String[] args) {
        System.out.println("Input a String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();
        String result ="String doesn't contain digits";
        for (int i = 0; i < str.length(); i++) {
            if(ch[i]>=48 && ch[i]<=58){
                result = "String contain digits";
                break;
            }
        }
        System.out.println(result);

    }
}
