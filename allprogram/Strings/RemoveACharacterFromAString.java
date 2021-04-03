package mine.Strings;

import java.util.Scanner;

public class RemoveACharacterFromAString {
    public static void main(String[] args) {
        System.out.println("Enter a String:");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Enter a Char to remove from string:");
        char ch= sc.next().charAt(0);
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ch)
                result=result+str.charAt(i);
            else
                continue;
        }
        System.out.println("After Removing '"+ch+"' from "+str+"\nFinal Output:"+result);
    }
}
