public class Exercise012 {

     /*
    exercise
    - context
        - the roads of a city are laid out in a perfect grid
        - you want to walk exactly for ten minutes from and
          to your starting point
        - the (compass) directions are represented as single letter
          in a char array
            - n = north
            - s = south
            - w = west
            - e = east
        - you always walk only single block for each letter
        - it takes one minute to traverse a city block
        - these letters in a char array representing directions to walk

    - write a function that takes an array of chars
    - it returns true if the walk takes exactly 10 minutes
    - in any other case false
    - a valid array is always provided
    - the function never gets an empty array, because that is
      standing still
    */

    public static boolean solution(char[] walk) {
        if(walk.length != 10) return false;

        int x = 0, y = 0;
        for(char direction : walk) {

            switch(direction) {
                case 'n': y++; break;
                case 's': y--; break;
                case 'w': x++; break;
                case 'e': x--; break;
            }
        }
        return 0 == x && 0 == y;

    }
}
