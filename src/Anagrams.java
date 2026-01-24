import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anagrams {

    private static int size;
    private static int count;
    private static char[] arrChar = new char[100];
    public static void doAnagrams(int newSize) {
        if (newSize == 1) {
            return;
        }
        for (int j = 0; j < newSize; j++) {
            doAnagrams(newSize - 1);
            if (newSize == 2) {
                displayWord();
            }
            rotate(newSize);
        }
    }

    private static void displayWord() {
        if (count < 99) {
            System.out.print(" ");
        }
        if (count < 9) {
            System.out.print(" ");
        }
        System.out.print(++count + " ");
        for (int j =0; j<size; j++) {
            System.out.print(arrChar[j]);
        }
        System.out.println("   ");
        System.out.flush();
        if (count%6 == 0) {
            System.out.print("");
        }
    }

    private static void rotate(int newSize) {
        int k;
        int position = size - newSize;
        char temp = arrChar[position];
        for (k = position+1; k < size; k++) {
            arrChar[k-1] = arrChar[k];
        }
        arrChar[k-1] = temp;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Enter a word:\t");
        System.out.flush();
        String input = getString();
        size = input.length();
        for (int j = 0; j < size; j++) {
            arrChar[j] = input.charAt(j);
        }
        doAnagrams(size);
    }

    private static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }
}
