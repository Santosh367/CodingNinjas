import java.util.*;
public class CheckNumberSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int count=0;
        boolean isDec=true;
        int previous=sc.nextInt();
        while(i<n){
            int current = sc.nextInt();

            if(current==previous){
                System.out.println("false");
                return;
            }
            else if(current>previous){
                isDec=false;
                count=count+1;

            }
            else{
                if(isDec==false){
                    System.out.println("false");
                    return;
                }
                else{
                    count=count+1;


                }

            }

            i=i+1;
            previous=current;
        }
        if(count>0){
            System.out.println("true");
        }

    }
}
