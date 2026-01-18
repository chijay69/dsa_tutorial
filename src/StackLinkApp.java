public class StackLinkApp {
    public static void main(String[] args) {
        StackLink theStack = new StackLink();

        theStack.push(20);
        theStack.push(40);
        theStack.push(60);

        theStack.displayStack();

        System.out.print("The size of the stack is: ");
        System.out.println(theStack.size());

        theStack.pop();
        theStack.pop();

        theStack.displayStack();

        System.out.print("The size of the stack is: ");
        System.out.println(theStack.size());

        theStack.displayStack();
    }
}
