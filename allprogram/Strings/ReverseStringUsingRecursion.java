package mine.Strings;

public class ReverseStringUsingRecursion {
    public static void main(String[] args) {
        String str = "SANT  O  S  H";
        System.out.println(str);
        String reversed = reverseString(str);
        System.out.println("The reversed string is: " + reversed);
    }

    public static String reverseString(String str)
    {
        System.out.println("Length: "+str.length());
        if (str.isEmpty()){
            System.out.println("Finally Empty....");
            return str;
        }
        //Calling Function Recursively
        System.out.println(str.substring(1) +"->"+ str.charAt(0));
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
