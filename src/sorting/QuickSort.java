package sorting;

public class QuickSort {
    public void quickSort(int[] arr, int low, int high){
        if (low<high) {
            int pivot = partition(arr, low, high);
            quickSort(arr,low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int  i = low - 1, j;

        for (j=low; j<=high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(i, j, arr);
            }
        }
        swap(i+1, high, arr);

        return i+1;
    }

    private void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
