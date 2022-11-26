import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int place =1;
        int ans=0;
        int num=0;
        int sum=0;

        for(int i=1;i<=100;i++){
            num=N%10;
            ans=num*place;
            sum=sum+ans;
            place=place*2;
            N=N/10;
        }
        System.out.println(sum);
    }
}
