public class SecondLargestInArray {

    public static int secondLargestElement(int[] arr) {
        if (arr.length <= 1){
            return Integer.MIN_VALUE;
        }

        int issame = arr[0];
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == issame)
                count++;
        }
        if (count == arr.length){
            return Integer.MIN_VALUE;
        }

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == largest){
                continue;
            }
            if (arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
