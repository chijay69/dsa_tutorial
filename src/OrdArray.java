// orderedArray.java
public class OrdArray {
    private double[] a; // reference to array a
    private int nElems;
    // -----------------------------------
    // constructor
    public OrdArray(int max){
        a = new double[max];    // create an array
        nElems = 0;
    }
    // -------------------------------------
    public int size () {
        return nElems;
    }
    // ---------------------------------------
    public int find(double searchKey) {
        int lowerBound = 0;
        int upperBound = nElems;
        int currentIndex;

        while (true) {
            currentIndex = (lowerBound + upperBound) / 2;
            if(a[currentIndex] == searchKey) {
                return currentIndex;    // found it
            }
            if (lowerBound > upperBound) {
                return nElems;
            }
            else {
                if(a[currentIndex] < searchKey) {
                    lowerBound = currentIndex + 1;
                } else {
                    upperBound = currentIndex -1;
                }
            }
        }
    }

    public boolean insert(double value) {
        int j = find(value);
        if (j == nElems) {
            return false;
        } else {
            for (int k=j; k<nElems; k++) {
                a[k] = a[k+1];
            }
            nElems --;
            return true;
        }
    }

    public void display() {
        for (int j =0; j<nElems; j++) {
            System.out.println(a[j] + " ");
        }
        System.out.println("");
    }

    public boolean delete(double value) {
        int j = find(value);
        if (j==nElems) {
            return false;
        }
        else {
            for (int k=j; k<nElems; k++){
                a[k] = a[k+1];
            }
            nElems --;
            return true;
        }
    }
}
