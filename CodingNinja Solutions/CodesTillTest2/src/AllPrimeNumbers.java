import java.util.*;
public class AllPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count=0;
        for (int i = 2; i <= N; i++) {
            for ( int j = 2; j <= i-1; j++) {
                if (i%j == 0) {
                    count=count+1;
                }

            }
            if(count==0){
                System.out.println(i);
            }
            else {
                count=0;
            }

        }
    }
}
