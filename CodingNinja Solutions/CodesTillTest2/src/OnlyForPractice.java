import java.util.*;
public class OnlyForPractice {
    static int deleteFromStart(int num, int n)
    {

        // Get the number of digits
        int d = (int)Math.log10(num) + 1;

        // Declare a variable
        // to form the reverse resultant number
        int rev_new_num = 0;

        // Loop with the number
        for (int i = 0; num != 0; i++) {

            int digit = num % 10;
            num = num / 10;

            if (i == (d - n)) {
                continue;
            }
            else {

                rev_new_num = (rev_new_num * 10) + digit;
            }
        }

        // Declare a variable
        // to form the resultant number
        int new_num = 0;

        // Loop with the number
        for (int i = 0; rev_new_num != 0; i++) {

            new_num = (new_num * 10)
                    + (rev_new_num % 10);
            rev_new_num = rev_new_num / 10;
        }

        // Return the resultant number
        return new_num;
    }



    public static void main(String[] agrs)
    {
        int a=5438;
        a=Integer.parseInt(Integer.toString(a).substring(1));

        System.out.println(a);







































































    }
}
