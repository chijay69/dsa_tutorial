public class ListIterator {
    private Links current;
    private Links previous;
    private final StackLinkedList ourList;

    public ListIterator(StackLinkedList obj) {
        ourList = obj;
        reset();
    }

    public void reset() {
        current = ourList.getFirst();
        previous = null;
    }

    public void nextLink() {
        previous = current;
        current = current.next;
    }

    public Links getCurrent() {
        return current;
    }

    public boolean atEnd() {
        if (getCurrent().next == null) {
            return true;
        }
        return false;
    }

    public void insertAfter(double dd) {
        Links newLink = new Links(dd);
        if (ourList.isEmpty()) {
            ourList.setFirst(newLink);
            current = newLink;
        }
        else {
            newLink.next = current.next;
            current.next = newLink;
            nextLink();
        }
    }

    public boolean insertAfter(double key, double dd) {
        Links newLink = new Links(dd);
        reset();
        if (ourList.isEmpty()) {
            ourList.setFirst(newLink);
            current = newLink;
            previous = null;
            return true;
        }

        while (current != null && current.dData != key) {
            current = current.next;
        }

        if (current == null) {
            return false;
        }
        newLink.next = current.next;
        current.next = newLink;
        nextLink();
        return true;
    }

    public void insertBefore(double dd) {
        Links newLink = new Links(dd);

        if (previous == null) { // empty  list
            newLink.next = ourList.getFirst();
            ourList.setFirst(newLink);
            reset();
        }
        else {
            newLink.next = previous.next;
            previous.next = newLink;
            current = newLink;
        }
    }

    public boolean insertBefore(double key, double dd) {
        Links newLink = new Links(dd);

        if (previous == null){ // if list is empty, start at the beginning
            newLink.next = ourList.getFirst(); // set the link to point to the first and
            // be the first
            ourList.setFirst(newLink);
            reset();
        } else {
            // loop through the list till you find the key before the  key greater than your key
            while (ourList.getFirst().dData != key) {
                previous = current;
                current = current.next;
                if (current == null) {
                    return false;
                }
            }
            // found dData == key
            newLink.next = previous.next;
            previous.next = newLink;
            current = newLink;
        }
        return true;
    }

    public double deleteCurrent() {
        double value = current.dData;
        if (previous == null) {
            ourList.setFirst(current.next);
            reset();
        } else {
            previous.next = current.next;
            if (atEnd()) {
                reset();
            } else {
                current = current.next;
            }
        }
        return value;
    }
}
