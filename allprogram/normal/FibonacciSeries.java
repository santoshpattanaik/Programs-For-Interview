package allprogram.normal;

import java.util.Scanner;

public class FibonacciSeries {
    static int sum = 0;
    static int first =0;
    static int second=1;
    public static void main(String[] args) {
        System.out.println("Enter a no: ");
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.next());
        System.out.println("Entered No: "+input);
        System.out.print(first+" "+second+" ");
//        for (int i = 0; i < input-2; i++) {
//            sum = first+second;
//            first=second;
//            second=sum;
//            System.out.print(sum+" ");
//        }
        printFibonacci(input-2);
        //0 1 1 2 3 5 8 13 21 34
        //0 1 1 2 3 5 8 13 21 34
    }

    private static void printFibonacci(int i) {
        if(i>0){
            sum=first+second;
            first=second;
            second=sum;
            System.out.print(sum+" ");
            printFibonacci(i-1);
        }
    }
}
