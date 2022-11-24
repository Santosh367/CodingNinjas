import java.util.*;
public class TermsOfAp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int series=1;
        int N=1;
        int count=0;
        while(count!=x){
            series= (3*N) +2;
            if(series%4!=0){
                System.out.print(series+" ");
                count=count+1;
            }
            N=N+1;
        }
    }
}
