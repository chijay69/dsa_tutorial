// BubbleSort.java
// To demonstrate bubble sort

package sorting;

import java.util.Arrays;

public class BubbleSort {
    private double[] a; // define an array 'a'. Do not assign value yet.
    private int nElems; // define the size of elements in the array.

    public BubbleSort(int max) { // create a default constructor and assign the value max as the array size for array 'a'.
        a = new double[max];
        nElems = 0; // set number of elements in array to 0, as no element has been inserted into the array yet.
    }

    public void insert(double value) {
        a[nElems] = value;  // sets the argument value to the position of nElems,
        nElems++;   // then increment nElems.
    }

    public void bubbleSort() {
        int out, in; // declare variables out and in for lopping through the array.
        for (out = nElems - 1; out > 1; out--) {    // outer loop (backwards)
            for (in = 0; in < out; in++) {  // inner loop (forwards)
                if (a[in] > a[in + 1]) {    //check if the value in the lower index of array a is greater the tht in the upper index,
                    swap(in, in + 1);   // swap the order
                }
            }
        }
    }

    private void swap(int one, int two) {
        double temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    @Override
    public String toString() {
        return "BubbleSort{" +
                "a=" + Arrays.toString(a) +
                ", nElems=" + nElems +
                '}';
    }

}
