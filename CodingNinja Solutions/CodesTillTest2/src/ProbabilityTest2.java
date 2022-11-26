public class ProbabilityTest2 {
    public static double factorial(double number) {
        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int probability(int n,int x){

        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        double N_s, N_e1, N_e2;
        int P_e;
        N_s = factorial(8.0) / (factorial(n * 1.0) * factorial(8.0 - n));
        N_e1 = factorial(4.0) / (factorial(x * 1.0) * factorial(4.0 - x));
        N_e2 = factorial(4.0) / (factorial(((n - x) * 1.0)) * factorial((4.0 - (n - x))));
        P_e = (int) (((N_e1 * N_e2) / N_s) * 100);
        return P_e;


    }


}




//
//    An urn contains 8 balls : 4 red , 2 blue and 2 green. Now n balls are drawn out of the urn. Calculate the probability that out of n drawn balls exactly x balls are red.
//        Find your answer multiplied by 100 and return the integer part.
//        All required values for computation will be in integer range.
//        x is always less than equal to 4 and x is always less than equal to n.
//        Input format :
//        Two spaced integers : n and x
//        Output format :
//        Integer part of (Probability * 100).
//        Sample Input 1 :
//        3 1
//        Sample Output 1:
//        42
