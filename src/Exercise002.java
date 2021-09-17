public class Exercise002 {

    /*
        exercise
        - function that takes a string with space separated words as input
        - returns each word encrypted as one string back
            - convert the first letter to its ASCII code
            - switch last letter with the second one
        - there are no special characters in the input
     */

    public static String encryptThis(String text) {
        if (text.length() == 0) return "";
        final String SPACE = " ";

        StringBuilder encryptedText = new StringBuilder();

        for (String s : text.split(SPACE)) {
            int ascii = s.charAt(0);
            encryptedText.append(ascii);

            if (s.length() == 1) {
                encryptedText.append(SPACE);
            } else if (s.length() == 2) {
                encryptedText
                        .append(s.charAt(1))
                        .append(SPACE);
            }
            else {
                char secondChar = s.charAt(1);
                encryptedText
                        .append(s.charAt(s.length() - 1))
                        .append(s.subSequence(2, s.length() - 1))
                        .append(secondChar)
                        .append(SPACE);
            }
        }
        return  encryptedText.toString().trim();
    }
}
