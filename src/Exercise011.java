import java.util.HashMap;
import java.util.Map;

public class Exercise011 {

    /*
    exercise
    - function takes an array of string
    - each string is an assembler instruction
        - mov x y - copies y (either a constant value or the content of a register) into register x
        - inc x   - increases the content of the register x by one
        - dec x   - decreases the content of the register x by one
        - jnz x y - jumps to an instruction y steps away (positive means forward, negative means backward, y can be
                    a register or a constant), but only if x (a constant or a register) is not zero
    - returns the state of the register
    - register names are only letters
    - constants are always positive or negative ints
    - every inc, dec, jnz on a register will always be preceded by a mov on the register first
    - the program ends when there are no more instructions to execute
    - jnz instruction moves relative to itself
        - negativ offset jumps to left/up
        - positiv offset jumps to right/down
    */

    public static Map<String, Integer> solution(String[] program){

        Map<String, Integer> register = new HashMap<>();

        for (int index = 0; index < program.length; index++) {

            String[] programInstruction = program[index].split(" ");

            switch (programInstruction[0]) {
                case "mov":
                    if (Character.isLetter(programInstruction[2].charAt(0))) {
                        register.put(programInstruction[1], register.get(programInstruction[2]));
                    } else {
                        register.put(programInstruction[1], Integer.parseInt(programInstruction[2]));
                    }
                    break;
                case "dec":  register.put(programInstruction[1], register.get(programInstruction[1]) - 1  );
                    break;
                case "inc": register.put(programInstruction[1], register.get(programInstruction[1]) + 1 );
                    break;
                case "jnz": if (getConstOrRegisterValue(register, programInstruction[1]) != 0) index += Integer.parseInt(programInstruction[2]) - 1;
                    break;
            }
        }
        return register;
    }

    private static int getConstOrRegisterValue(final Map<String,Integer> regMap, final String s) {
        try { return Integer.parseInt(s); } catch (NumberFormatException ex) { return regMap.get(s); }
    }
}
