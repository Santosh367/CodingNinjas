import java.util.*;
public class SumPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i, j, sum = 0, tsum;
        for (i = 1; i <= N; i++) {
            tsum = 0;
            for (j = 1; j <= i; j++) {
                sum += j;
                tsum += j;
                System.out.print(j);
                if (j < i) {
                    System.out.print("+");
                }
            }
            System.out.println("="+tsum);
        }
    }
}
