package allprogram.normal;

import java.util.Scanner;

public class PaliondromeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a no: ");
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next());
        int enteredNo=num;
        int sum =0;
        while(num>0){
            int rem=num%10;
            sum=rem+(sum*10);
            num=num/10;
        }
        if (enteredNo == sum)
            System.out.println("ITS A PALINDROME");
        else
            System.out.println("ITS NOT A PALINDROME");
    }
}
