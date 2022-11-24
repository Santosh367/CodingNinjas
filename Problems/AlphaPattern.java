import java.util.*;
public class AlphaPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k=1;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                char jchar = (char)('A'+k-1);
                System.out.print(jchar);
            }
            k=k+1;
            System.out.println("");
        }
    }
}
