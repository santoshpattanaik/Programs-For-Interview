package mine.Strings;

public class CheckIfStringContainsAnotherString {
    public static void main(String[] args) {
        String str1 = "OS";
        String str2 = "SANTOSH";
        if (str2.contains(str1))
            System.out.println(str2 + " Contains " + str1);
        else
            System.out.println(str2 + " Doesn't Contain " + str1);

        if (str2.indexOf(str1) != -1)
            System.out.println(str2 + " Contains " + str1);
        else
            System.out.println(str2 + " Doesn't Contain " + str1);

        if (str2.lastIndexOf(str1) != -1)
            System.out.println(str2 + " Contains " + str1);
        else
            System.out.println(str2 + " Doesn't Contain " + str1);


        int res = isSubstring(str1, str2);

        if (res == -1)
            System.out.println(str1+" Not present in "+str2);
        else
            System.out.println(str1+" Present at index(starting from 0): " + res+" in "+str2);
    }
        static int isSubstring(String subString, String mainString)
        {
            int lenMainString  = mainString.length();
            int lenSubString = subString.length();
            for (int i = 0; i < lenMainString-lenSubString; i++) {
                int j=0;
                for (j = 0; j < lenSubString; j++) {
                    if (mainString.charAt(i+j) != subString.charAt(j))
                        break;
                }
                if (j==lenSubString)
                    return i;
            }
            return -1;
        }



}
