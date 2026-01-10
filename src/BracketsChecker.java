import sorting1.Stack;

public class BracketsChecker {
    private String input;

    public BracketsChecker(String in) {
        input = in;
    }

    public void check() {
        int stackSize = input.length();

        Stack theStack = new Stack(stackSize);

        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    theStack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if (!theStack.isEmpty()) {
                        char chx = (char) theStack.pop();
                        if ((ch =='}' && chx != '{') ||
                        (ch == ']' && chx != '[') ||
                                (ch == ')' && chx != '(')) {
                            System.out.println("Error: " + ch + " at " + j);
                        } else {
                            System.out.println("Error: " + ch + " at " + j);
                        }
                        break;
                    }
                default:
                    break;
            }
        }

        if (!theStack.isEmpty()) {
            System.err.println("Missing the right delimiter");
        }
    }
}
