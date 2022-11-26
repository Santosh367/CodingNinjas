import java.util.*;
public class OddSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1,j;
        while(i<=N){
            int odd = 2*i-1;
            j=N;
            while(j>=i){
                System.out.print(odd);
                odd = odd +2;
                j--;
            }
            j = 1;
            int  p =1;
            while(j<=i-1){

                System.out.print(p);
                p= p+2;
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
