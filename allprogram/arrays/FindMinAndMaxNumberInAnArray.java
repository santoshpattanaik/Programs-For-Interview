package allprogram.arrays;

public class FindMinAndMaxNumberInAnArray {
    public static void main(String[] args) {
        int arr[]=new int[]{40,30,60,10,80,70,90,100};
        int min=arr[0];
        int max=arr[0];
        for (int i :arr){
            if(i>max)
                max=i;
            if (i<min)
                min=i;
        }
        System.out.println("Max:"+max+" Min:"+min);
    }
}
