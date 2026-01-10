package sorting1;

public class Stack {
    private double[] stackArray;
    private int maxSize;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new double[maxSize];
        top = -1;
    }

    public void push (double value) {
        stackArray[++top] = value;
    }

    public double peek () {
        return stackArray[top];
    }

    public double pop() {
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize-1);
    }

}
