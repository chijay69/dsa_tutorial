import java.util.Arrays;

public class Queue1 {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;

    public Queue1(int s){
        maxSize = s;
        queueArray = new int[maxSize];
        rear = -1;
        front = 0;

    }

    public void insert(int value) {
        if(rear == maxSize-1) {
            rear = -1;
        }
        queueArray[++rear] = value;
    }

    public int remove() {
        int temp = queueArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        return temp;
    }

    public int peek() {
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (rear + 1 == front || (front + maxSize - 1 == rear));
    }

    public boolean isFull() {
        return (rear + 2 == front || (front + maxSize - 2 == rear));
    }

    public int size() {
        if (rear >= front) {
            return rear - front + 1;
        } else {
            return (maxSize - front) + (rear + 1);
        }
    }

    @Override
    public String toString() {
        return "Queue{" +
                "queueArray=" + Arrays.toString(queueArray) +
                ", maxSize=" + maxSize +
                ", front=" + front +
                ", rear=" + rear +
                '}';
    }
}
