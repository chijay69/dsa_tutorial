import sorting.SelectionSort;

public class SelectionSortApp {

    public static void main(String[] args) {
        int maxSize = 100;
        SelectionSort arr;
        arr = new SelectionSort(100);
//
//        SelectionSort arr;
//        arr = new SelectionSort(100);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(60);
        arr.insert(66);
        arr.insert(33);

        System.out.print("Displaying original array sequence: ");
        System.out.println(arr);

        arr.selectionSort();

        System.out.print("Displaying sorted array sequence: ");
        System.out.println(arr);
    }
}
