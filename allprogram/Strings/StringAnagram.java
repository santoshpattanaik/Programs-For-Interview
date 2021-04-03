package mine.Strings;

import java.util.Arrays;

public class StringAnagram {
    static int NO_OF_CHARS =256;
/*    public static void main(String[] args) {
        String first = "SANTOSH";
        String second = "HSOTNAS";
        char[] ch1 = first.toCharArray();
        char[] ch2 = second.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String result ="Anagram";
        for (int i = 0; i < first.length(); i++) {
            if(first.length() != second.length() || ch1[i] != ch2[i]){
                result="Not Anagram";
                break;
            }
        }
        System.out.println(result);
    }*/

    public static void main(String[] args) {
        String first = "SANTOSH";
        String second = "HSOTNAS";
        String result ="Anagram";
        char[] ch1 = first.toCharArray();
        char[] ch2 = second.toCharArray();
        int[] count1=new int[NO_OF_CHARS];
        int[] count2=new int[NO_OF_CHARS];
        Arrays.fill(count1,0);
        Arrays.fill(count2,0);
        for (int i = 0; i < first.length() && i<second.length() ; i++) {
            count1[ch1[i]]++;
            System.out.println(ch1[i]);
            //System.out.println(count1[ch1[i]]);
            count2[ch2[i]]++;
            System.out.println(ch2[i]);
        }
        for (int i = 0; i < NO_OF_CHARS ; i++) {
            if(count1[i] != 0 || count2[i] != 0){
                System.out.print(i+" --> "+count1[i] +"  ");
                System.out.println();
                System.out.print(i+" --> "+count2[i] +"  ");
                System.out.println();
            }
            if (count1[i] != count2[i] || first.length() != second.length()){
                result ="Not Anagram";
                break;
            }


        }

        System.out.println(result);
    }
}
