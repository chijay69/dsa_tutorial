import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_ds<T> {

    private T[] newArray;

    public Array_ds(Class<T> clazz, int size){
        this.newArray = (T[]) Array.newInstance(clazz, size);
    }

    // copy constructor
    public Array_ds(T[] other) {
        this.newArray = other;
    }

    public void setNewArray(T[] newArray) {
        this.newArray = newArray;
    }

    public T get(int index) {
        return newArray[index];
    }

    public void add(T value) {
        int arrLength = newArray.length;
        newArray[arrLength-1] = value;
    }

    public void set(int index, T value) {
        if (index >= newArray.length) {
            throw new ArrayIndexOutOfBoundsException("You are attempting to access an index greater than the size of the array.");
        }
        newArray[index] = value;
    }

    @Override
    public String toString() {
        return "Array_ds{" +
                "newArray=" + Arrays.toString(newArray) +
                '}';
    }

}
