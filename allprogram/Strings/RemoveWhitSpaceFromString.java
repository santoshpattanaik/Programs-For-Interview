package allprogram.Strings;

import java.util.Scanner;

public class RemoveWhitSpaceFromString {
    public static void main(String[] args) {
        System.out.println("Enter String: ");
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println("Input String: "+str);
        String result="";
        char[] ch = str.toCharArray();
        System.out.println(str.length());
        for (int i = 0; i <str.length(); i++) {
            if(ch[i] != 32){
                result=result+ch[i];
            }
        }
        System.out.println("Removing Space : "+result);
    }
}
