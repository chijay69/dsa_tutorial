import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;


public class InfixApp {

    public static void main(String[] args) {
    Logger logger = Logger.getLogger(String.valueOf(InfixApp.class));
        String input, output;
        while (true) {
            System.out.println("Enter infix ");
            System.out.flush();
            try {
                input = getString();
            } catch (IOException e) {
                logger.info(e.getMessage());
                throw new RuntimeException(e);
            }
            if (input.isEmpty()) {
                break;
            }
            Infix.IntoPost theTrans = new Infix.IntoPost(input);
            output = theTrans.doTrans();
            System.out.println("Postfix is " + output);
            System.out.println();
        }
    }

    private static String getString() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        return bufferedReader.readLine();
    }
}
