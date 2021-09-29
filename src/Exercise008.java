import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Exercise008 {

    /*
    exercise
    - function that takes a string consisting of ints as input (PIN)
    - returns all adjacent possible digits of that string
        - adjacent means in this context: next digit that is horizontally or vertically,
          but not diagonally
          - e.g. adjacent of 6 are 3,5,9
            ┌───┬───┬───┐
            │ 1 │ 2 │ 3 │
            ├───┼───┼───┤
            │ 4 │ 5 │ 6 │
            ├───┼───┼───┤
            │ 7 │ 8 │ 9 │
            └───┼───┼───┘
                │ 0 │
                └───┘
     */

    public static List<String> solution(String observed) {
        List<String> resultList = new ArrayList<>();
        if (observed != null && !observed.isEmpty()) {

            HashMap<Character, List<String>> neighboursMapping = new HashMap<>();
            neighboursMapping.put('0', Arrays.asList("0", "8"));
            neighboursMapping.put('1', Arrays.asList("1", "2", "4"));
            neighboursMapping.put('2', Arrays.asList("1", "2", "3", "5"));
            neighboursMapping.put('3', Arrays.asList("2", "3", "6"));
            neighboursMapping.put('4', Arrays.asList("1", "4", "5", "7"));
            neighboursMapping.put('5', Arrays.asList("2", "4", "5", "6", "8"));
            neighboursMapping.put('6', Arrays.asList("3", "5", "6", "9"));
            neighboursMapping.put('7', Arrays.asList("4", "7", "8"));
            neighboursMapping.put('8', Arrays.asList("0", "5", "7", "8", "9"));
            neighboursMapping.put('9', Arrays.asList("6", "8", "9"));


            resultList.addAll(neighboursMapping.get(observed.charAt(0)));
            for (int i = 1; i < observed.length(); i++) {
                List<String> temporaryList = new ArrayList<>();
                for (String s1 : resultList) {
                    for (String s2 : neighboursMapping.get(observed.charAt(i))) {
                        temporaryList.add(s1 + s2);
                    }
                }
                resultList = temporaryList;
            }
        }
        return resultList;
    }
}
