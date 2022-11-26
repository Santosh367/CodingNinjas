import java.util.*;
public class NthFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n1=0;
        int n2=1;
        int sum=0;
        int count=1;
        for(int i=1;i<N;i++){

            sum= n1+n2;
            count=count+1;
            n1=n2;
            n2=sum;
        }
        if(N==1){
            System.out.println("1");

        }
        else if(count==N){
            System.out.println(sum);
        }
    }
}
