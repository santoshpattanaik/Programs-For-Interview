package hackerrank;

import java.util.*;

public class MergeTwoArrayAndSort {
    public static void main(String[] args) {
        int[] arr1 = {110,70,90,10,30,50};
        int[] arr2 = {100,60,80,20,40,20,20};
        mergeArrayAndSort(arr1,arr2);
    }

    private static void mergeArrayAndSort(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0 , j = 0, k = 0;
        while (i < arr1.length){
            arr3[k] = arr1[i];
            k++;i++;
        }
        while (j < arr2.length){
            arr3[k] = arr2[j];
            k++;j++;
        }
        Set<Integer> tSet = new TreeSet<Integer>();
        for (Integer element:arr3) {
            tSet.add(element);
        }
        System.out.println(tSet);
    }
}
