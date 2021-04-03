package mine.Strings;

public class StringIsPaliondromeOrNot {
    public static void main(String[] args) {
        String str = "MALAYALAM";
        String result = "PALIONDROME";
        char[] ch = str.toCharArray();
//        for (int i = 0,j = str.length()-1; i < str.length() && j >= 0 ; i++,j--) {
//               if (ch[i]!=ch[j])
//                    result="NOT PALIONDROME";
//        }
        int i =0,j=str.length()-1;
        while (i<j){
            if (ch[i]!=ch[j])
                    result="NOT PALIONDROME";
            i++;
            j--;
        }
        System.out.println(result);
    }
}
