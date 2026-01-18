class LinkQ {
    public double dData;
    public LinkQ next;

    public LinkQ (double d) {
        dData = d;
    }

    public void displayLink() {
        System.out.println(dData + " ");
    }
}
public class firstLastList {
    private LinkQ first;
    private LinkQ last;

    public firstLastList () {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(double dd){
        LinkQ newLink = new LinkQ(dd);

        if (isEmpty()) {
            last = newLink;
        }

        newLink.next = first;
        first = newLink;
    }

    public void insertLast (double dd) {
        LinkQ newLink = new LinkQ(dd);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;    // The old last link next pointer to be equal to the newLink
            last = newLink;     // set the value of the last link to the new link
        }
    }

    public double deleteFirst() {
        double temp = first.dData;
        System.out.println("Got temp: " + temp);
        if (first.next == null) {
            System.out.println("first.next is null, so last is null by default.");
            last = null;    // if only one data i.e. first, next pointer points to next, then the Link data of the last must be null
        }
        first = first.next; // set the new first to the data - null - pointed to by the previous first next.
        System.out.println("Link is larger than one element - data - so we setting old first next pointer data as the current first data");
        System.out.println("then return the deleted data.");
        return temp;    // return the removed (deleted) data.
    }

    public void displayList() {
        System.out.println("List (first-->last): ");
        LinkQ current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "firstLastList{" +
                "first=" + first +
                ", last=" + last +
                '}';
    }
}

