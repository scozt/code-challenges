public class Exercise003 {

    /*
        exercise
        - function that calculates the trailing zeros in a factorial of a given number n
        - the solution should not contain the calculation of factorial
     */
    public static int solution(int n){
        if (n == 0) return 0;

        int sum = 0;

        for (int k = 1; k <= Math.floor((Math.log(n)/Math.log(5))) ; k++) {
            sum += Math.floor((n/(Math.pow(5,k))));
        }

        return sum;
    }
}
