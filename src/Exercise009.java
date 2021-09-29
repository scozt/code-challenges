public class Exercise009 {

    /*
    exercise
    - function takes an int array
    - returns an int array back
    - even ints are not touched
    - odd ints are in ascending order sorted
    */

        public static int[] solution(int[] array) {
            boolean[] isOddArr = new boolean[array.length];
            for(int i = 0; i < array.length; i++) {
                isOddArr[i] = array[i] % 2 == 1;
            }
            for(int i = 0; i < array.length ; i++) {
                for(int j = i+1; j < array.length; j++) {
                    if(isOddArr[i] && isOddArr[j]) {
                        if(array[i] > array[j]) {
                            int tmp = array[i];
                            array[i] = array[j];
                            array[j] = tmp;
                        }
                    }
                }
            }
            return array;
        }
}