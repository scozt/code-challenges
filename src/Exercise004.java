public class Exercise004 {

    /*
        exercise
        - function that converts dash delimited word into camel casing
        - the first letter within the output should be capitalized only
          if the original word was capitalized
     */

    static String solution(String s){

        if(s != null && (s.contains("_") || s.contains("-")) ) {
            String[] words;

            if(s.contains("_")) {
                words = s.split("_");
            } else {
                words = s.split("-");
            }

            StringBuilder camelCase = new StringBuilder();
            for(int i = 0; i < words.length; i++) {

                if(i == 0) {
                    camelCase.append(words[i]);
                } else {
                    String concatenate = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
                    camelCase.append(concatenate);
                }
            }
            return camelCase.toString();
        }

        return s;
    }
}
