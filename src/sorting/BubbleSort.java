package sorting;

import java.util.Arrays;

public class BubbleSort {
    private double[] a;
    int nElems;

    public BubbleSort(int max) {
        a = new double[max];
    }

    public void insert(double value) {
        a[nElems] = value;
        nElems++;
    }
    /*
    Loop through the array of nElems-1 to go through the entire array once.
    Write an inner loop for each item in the outer loop to
    compare the value at index i and index i+1.
    if the value at current index i is greater than that of index i+1,
    swap the values.
     */
    public void bubbleSort() {
        int i, j;
        for (i = nElems - 1; i > 1; i--){
            for (j = 0; j < i; j++) {
                if (a[j] > a[j+1]) {
                    swap(j, j+1);
                }
            }
        }
    }

    private void swap(int one, int two) {
        double temp;
        temp =  this.a[one];
        this.a[one] = this.a[two];
        this.a[two] = temp;
    }

    @Override
    public String toString() {
        return "BubbleSort{" +
                "a=" + Arrays.toString(a) +
                ", nElems=" + nElems +
                '}';
    }
}
