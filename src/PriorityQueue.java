public class PriorityQueue {
    // Array in sorted order from max at 0 to min at maxSize -1.
    private int maxSize;
    private double[] queArray;
    private int nItems;

    public PriorityQueue(int s){
        maxSize = s;
        queArray = new double[maxSize];
        nItems = 0;
    }

    public void insert(double item) {
        int j;
        if (nItems == 0) { // checks if the array is empty,
            queArray[nItems++] = item; // if empty, adds item.
        } else {
            for (j = nItems - 1; j>=0; j--) { // Else, loop through items in array
                if (item > queArray[j]) { // if the item in current index is lesser than inserted item
                    queArray[j+1] = queArray[j]; // move item in current index closer to maxSize - 1 i.e. the maximum index.
                } else {
                    break; // Else, break
                }
            }
            queArray[j+1] = item; // After moving all lesser items higher, insert your item.
            nItems++; // increment number of items in the array
        }
    }

    public double remove() {
        // Remove the minimum item
        return queArray[--nItems];
    }

    public double peekMin() {
        // Peek at the minimum item
        return queArray[nItems - 1];
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }
}
