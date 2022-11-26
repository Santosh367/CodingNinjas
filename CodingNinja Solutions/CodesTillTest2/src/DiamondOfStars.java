import java.util.*;
public class DiamondOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int i=1;
        int n1=(N+1)/2;
        while(i<=n1)
        {
            int space=1;
            while(space<=n1-i)
            {
                System.out.print(" ");
                space++;
            }
            int k=1;
            while(k<=(2*i-1))
            {
                System.out.print("*");
                k++;
            }
            i++;
            System.out.println();
        }
        int n2=N/2;
        i=n2;
        while(i<=n2 && i!=0)
        {
            int space=1;
            while (space<=n2-i+1)
            {
                System.out.print(" ");
                space++;
            }
            int j=1;
            while(j<=(2*i-1)){
                System.out.print("*");
                j++;
            }
            i--;
            System.out.println();
        }

    }
}
