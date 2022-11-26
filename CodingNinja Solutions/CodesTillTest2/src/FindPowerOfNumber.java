import java.util.*;
public class FindPowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*x;
        }
        System.out.println(ans);
    }
}
