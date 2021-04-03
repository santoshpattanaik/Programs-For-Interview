package mine.Strings;

import java.util.Scanner;

public class StringToIntegerAndIntegerToString {
    public static void main(String[] args) {
        System.out.println("Enter an input: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Integer i = Integer.parseInt(str);
        String s = i.toString();

        System.out.println("StringToInteger: "+i+"\nIntegerToString: "+s);
    }
}
