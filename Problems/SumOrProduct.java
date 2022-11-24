import java.util.*;
public class SumOrProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int sum=0;
        int product=1;
        if(C==1){
            for(int i=1;i<=N;i++){
                sum=sum+i;
            }
            System.out.println(sum);
        }
        else if(C==2){
            for(int i=1;i<=N;i++){
                product=product*i;
            }
            System.out.println(product);
        }
        else{
            System.out.println("-1");
        }
    }
}
