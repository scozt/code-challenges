public class Exercise010 {

    /*
    exercise
    - function takes a a string of words
    - returns the length of the shortest word(s)
    - string will never be empty
    - not need to account for different data types
    */

    public static int solution(String s) {
        int lengthOfShortestWord = Integer.MAX_VALUE;
        for(String word : s.split(" ")) {
            if(word.length() < lengthOfShortestWord) {
                lengthOfShortestWord = word.length();
            }
        }
        return lengthOfShortestWord;
    }
}
