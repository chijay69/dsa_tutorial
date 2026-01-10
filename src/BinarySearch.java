public class BinarySearch {
    public BinarySearch () {
        System.out.println("Constructed binary search object.");
    }

    public int find(double searchKey, int[] array){
        int nElems = array.length;
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int current;

        while (true) {
            current = (lowerBound + upperBound) / 2;
            if (array[current] == searchKey) {
                return current;
            }
            else if (lowerBound > upperBound) {
                return nElems;
            } else {
                if (array[current] < searchKey) {
                    lowerBound = current+1;
                } else {
                    upperBound = current-1;
                }
            }
        }
    }
}
