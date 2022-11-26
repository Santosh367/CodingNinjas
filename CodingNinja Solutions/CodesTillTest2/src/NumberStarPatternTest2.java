import java.util.*;
public class NumberStarPatternTest2 {
    public static void main(String[] args) {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int temp=N;
        for(int i=1;i<=N;i++){
            for(int j =N;j>=i;j--){
                System.out.print(N-j+1);
            }
            if(i>1){
                for(int k=1;k<=2*(i-1);k++){
                    System.out.print("*");
                }
            }
            for(int m=temp;m>=1;m--){
                System.out.print(m);
            }
            temp=temp-1;
            System.out.println("");
        }

    }
}
