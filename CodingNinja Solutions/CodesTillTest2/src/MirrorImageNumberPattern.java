import java.util.*;
public class MirrorImageNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <=N ; i++) {
            for (int j = i; j <=N-1 ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i; k++) {
                System.out.print(k);
            }
            System.out.println("");
        }
    }
}
