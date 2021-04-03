package hackerrank;

public class RemoveKconsecutiveCharactersFromString {
    public static void main(String[] args) {
        String input = "aaabbcccddeee";
        int k =3;
        String output = removeKConsecutiveChar(input,k);
    }

    private static String removeKConsecutiveChar(String input,int k) {
        String output = "";
        char[] ch = input.toCharArray();
        int j = 0;
        for (int i = 0; i < ch.length - k; i++) {
            for ( j = i+j; j < k+i; j++) {
                if (ch[i] != ch[j])
                    break;

                System.out.println(i+" "+j+" "+ch[i]+","+ch[j]);
            }
            if (j == k) {
                 output = input.substring(i,j);
                System.out.println(output);
                System.out.println("Found Substring");
            }
            j=0;
        }
        return output;
    }
}
