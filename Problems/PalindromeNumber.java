import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int temp=N;
        int rem=0;
        int rev=0;
        while(N>0){
            rem=N%10;
            rev =rev*10+rem;
            N=N/10;
        }
        if(rev==temp){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
