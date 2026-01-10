public class LinkedList {
    private Link first;

    public LinkedList() {
        first = null;
    }

    public  boolean isEmpty() {
        return first == null;
    }

    public void insertFirst (int id, double dd) {
        Link newLink = new Link(id, dd);
        newLink.next = first;   // newLink --> old first
        first = newLink;    // first --> new link
    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public Link find(int key) {
        Link current = first;
        while (current != null) {
            if (current.iData == key) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public Link delete (int key) {
        Link current = find(key);
        Link previous = null;
        if (current != null){
            if (current.iData == key) {
                if (previous == null) {
                    first = current.next;
                } else {
                    previous.next = current.next;
                }
                return current;
            }
            previous = current;
            current = current.next;
        }
        return null;
    }

    public int size() {
        int count = 0;
        while(this.first != null) {
            count ++;
            first = first.next;
        }
        return count;
    }

//    public int size() { int count = 0; Link current = first; while (current != null) { count++; current = current.next; } return count; }


    public Link deleteLast() {
        if (first == null) return null;
        if (first.next == null) {
            Link temp = first;
            first = null;
            return temp;
        }

        Link current = first;
        Link previous = null;
        while (current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }


    public void displayList () {
        System.out.println("List  (first --> last): ");
        Link current = first;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
        System.out.println();
    }
}

