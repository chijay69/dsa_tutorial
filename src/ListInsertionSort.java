import static java.lang.Math.random;

public class ListInsertionSort {
    public static void main(String[] args) {
        int size = 10;

        Linkk[] linkArray = new Linkk[size];

        for (int j=0; j<size; j++) {
            int n = (int) (random() * 99);
            Linkk newLink = new Linkk(n);
            linkArray[j] = newLink;
        }

        System.out.println("Unsorted array: ");
        for (int j=0; j<size; j++) {
            System.out.println(linkArray[j].dData + " ");
        }
        System.out.println();

        SortedList sortedList = new SortedList(linkArray);

        for (int j=0; j<size; j++) {
            linkArray[j] = sortedList.remove();
        }

        System.out.println("Sorted Array: ");
        for (int j = 0; j<size; j++) {
            System.out.println(linkArray[j].dData + " ");
        }
        System.out.println();
    }
}
