import java.util.List;
import java.util.ArrayList;

public class Exercise013 {
    /*
    exercise
    - function takes two int values that represents a rectangle
        - the two values are always different
    - returns a list of squares that fits into the given rectangle
     */


    public static List<Integer> solution(int lng, int wdth) {
        if(lng==wdth) return null;

        List<Integer> result = new ArrayList();

        while(lng > 0 && wdth > 0) {
            if (lng > wdth) {
                lng -= wdth;
                result.add(wdth);
            } else {
                wdth -= lng;
                result.add(lng);
            }
        }

        return result;
    }
}
