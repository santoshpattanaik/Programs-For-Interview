package allprogram.numberpattern;
/*
                 1
                1 2
               1 2 3
              1 2 3 4
             1 2 3 4 5

 */
public class NumberPattern3 {
    public static void main(String[] args) {
        int no =5;
        for (int i = 1; i <= no; i++) {
            for (int j = no-i; j > 0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}
