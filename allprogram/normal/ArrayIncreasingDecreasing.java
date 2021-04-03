package allprogram.normal;

public class ArrayIncreasingDecreasing {
    public static void main(String[] args) {
        int[] array = new int[5];
        array= new int[]{3, 4, 2, 5, 6};
        boolean testArray = true;
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) < array.length && (i + 2) < array.length) {
                if ((array[i] > array[i + 1] && array[i + 1] < array[i + 2]) || (array[i] < array[i + 1] && array[i + 1] > array[i + 2])){
                    continue;
                }else
                    testArray = false;
            }
        }
            System.out.println(testArray);
    }
}
