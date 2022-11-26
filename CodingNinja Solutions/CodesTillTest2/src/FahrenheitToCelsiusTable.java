import java.util.*;
public class FahrenheitToCelsiusTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();
        int W = sc.nextInt();
        int temp=S;
        while(temp<E){
            int C=(S-32)*5/9;
            System.out.println(S+" "+C);
            S=S+W;
            temp=temp+W;

        }
    }
}
