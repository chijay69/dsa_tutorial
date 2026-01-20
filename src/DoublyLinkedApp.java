public class DoublyLinkedApp {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(22);
        list.insertFirst(44);
        list.insertFirst(66);
        list.insertFirst(88);

        list.insertLast(11);
        list.insertLast(33);
        list.insertLast(55);
        list.insertLast(77);

        list.displayForward();
        list.displayBackward();

        list.deleteFirst();
        list.deleteLast();
        list.deleteKey(11);

        list.displayForward();
        list.displayBackward();

        list.insertAfter(22, 99);
        list.insertAfter(33, 00);

        list.displayForward();
        list.displayBackward();

    }
}
