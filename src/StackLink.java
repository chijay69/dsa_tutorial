import java.util.Objects;

public class StackLink implements AbstractStackClass<StackLinkedList> {
    private StackLinkedList list;

    public StackLink () {
        list = new StackLinkedList();
    }

    @Override
    public void push(double j) {
        list.insertFirst(j);
    }

    @Override
    public double pop() {
        return list.deleteFirst();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }


    @Override
    public void displayStack() {
        System.out.println("Stack (top-->bottom: ");
        list.displayList();
    }

    @Override
    public int size(){
        return list.size();
    }

}
