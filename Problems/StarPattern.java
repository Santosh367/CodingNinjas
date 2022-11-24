import java.util.*;
public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int s=N;
        int m=1;
        for(int i=1;i<=N;i++){

            for(int j=1;j<s;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=m;k++){
                System.out.print("*");
            }
            m=m+2;

            s=s-1;
            System.out.println("");

        }
    }
}
