import sorting.QuickSort;

public class QuickSortApp {
    public static void main(String[] args) {
        int[] array = {5,3,6,1,4,2};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(array, 0, array.length-1);

        for (var val: array) {
            System.out.print(val + ", ");
        }
    }
}
