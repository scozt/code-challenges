public class Exercise007 {

    /*
    exercise
    - function that takes an ordered int array as input
    - returns a string;  comma seperated list of either
        - individual ints or
        - rang of ints: it includes alls ints in the intervall including both endpoints
            - use dash "-"
            - range definition: when ist spans at least 3 ints
    - returns false in any other case
    - (all triangles must have surface greater than 0 to be accepted)
    */

    public static String solution(int[] arr) {
        boolean isFirstInt = true;
        String result = "";
        for (int index = 0; index < arr.length - 1; index++) {

            boolean isDifferenceMoreThan1 = (arr[index] + 1 != arr[index + 1]);
            result += isDifferenceMoreThan1 ? arr[index] + "," : isFirstInt ? arr[index] + "x" : "x";
            isFirstInt = isDifferenceMoreThan1;
        }
        return result.replaceAll("([x]{2,})","-").replace("x", ",") + arr[arr.length - 1];
    }
}
