public class RotateArray {
    public static void rotate(int[] arr, int d) {
        if(d<=0){
            return;
        }
        if(d>arr.length){
            d=d-arr.length;
        }
        ArrayRev(arr,0,arr.length-1);
        ArrayRev(arr,0,arr.length-1-d);
        ArrayRev(arr,arr.length-d,arr.length-1);

    }
    private static void ArrayRev(int[] arr,int S,int E)
    {
        int temp;
        while(S<E){
            temp = arr[S];
            arr[S++] = arr[E];
            arr[E--] = temp;
        }
    }
}
