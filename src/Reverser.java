import sorting.Stack;

public class Reverser {
    private final String input;
    private String output;

    public Reverser(String in) {
        input = in;
        output = "";
    }

    public String doRev(){
        int stackSize = input.length();
        Stack theStack = new Stack(stackSize);

        for (int j = 0; j < input.length(); j++) {
            theStack.push(input.charAt(j));
        }

        while (!theStack.isEmpty()) {
            char ch = (char) theStack.pop();
            output= output.concat(String.valueOf(ch));
        }
        return output;
    }
}
