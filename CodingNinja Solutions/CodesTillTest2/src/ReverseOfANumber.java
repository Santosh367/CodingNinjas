import java.util.*;
public class ReverseOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int rem = 0;
        int ans = 0;
        while (N > 0) {
            rem = N % 10;
            ans = ans * 10 + rem;
            N = N / 10;

        }
        System.out.print(ans);
    }

}
