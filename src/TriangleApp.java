import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;

public class TriangleApp {
    static int theNumber;

    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number: ");
        System.out.flush();
        theNumber = getInt();
        int theAnswer = triangle(theNumber);
        System.out.println("Triangle="+theAnswer);
    }

    public static int triangle(int value) throws InvalidParameterException {
        if (value < 0 ) throw new InvalidParameterException("Parameter must be equal or greater than 0");

        if (value == 0) return 0;

        if (value == 1) {
            return 1;
        } else {
            return (value + triangle(value - 1));
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);
        return bufferedReader.readLine();
    }

    public static int getInt() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);
        return Integer.parseInt(bufferedReader.readLine());
    }
}
