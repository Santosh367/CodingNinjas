import java.util.*;
public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int evenSum = 0;
        int oddSum =0;
        while(N>0){
            int D=N%10;
            N=N/10;
            if(D%2==0){
                evenSum+=D;
            }
            else{
                oddSum+=D;
            }

        }
        System.out.println(evenSum+" "+oddSum);
    }

}
