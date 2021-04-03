package mine.Strings;

import java.util.Scanner;

public class PermutationsOfAnInputString {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();
        permutString(str,"");
        String str1 = "abc";
        permutationOfString(str1,"");
    }

    private static void permutationOfString(String str1, String result) {
        if(str1.length()==0)
            System.out.println(result);
        for (int i = 0; i < str1.length(); i++) {
            String subString = str1.substring(0,i)+str1.substring(i+1);
            permutationOfString(subString,result+str1.charAt(i));
        }
    }

    private static void permutString(String str, String result) {
        if(str.length()==0){
            System.out.println("Permutations of string: "+result);
            System.out.println();
            System.out.println("========================================");
        }
        for (int n = 0; n < str.length(); n++) {
            char ch = str.charAt(n);
            System.out.println("ch: of ["+n+"]: "+ch);
            String subString = str.substring(0,n)+str.substring(n+1);
            System.out.println(str+".substring(0,"+n+"): " + str.substring(0,n));
            System.out.println(str+".substring("+(n+1)+"): " + str.substring(n+1));
            System.out.println("SubString: "+subString);
            System.out.println("result+ch: "+result+ch);
            System.out.println("permutString("+subString+","+result+ch+")");
            System.out.println();System.out.println();

            permutString(subString,result+ch);
        }
    }
}
