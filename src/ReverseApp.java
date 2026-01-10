import java.io.*;


public class ReverseApp {
    public static void main(String[] args) throws IOException {
        String output;
        while(true) {
            System.out.print("Enter a string: ");
            System.out.flush();
            String input = getString();
            if (input.isEmpty()) {
                break;
            }

            Reverser theReverser = new Reverser(input);
            output = theReverser.doRev();
            System.out.println("Reversed: "+ output);
        }
    }

    private static String getString() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        return bufferedReader.readLine();
    }
}
