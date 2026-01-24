import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;

public class Factorials {
    public static int factorial(int n) {
        if (n>=0 && n<=1) return 1;
        else if (n<0) throw new InvalidParameterException("Only positive integers are allowed.");
        else {
            return n * factorial(n-1);
        }
    }

    private static int getInt() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Enter a value to calculate its factorial: ");
        int value = getInt();
        int fac = factorial(value);
        System.out.println("Factorial of " + value + " = " + fac);
    }
}
