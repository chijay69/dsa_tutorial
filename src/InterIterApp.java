import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;


public class InterIterApp {
    public static void main(String[] args) throws IOException {
        StackLinkedList list = new StackLinkedList();

        ListIterator iterator = new ListIterator(list);

        Object value = 0;

        iterator.insertAfter(0);
        iterator.insertAfter(10);
        iterator.insertAfter(80);
        iterator.insertBefore(90);

        iterator.insertAfter(0, 20);
//        iterator.insertAfter(20, 30);
//        iterator.insertAfter(30, 40);
//        iterator.insertBefore(0, 60);

//        while(true) {
//            System.out.print("Enter first the letter of show, reset, ");
//            System.out.print("next, gen, before, after, delete: ");
//            System.out.flush();
//            int choice = getChar();
//            switch (choice) {
//                case 's':
//                    if (!list.isEmpty()){
//                        list.displayList();
//                    } else {
//                        System.out.println("List is empty.");
//                    }
//                    break;
//                case 'r':
//                    iterator.reset();
//                    break;
//                case 'n':
//                    if (!list.isEmpty() && iterator.atEnd()) {
//                        iterator.nextLink();
//                    } else {
//                        System.out.println("Can't do the next link.");
//                    }
//                    break;
//                case 'g':
//                    if (!list.isEmpty()) {
//                        value = iterator.getCurrent().dData;
//                        System.out.println("Returned " + value);
//                    }
//                    else {
//                        System.out.println("List is empty.");
//                    }
//                    break;
//                case 'b':
//                    System.out.println("Enter value to insert: ");
//                    System.out.flush();
//                    value = getInt();
//                    if (value instanceof Integer v) {
//                        iterator.insertBefore((double) v);
//                    } else if (value instanceof List) {
//                        double key = (int) ((List<?>) value).get(0);
//                        double data = (int) ((List<?>) value).get(1);
//                        iterator.insertBefore(key, data);
//                    }
//                    break;
//                case 'a':
//                    System.out.println("Enter value to insert: ");
//                    System.out.flush();
//                    value = getInt();
//                    if (value instanceof Integer v) {
//                        iterator.insertAfter((double) v);
//                    } else if (value instanceof List) {
//                        double key = (int) ((List<?>) value).get(0);
//                        double data = (int) ((List<?>) value).get(1);
//                        iterator.insertAfter(key, data);
//                    }
//                    break;
//                case 'd':
//                    if (!list.isEmpty()) {
//                        value = iterator.deleteCurrent();
//                        System.out.println("Deleted " + value);
//                    }
//                    else {
//                        System.out.println("Can't delete.");
//                    }
//                    break;
//                default:
//                    System.out.println("Invalid entry");
//            }
//    }
        System.out.println("starting...");
        iterator.reset();
        double currentValue = iterator.getCurrent().dData;
        System.out.println(currentValue + " ");
        while (!iterator.atEnd()) {
            if (list.isEmpty()) {
                break;
            }
            iterator.nextLink();
            double currentValue1 = iterator.getCurrent().dData;
            System.out.println(currentValue1 + " ");
        }
    }

    public static String getString () throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }

    public static int getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    public static Object getInt() throws IOException {
        String s = getString();
        if (s.contains(" ")) {
            String[] strings = s.split(" ");
            return List.of(Integer.parseInt(strings[0]), Integer.parseInt(strings[1]));
        }
        return Integer.parseInt(s);
    }
}
