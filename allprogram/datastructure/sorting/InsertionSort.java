package allprogram.datastructure.sorting;

/*
Time Complexity - O(n2)
 */
public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = new int[]{20,30,10,50,70,60,40};
        insertionSort(arr);
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for (int i:arr
             ) {
            System.out.println(i);
        }
    }
}
