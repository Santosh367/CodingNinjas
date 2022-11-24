import java.util.*;
public class TotalSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        char grade = sc.next().charAt(0);
        int allow=0;
        double hra = 0.2*basic;
        double da = 0.5*basic;
        double pf = 0.11*basic;
        if(grade=='A'){
            allow=1700;
        }
        else if(grade=='B'){
            allow=1500;
        }
        else{
            allow=1300;
        }
        double totalSalary = basic+hra+da+allow-pf;
        System.out.println(Math.round(totalSalary));
    }
}
