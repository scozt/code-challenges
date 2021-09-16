public class Exercise001 {

    /*
        exercise
        - function that takes an integer as input
        - returns the number of bits that are equal to 1
        - in the binary representation of that integer
        - input is always non-negative
     */
    public static int solution(int n){
        return Integer.toBinaryString(n).replace("0","").length();
    }
}
