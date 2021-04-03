package mine.Strings;

import java.util.Arrays;

public class SortAString {
    public static void main(String[] args) {
        String str = "GeeksforGeeks";
        int[] ch = new int[256];
        for (int i = 0; i < str.length(); i++) {
            ch[str.charAt(i)]++;
        }

        Arrays.sort(str.toCharArray());
        int count = 0;
        System.out.println("Input String: "+str);
        System.out.println("Sorting of the String:Ascending Order ");
        for (int i = 0; i < ch.length; i++) {
            count=ch[i];
            while (count > 0){
                //System.out.print(ch[i]+":"+(char)i+" ");
                System.out.print((char)i);
                count--;
            }

        }
        System.out.println("\nSorting of the String:Descending Order ");

        for (int i = ch.length-1; i >=0 ; i--) {
            count=ch[i];
            while (count > 0){
                //System.out.print(ch[i]+":"+(char)i+" ");
                System.out.print((char)i);
                count--;
            }

        }

    }
}
