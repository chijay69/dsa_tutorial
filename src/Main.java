//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank(100.0);

        System.out.println(bank);

        System.out.println("Before transactions, ");
        bank.display();

        bank.deposit(74.35);
        bank.withdraw(20.00);

        System.out.print("After transactions, ");
        bank.display();

        // Create a generic array object
        Array_ds<Integer> array = new Array_ds<>(Integer.class, 100);
        int nElements = 0;
        int j;
        int searchKey = 66;
        array.add(77);
        array.add(99);
        array.add(44);
        array.add(55);
        array.add(22);
        array.add(88);
        array.add(11);
        array.add(0);
        array.add(66);
        array.add(33);
        array.add(10);
        // ------------------
        for (j = 0; j < nElements; j++) {
            System.out.println(array.get(j) + " ");
        }
        System.out.println("");
        // --------------------
        for (j = 0; j < nElements; j++) {
            if (array.get(j) == searchKey) break;
        }
        if (j == nElements) System.out.println("Can't find " + searchKey); else System.out.println("Found " + searchKey);
        // ---------------------------------
        searchKey = 55;
        for (j = 0; j < nElements; j++) {
            if (array.get(j) == searchKey) break;
        }

        for (int k = j; k < nElements; k++) {
            array.set(k, array.get(k+1));
            nElements--;
        }
        // ----------------------------------
        System.out.println(array); // display the array.
        // ------------------------------------
        // OrderedApp
        int maxSize = 100;  // array size
        OrdArray arr; // instance of orderedArray

        arr = new OrdArray(maxSize);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);
        arr.insert(10);

        int _searchKey = 55;

        if (arr.find(_searchKey) != arr.size()) {
            System.out.println("Found " + _searchKey);
        }
        else {
            System.out.print("Can't find searchKey " + _searchKey);
        }

        arr.display();

        arr.delete(0);
        arr.delete(55);
        arr.delete(99);

        arr.display();
        // ---------------------------------------------
        // Person Array
        int maxSize_ = 100;
        ClassDataArray arr_;
        arr_ = new ClassDataArray<>(Person.class, maxSize_);
        // Insert the following persons into the array
        arr_.insert(new Person("Evans", "Patty", 24));
        arr_.insert(new Person("Smith", "Loraine", 37));
        arr_.insert(new Person("Yee", "Tom", 43));
        arr_.insert(new Person("Adams", "Henry", 63));
        arr_.insert(new Person("Velasquez", "Jose", 21));
        arr_.insert(new Person("Creswell", "Lucinda", 29));

        arr_.displayA();

        String searchKey_ = "Stimson";
        Person found;
        found = (Person) arr_.find(searchKey_);
        if (found != null) {
            System.out.println("Found ");
            System.out.println(found);
        } else System.out.println("Can't find " + searchKey_);

        System.out.println("Deleting smith, Yee, and Creswell.");
        arr_.delete("Smith");
        arr_.delete("Yee");
        arr_.delete("Creswell");

        arr_.displayA();


        // Deque illustration
        Deque queues = new Deque(5);

        queues.insertRight(77);
        queues.insertRight(99);

        System.out.println(queues);

//        queues.insertLeft(44);
//        queues.insertLeft(55);
//
//        System.out.println(queues);

    }
}
