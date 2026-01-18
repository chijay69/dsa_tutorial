public class firstLastApp {
    public static void main(String[] args) {
        firstLastList list = new firstLastList();

        list.insertFirst(22);
        list.insertFirst(44);
        list.insertFirst(66);
        list.insertFirst(88);
        list.insertFirst(0);

        list.insertLast(11);
        list.insertLast(33);
        list.insertLast(55);
        list.insertLast(77);
        list.insertLast(99);

//        System.out.println(list);

        list.displayList();

        list.deleteFirst();
        list.deleteFirst();

        list.displayList();

    }
}
