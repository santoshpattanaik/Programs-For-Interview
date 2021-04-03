package allprogram.numberpattern;
/*

           1
         2 3
       4 5 6
     7 8 9 10
   11 12 13 14 15


 */

public class NumberPattern5 {
    public static void main(String[] args) {
        int no =5;
        int print=1;
        for (int i = 0; i < no; i++) {
            for (int j = (no-i)*2-1; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print(" "+print);
                print++;
            }
            System.out.println();
        }
    }
}
