package hackerrank;


public class Solution {
    public static void main(String[] args) {
        // String randomString = solution(3,4);
        // System.out.println(randomString);
        int[] array = {4, 8, 3, 4, 1, 2, 2, 3, 6, 5, 4, 5};
        String status = playWithArray(array);
        System.out.println(status);
    }

    private static String playWithArray(int[] array) {
        String status = "YES";
        int i = 0;
        while (i < array.length - 1) {
            System.out.println(array[i] + " : " + array[i + 1]);

            if ((Math.abs(array[i] - array[i + 1]) != 1)) {// - 1 || array[i] == array[i + 1] + 1))
                status = "NO";
                break;
            }
            i = i + 2;//2 4
            System.out.println(i);
        }

        return status;
    }

    public static String solution(int A, int B) {
        // write your code in Java SE 8
        String randomString = playWithString(A, B);
        return randomString;
    }

    public static String playWithString(int a, int b) {
        String newString = "";
        while (0 < a || 0 < b) {
            if (a < b) {
                b--;
                newString = newString.concat("b");
                if (0 < b--)
                    newString = newString.concat("b");
                if (0 < a--)
                    newString = newString.concat("a");
                System.out.println(newString);
            } else if (b < a) {
                a--;
                newString = newString.concat("a");
                if (0 < a--)
                    newString = newString.concat("a");
                if (0 < b--)
                    newString = newString.concat("b");
            } else {
                a--;
                newString = newString.concat("a");
                b--;
                newString = newString.concat("b");
            }
        }
        return newString;
    }
}
