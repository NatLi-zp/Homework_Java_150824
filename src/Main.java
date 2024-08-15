import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //int[] arr = {1,2,3,5};
        int arr[] = {6,1,2,8,3,4,7,10,5};
        int sum1 = 0;
        int sum2 = 0;

        Arrays.sort(arr);
        int maxNum = arr[arr.length-1];
        for (int i = 0; i <= maxNum; i++) {
            sum1 += i;
        }

        for (int i = 0; i < arr.length; i++) {
            sum2 += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Недостающий элемент: "+(sum1-sum2));
    }
}