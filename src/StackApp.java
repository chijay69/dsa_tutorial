public class StackApp {
    public static void main (String[] args) {
        sorting1.Stack thestack = new sorting1.Stack(10);

        thestack.push(20);
        thestack.push(40);
        thestack.push(60);
        thestack.push(80);

        while ( !thestack.isEmpty() ){
            double value = thestack.pop();
            System.out.println(value);
        }
        System.out.print("");
    }
}
