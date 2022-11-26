import java.util.*;
public class TriangleNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k=1;
        for(int i=1;i<=N;i++){

            for(int j=1;j<=i;j++){
                System.out.print(k);
            }
            k++;
            System.out.println("");
        }
    }

}
