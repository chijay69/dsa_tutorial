import java.util.Arrays;

public class Queue {
    private int[] queueArray;
    private int nElems;
    private int maxSize;
    private int front;
    private int rear;
    
    
    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nElems = 0;
    }
    
    public void insert(int value) {
        if(rear == maxSize-1) rear = -1;
        queueArray[++rear] = value;
        nElems++;
    }
    
    public int remove() {
        if (front == maxSize) front = 0;
        int temp = queueArray[front++];
        nElems--;
        return temp;
    }
    
    public boolean isFull() {
        return nElems == maxSize;
    }
    
    public boolean isEmpty() {
        return nElems == 0;
    }
    
    public int peek() {
        return queueArray[front];
    }

    public int size(){
        return nElems;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "queueArray=" + Arrays.toString(queueArray) +
                ", nElems=" + nElems +
                ", maxSize=" + maxSize +
                ", front=" + front +
                ", rear=" + rear +
                '}';
    }
}
