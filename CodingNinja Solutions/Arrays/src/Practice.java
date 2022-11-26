

// ----------------------- Arrays Using Functions --------------------------//



import java.util.*;
public class Practice {


    public static int[] TakeInput(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    public static int largest(int arr[]){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];

            }

        }
        return max;
    }


    public static void main(String[] args) {
        int arr[] = TakeInput();
        int lar = largest(arr);
        System.out.println(lar);








































//    public static void PrintArray(int[] arr){
//        for (int j = 0; j < arr.length; j++) {
//            System.out.println("Element at "+ j + "th index is "+arr[j]);
//
//        }
//
//
//    }
//
//    public static int[] takeInput(){
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int arr[] = new int[size];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Enter element at "+ i + "th index");
//            arr[i]= sc.nextInt();
//        }
//        return arr;
//
//    }
//    public static void main(String[] args) {
//        int arr[] = takeInput();
//        PrintArray(arr);
//
//

    }

}
