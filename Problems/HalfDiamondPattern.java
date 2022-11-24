import java.util.*;
public class HalfDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i,j;
        System.out.println("*");
        for(i=1;i<=N;i++){
            System.out.print("*");
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            for(j=i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println("*");
        }


        for(i=N-1;i>=1;i--){
            System.out.print("*");
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            for(j=i-1; j>=1; j--){
                System.out.print(j);
            }
            System.out.println("*");
        }
        System.out.print("*");

    }
}
