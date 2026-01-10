import java.util.Arrays;

public class Infix {
    // Converts infix arithmetic operations to postfix
    static class Stackx {
        private int maxSize;
        private char[] stackArray;
        private int top;

        public Stackx(int s) {
            maxSize = s;
            stackArray = new char[maxSize];
            top = -1;
        }

        public void push(char j) {
            stackArray[++top] = j;
        }

        public char pop() {
            return stackArray[top--];
        }

        public char peek() {
            return stackArray[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == maxSize -1;
        }

        public int size() {
            return  top+1;   
        }

        public char peekN(int n) {
            return stackArray[n];
        }

        @Override
        public String toString() {
            return "Stackx{" +
                    "maxSize=" + maxSize +
                    ", stackArray=" + Arrays.toString(stackArray) +
                    ", top=" + top +
                    '}';
        }

        public void display(String s) {
            System.out.println(s);
            System.out.println("stack (bottom-->top):  ");
            for (int j = 0; j < size(); j++) {
                System.out.println(peekN(j));
                System.out.println(" ");
            }
            System.out.println();
        }
    }

    public static class IntoPost {

        private Stackx theStack;
        private String input;
        private String output = "";

        public IntoPost(String in) {
            input = in;
            int stackSize = in.length();
            theStack = new Stackx(stackSize);
        }

        public String doTrans() {
            for (int j = 0; j < input.length(); j++) {
                char ch = input.charAt(j);
                theStack.display("For " + ch + " ");
                switch (ch) {
                    case '+':
                    case '-':
                        gotOper(ch, 1);
                        break;
                    case '*':
                    case '/':
                        gotOper(ch, 2);
                        break;
                    case '(':
                        theStack.push(ch);
                        break;
                    case ')':
                        gotParen(ch);
                        break;
                    default:
                        output = output + ch;
                        break;
                }
            }
            while (!theStack.isEmpty()) {
                theStack.display("while ");
                output = output + theStack.pop();
            }
            theStack.display("End ");
            return output;
        }

        private void gotParen(char ch) {
            while (!theStack.isEmpty()){
                char chx = theStack.pop();
                if( chx == '(') {
                    break;
                } else {
                    output = output + chx;
                }
            }
        }

        private void gotOper(char opThis, int prec1) {
            while (!theStack.isEmpty()) {
                char opTop = theStack.pop();
                if(opTop == '(') {
                    theStack.push(opTop);
                    break;
                }
                else {
                    int prec2;
                    if (opTop == '+' || opTop=='-'){
                        prec2 = 1;
                    } else {
                        prec2 = 2;
                    }
                    if (prec2 < prec1) {
                        theStack.push(opTop);
                        break;
                    }
                    else {
                        output = output + opTop;
                    }
                }
                theStack.push(opThis);
            }
        }
    }
}
