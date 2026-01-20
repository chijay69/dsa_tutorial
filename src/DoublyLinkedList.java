// DoublyLinkedList.java

class LinkD {
    public double dData;
    public LinkD next;
    public LinkD previous;

    public LinkD (double d) {
        dData = d;
    }

    public void displayLink(){
        System.out.println(dData + " ");
    }
}
public class DoublyLinkedList {
    private LinkD first;
    private LinkD last;

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(double dd) {
        LinkD newLink = new LinkD(dd);
        if (isEmpty()) {
            last = newLink;
        } else {
            first.previous = newLink; // the old first points to the new link obj
        }
        newLink.next = first;   // the new link obj next points to the current soon to be old first link obj.
        first = newLink; // assign the first position to the new link obj.
    }

    public void insertLast(double dd) {
        LinkD newLink = new LinkD(dd);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink; // old last to point to new link
//            newLink.next = null; // (if not doublyLinkedList).
            newLink.previous = last; // new link previous to point to old last
        }
        last = newLink; // last set to new link
    }

    public LinkD deleteFirst() {
        LinkD temp = first;
        if (first.next == null) {
            last = null;
        } else {
            first.next.previous = null; // traverse to the second Link object,
            // set its previous pointer to the old first to be null.
        }
        first = first.next; // make the second Link obj, the current first.
        return temp; // return the first link that was removed
    }

    public LinkD deleteLast() {
        LinkD temp = last;

        if (first.next == null) {
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

    public boolean insertAfter(double key, double dd) {
        LinkD current = first;
        while (current.dData != key) {
            current = current.next;
            if (current == null) {
                return false;
            }
        }
        LinkD newLink = new LinkD(dd);

        if (current == last) {
            newLink.next = null;
            last = newLink;
        } else {
            newLink.next = current.next;
            current.next.previous = newLink;
        }
        newLink.previous = current;
        current.next = newLink;
        return true;
    }

    public LinkD deleteKey(double key) {
        LinkD current = first;
        while (current.dData != key){
            current = current.next;
            if (current == null) {
                return null;
            }
        }
        if (current == first) {
            first = current.next;
        } else {
            current.previous.next = current.next;
        }

        if (current == last) {
            last = current.previous;
        } else {
            current.next.previous = current.previous;
        }
        return current;
    }

    public void displayForward() {
        System.out.println("List (first --> last): ");
        LinkD current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        System.out.println("list (last --> first): ");
        LinkD current = last;
        while (current != null) {
            current.displayLink();
            current = current.previous;
        }
        System.out.println();
    }
}
