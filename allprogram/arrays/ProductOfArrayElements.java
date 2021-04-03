package allprogram.arrays;

public class ProductOfArrayElements {

   /* public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int product=1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j){
                    product = product * arr[j];
                }
            }
            list.add(product);
            product=1;
        }
        System.out.println(list);
    }*/
   public static void main(String[] args) {
       int arr[] = new int[]{1,2,3,4,5};
       int left[] =new int[arr.length];
       int right[] = new int[arr.length];
       left[0]=1;
       right[arr.length-1]=1;
       int product=1;
       for (int i = 1; i < arr.length; i++) {
            left[i] = left[i-1]*arr[i-1];
       }
       for (int i = arr.length-2; i >=0; i--) {
           right[i]=arr[i+1]*right[i+1];
       }
       for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] +" "+ left[i]+" * "+right[i]+" = "+left[i]*right[i]+"\n");
       }
   }
}

/**
 * [120, 60, 40, 30, 24]
 * [120, 60, 40, 30, 24]
 */