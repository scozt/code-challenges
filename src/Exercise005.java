import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercise005 {

        /*
        exercise
        - function that checks if a given string is a pangram
        - a pangram is a sentence that contains every single letter of the alphabet at least once
          - the case is irrelevant
          - return True if it is
          - return False if not
          - ignore numbers and also ignore punctuation
     */

    public boolean solution(String sentence) {
        Set<Character> charSet = sentence.toLowerCase().replaceAll("[^a-z]", "")
                .chars().mapToObj(i  -> ((char) i))
                .collect(Collectors.toCollection(HashSet::new));

        return  charSet.size() == 26;
    }
}
