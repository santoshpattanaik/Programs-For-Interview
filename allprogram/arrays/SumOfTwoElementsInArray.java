package allprogram.arrays;

import java.util.HashSet;

public class SumOfTwoElementsInArray {
    /*public static void main(String[] args) {
        int arr[] = new int[]{ 1, 4, 45, 6, 10, -8 };
        int input = 49;
        Arrays.sort(arr);
        System.out.println(arr);
        for(int i:arr)
            System.out.print(i+" ");
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] + arr[right] == input) {
                System.out.println("Index at: left: " + left + " right: " + right);
                break;
            }else if (arr[left] + arr[right] > input)
                right--;
            else if (arr[left] + arr[right] < input)
                left++;

        }
    }*/

    public static void main(String[] args) {
        int sum = 50;
        int arr[] = new int[]{1,5, 5, 45, 6,5, 10, -8};
        HashSet<Integer> set = new HashSet<>();
        for (int i:arr){
            int temp=sum-i;
            System.out.println("temp:"+temp+" i:"+i+" sum:"+sum);
            if (set.contains(temp))
                System.out.println("Sum of two no: "+i+" and "+temp);
            set.add(i);
            System.out.println(set);
        }
    }
}
