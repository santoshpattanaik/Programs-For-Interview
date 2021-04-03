package hackerrank;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JSONDeepestLevel {
    public static void main(String[] args) {
       String jsonString = "{\n" +
               "    \"0\" : { \"name\" : \"John\", \"City\" : \"NY\"}\n" +
               "  , \"1\" : { \"name\" : \"Mike\", \"City\" : \"LA\"}\n" +
               "    , \"2\" : { \"name\" : \"Mike\", \"City\" : \"LA\"}\n" +
               "  , \"3\" : { \"4\" : { \"name\" : \"Mike\", \"City\" : \"LA\"} }\n" +
               "\n" +
               "}";

        System.out.println(jsonDepth(jsonString));
    }
    static int jsonDepth (String inputString) {
        int current_max = 0;
        int max = 0;
        int n = inputString.length();

        for (int i = 0; i < n; i++) {
            if (inputString.charAt(i) == '{') {
                System.out.println("Char "+inputString.charAt(i));

                current_max++;
                // update max if required
                if (current_max > max) {
                    max = current_max;
                }
            } else if (inputString.charAt(i) == '}') {
                System.out.println("Char "+inputString.charAt(i));
                if (current_max > 0) {
                    current_max--;
                } else {
                    return -1;
                }
            }
            System.out.println("current_max "+current_max);
            System.out.println("max "+max);

        }

        if (current_max != 0) {
            return -1;
        }

        return max;
    }
}
