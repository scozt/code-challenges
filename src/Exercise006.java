import java.util.Arrays;

public class Exercise006 {
    /*
    exercise
    - function that takes 3 integers as input
    - returns true if a triangle can be buiilt with the sides of given length
    - returns false in any other case
    - (all triangles must have surface greater than 0 to be accepted)
    */
    public static boolean solution(int a, int b, int c){
        if (a == 0 || b == 0 || c == 0) return false;

        int[] sides = {a, b, c};
        Arrays.sort(sides);

        return sides[0] + sides[1] > sides[2];
    }
}
