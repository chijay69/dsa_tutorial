import java.lang.reflect.Array;

public class ClassDataArray<T> {
    private final T[] a;
    private int nElems;

    public ClassDataArray (Class<T> tClass, int max) {
        a = (T[]) Array.newInstance(tClass, max);
        nElems = 0;
    }

    public T find(String searchName) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (a[j].equals(searchName)) break;
        }
        if (j == nElems) return null; else return a[j];
    }

    public boolean delete (String searchName) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (a[j].equals(searchName)) break;
        }
        if (j == nElems) return false; else {
            for (int k = 0; k < nElems; k++) {
                a[k] = a[k+1];
            }
            nElems--;
            return true;
        }
    }

    public void displayA() {
        for (int j = 0; j < nElems; j++) {
            System.out.println(a[j]);
        }
    }

    public void insert(T other) {
        this.a[nElems] = other;
    }
}
