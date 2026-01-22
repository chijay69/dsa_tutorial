class Links {
    public double dData;
    public Links next;

    public Links (double d) {
        dData = d;
    }

    public void displayLinks() {
        System.out.println(dData + " ");
    }
}

public class StackLinkedList {
    private Links first;

    public StackLinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(double dd) {
        Links newLink = new Links(dd);
        newLink.next = first; // the newLink points to the current first.
        first = newLink; // then the new first is set to the new link.
    }

    public double deleteFirst() {
        if (first != null){
            Links temp = first;
            if (first.next == null) {
                first = null; // first is pointing to null, so the new first is set to null and the current first is returned.

            } else {
                first = first.next;
            }
            return temp.dData;
        }
        return 0;
    }

    public void displayList() {
        Links current = first;
        while (current != null) {
            current.displayLinks();
            current = current.next;
        }
        System.out.println();
    }

    public int size() {
        int count = 0;
        Links current = first;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public Links getFirst() {
        return this.first;
    }

    public void setFirst(Links newFirst) {
        this.first = newFirst;
    }

    public ListIterator getListIterator() {
        return new ListIterator(this);
    }
}
