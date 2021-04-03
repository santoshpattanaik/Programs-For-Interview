package allprogram.datastructure.sorting;

/*
Time Complexity - O(n2)
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{10,50,20,30,70,60,40};
        for (int i = 0; i < arr.length; i++) {

            int min_idx= i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[min_idx])
                    min_idx=j;
            }
            int temp = arr[min_idx];
            arr[min_idx]=arr[i];
            arr[i]=temp;
        }
        for (int i:arr)
            System.out.print(i+",");
    }
}
