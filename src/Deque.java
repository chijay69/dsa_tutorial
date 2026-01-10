import java.util.Arrays;

public class Deque {
    //Todo: implement a queue with
    // 1. insertLeft,
    // 2. insertRight,
    // 3. removeLeft,
    // 4. removeRight.

    private int maxSize;
    private int nElems;
    private int[] dequeueArray;
    private int front;
    private int rear;

    public Deque (int s) {
        maxSize = s;
        dequeueArray = new int[maxSize];
        nElems = 0;
        front = 0;
        rear = -1;
    }

    /*
    Insert elements at the right end of a queue.
    As in a normal queue FIFO.
    checks if the rear is the same as the maxSize - 1, as this indicates
    that the container (array) is full, then it assigns the default full value of -1.
    If nt full it pushes the rear forward by incrementing rear i.e. rear++
    and the number of elements present i.e. nElems.

    Args: an integer value.
    Returns: an integer value.
     */
    public void insertRight (int value) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        dequeueArray[++rear] = value;
        nElems++;
    }

    /*
    As in a normal queue insert operation, the insertion process is reversed.

     */
    public void insertLeft(int value) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        dequeueArray[++front] = value;
        nElems ++;
    }

    /*
    This peekMin operation is similar to that of the regular queue.
    Checks that container (array) is not empty i.e. contains values.
    if it does not, assign 0 to the front variable.
    If it does, increment the front variable and retrieve the value at that index and store as temp,
    decrement nElems.
    Return temp variable.

    Args: None.
    Returns: an int. The first value inserted that is still available in the container.
     */
    public int removeLeft() {
        if (front == maxSize -1) front = 0;
        int temp = dequeueArray[front++];
        nElems--;
        return temp;
    }

    public int removeRight() {
        if (front == maxSize-1) front = 0;
        int temp = dequeueArray[rear--];
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
        return dequeueArray[front];
    }

    @Override
    public String toString() {
        return "Deque{" +
                "maxSize=" + maxSize +
                ", nElems=" + nElems +
                ", dequeueArray=" + Arrays.toString(dequeueArray) +
                ", front=" + front +
                ", rear=" + rear +
                '}';
    }
}
