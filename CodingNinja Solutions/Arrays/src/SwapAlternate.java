public class SwapAlternate {
    public static void swapAlternate(int arr[]) {
        //Your code goes here
        for (int i = 0; i < arr.length; i += 2) {

            if (i == arr.length - 1 && i % 2 == 0) {
                break;
            }
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;

        }
    }

}
