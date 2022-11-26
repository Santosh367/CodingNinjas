import java.util.*;
public class ReturnArraySum {
    public static int sum(int[] arr) {
        //Your code goes here

//      No need to take input in Code editor online
        Scanner sc = new Scanner(System.in);
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            arrSum = arrSum + arr[i];

        }
        System.out.println(arrSum);
        return arrSum;

    }

    // Main method Not required in Code editor online
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int test = 0;
        while (test < t) {
            int N = sc.nextInt();
            int arr[] = new int[N];
            sum(arr);
            test=test+1;
        }


    }
}

