import java.util.*;
public class Sort01 {

    public static void sortZeroesAndOne(int[] arr) {
        //Your code goes here
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        for (int i = 0; i < (arr.length - sum); i++) {
            arr[i] = 0;
        }
        for (int i = (arr.length - sum); i < arr.length; i++) {
            arr[i] = 1;
        }

    }
}
