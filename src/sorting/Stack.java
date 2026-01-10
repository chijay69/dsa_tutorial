package sorting;

public class Stack {
    private int maxSize;
    private double[] stackArray;
    private int top;

    public Stack(int s) {
        maxSize = s;
        stackArray = new double[maxSize];
        top = -1;
    }

    public void push(double j) {
        stackArray[++top] = j;
    }

    public double pop() {
        return stackArray[top--];
    }

    public double peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize -1);
    }
}
