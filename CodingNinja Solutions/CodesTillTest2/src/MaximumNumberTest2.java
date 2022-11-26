import java.util.*;
public class MaximumNumberTest2 {
    public static int max_number(int n){

        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int m = 0;
        int i=1;
        while(i<n){
            m = Math.max(m, n % i + n / (i * 10) * i);
            i=i*10;
        }
        return m;






    }
}




//    We are given a 4 digit number using digits 1 to 9. What is the maximum 3 digit number that we can make by removing one digit from the given integer.
//        Input Format :
//        A 4 digit number
//        Output Format :
//        A 3 digit number
//        Sample Input :
//        5438
//        Sample Output :
//        548
//        Explanation :
//        1. If we remove 5, the new number is 438.
//        2. If we remove 4, the new number is 538.
//        3. If we remove 3, the new number is 548.
//        4. If we remove 8, the new number is 543.
//        Out of the 4 cases removing 3 gives us the maximum 3 digit number i.e 548
