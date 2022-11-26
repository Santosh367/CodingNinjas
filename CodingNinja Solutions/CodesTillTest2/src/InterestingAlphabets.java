import java.util.*;
public class InterestingAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char ch = (char)(N+64);
        for(int i=1;i<=N;i++){
            char k = ch;
            for(int j=1;j<=i;j++){
                System.out.print(k);
                k=(char)(k+1);
            }
            ch=(char)(ch-1);
            System.out.println("");
        }
    }
}
