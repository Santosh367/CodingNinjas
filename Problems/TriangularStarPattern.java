import java.util.*;
public class TriangularStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=N;i>=1;i--){
            for(int j=i;j<=N;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
