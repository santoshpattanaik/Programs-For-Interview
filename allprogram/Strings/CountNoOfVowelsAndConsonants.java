package mine.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountNoOfVowelsAndConsonants {
    /*public static void main(String[] args) {
        char[] vowels = {'a','e','i','o','u'};
        List<String> list = new ArrayList<String>(Arrays.asList("a","e","i","o","u"));
        System.out.println(vowels);
        String str = "santosh";
        int count =0;
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if(ch[i]==vowels[j])
                    count++;
            }
        }
        System.out.println("No Of Vowels : "+count +"\nNo of consonants : "+ (str.length()-count));
    }*/
    public static void main(String[] args) {
        List<Character> list = new ArrayList<Character>(Arrays.asList('a','e','i','o','u'));
        int count =0;
        String str = "santosh";
        for (int i = 0; i < str.length(); i++)
            if(list.contains(str.charAt(i)))
                count++;

        System.out.println("No Of Vowels : "+count +"\nNo of consonants : "+ (str.length()-count));

    }
}
