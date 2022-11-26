import java.util.*;
public class ReverseNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i=1;

        while(i<=N){
            int j=i;
            int p=1;
            while(j>0){
                System.out.print(j);
                j=j-1;
            }
            System.out.println("");
            i=i+1;

        }
    }
}
