public class FindUnique {


    public static int findUnique(int[] arr) {
        int k = 0;
        boolean[] V = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            if (V[i] == false) {
                boolean isDup= false;
                for (int j = i + 1; j < arr.length; j++) {
                    if (x == arr[j]) {
                        isDup = true;
                        V[j] = true;
                    }
                }
                if (!isDup)
                    k = x;

            }
        }

        return k;
    }
    public static void main(String[] args) {

    }
}
