import java.util.*;
public class ParallelogramPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S=N;
        int m=N;
        for(int i=1;i<=N;i++){

            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=m;k++){
                System.out.print("*");
            }

            S=S-1;
            System.out.println("");

        }
    }
}
