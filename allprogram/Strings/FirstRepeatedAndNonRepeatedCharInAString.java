package mine.Strings;

public class FirstRepeatedAndNonRepeatedCharInAString {
    public static void main(String[] args) {
        String str = "NATOSH";
        int[] ch = new int[256];
        boolean isRepeated = false;
        boolean isNonRepeated = false;
        for (int i = 0; i < str.length(); i++) {
            ch[str.charAt(i)]++;
            /*if(ch[str.charAt(i)]>1 && !isRepeated){
                System.out.println("First Repeated Char: "+str.charAt(i));
                isRepeated=true;
            }*/
        }
        for (int i = 0; i <str.length() ; i++) {
            if (ch[str.charAt(i)] == 1 && !isNonRepeated) {
                System.out.println("First Non Repeated Char: " + str.charAt(i));
                isNonRepeated=true;
            }else if(ch[str.charAt(i)]>1 && !isRepeated){
                System.out.println("First Repeated Char: "+str.charAt(i));
                isRepeated=true;
            } else if(isNonRepeated && isRepeated) {
                System.out.println("Got both the char");
                break;
            } else{
                System.out.println("Still finding the char ");
                continue;
            }

        }
    }
}
