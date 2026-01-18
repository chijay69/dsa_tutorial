import java.util.Arrays;

public class Stack implements AbstractStackClass<Array_ds<Double>> {

    private int maxSize;
    private double[] stackArray;
    private int top;



    public Stack(int s) {
        maxSize = s;
        stackArray = new double[maxSize];
        top = -1;
    }

    @Override
    public void push(double j) {
        stackArray[++top] = j;
    }

    @Override
    public double pop() {
        return stackArray[top--];
    }

    public double peek () {
        return stackArray[top];
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize -1);
    }

    @Override
    public int size() {
        return stackArray.length - 1;
    }

    @Override
    public void displayStack() {
        System.out.println(Arrays.toString(stackArray));
    }

    @Override
    public String toString() {
        return "Stack{" +
                "maxSize=" + maxSize +
                ", stackArray=" + Arrays.toString(stackArray) +
                ", top=" + top +
                '}';
    }
}

