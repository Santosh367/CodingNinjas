public class Sort012 {
    public static void sort012(int[] arr) {
        int index0 = 0;
        int Index2 = arr.length - 1;
        int i = 1;
        int temp = 0;
        while (i < arr.length) {
            if (arr[i] == 0 && i > index0) {
                temp = arr[i];
                arr[i] = arr[index0];
                arr[index0] = temp;
                index0++;
            } else if (arr[i] == 2 && i < Index2) {
                temp = arr[i];
                arr[i] = arr[Index2];
                arr[Index2] = temp;
                Index2--;
            } else
                i++;
        }
    }
}
