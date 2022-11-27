import java.util.*;
public class PrintAllPairs {

    public static void printPair(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.println(arr[i]+","+arr[j]);

            }
        }
    }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n= in.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= in.nextInt();
        }
        printPair(arr);
    }
}
