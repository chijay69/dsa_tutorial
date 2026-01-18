package sorting;

import java.util.Arrays;

public class SelectionSort {
    private double[] a;
    private int nElems;

    public SelectionSort(int max) {
        a = new double[max];
        nElems = 0;
    }

    public void insert(double value) {
        a[nElems] = value;
        nElems++;
    }

    public void selectionSort() {
        int out, in, min;
        for (out = nElems - 1; out > 1; out--){
            min = out;
            for (in = 0; in < out; in++) {
                if (a[in] < a[min]) {
                    min = in;
                }
                swap(out, min);
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
        return "SelectionSort{" +
                "a=" + Arrays.toString(a) +
                ", nElems=" + nElems +
                '}';
    }
}
