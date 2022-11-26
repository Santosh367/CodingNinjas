import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long ans=0;
        long place=1;
        long num=0;
        while(N>0){
            num=N%2;
            ans=ans+num*place;
            place=place*10;
            N=N/2;
        }
        System.out.println(ans);
    }
}
