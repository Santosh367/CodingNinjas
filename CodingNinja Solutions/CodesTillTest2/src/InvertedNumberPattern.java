import java.util.*;
public class InvertedNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k=N;
        for (int i = 1; i <=N ; i++) {
            for (int j = N; j >=i ; j--) {
                System.out.print(k);
            }
            k=k-1;
            System.out.println("");

        }

    }
}
