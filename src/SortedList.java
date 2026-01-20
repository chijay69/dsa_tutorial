public class SortedList {
    private Linkk first;

    public SortedList () {
        first = null;
    }
    public SortedList (Linkk[] linkArray) {
        first = null;
        for (Linkk linkk : linkArray) {
            insert(linkk.dData);
        }
    }

    public boolean isEmpty () {
        return first == null;
    }

    public void insert (double key) {
        Linkk newLink = new Linkk(key);
        Linkk previous =  null;
        System.out.println("the current is the first, we start looking for the insert position from the first.");
        Linkk current = first;

        while (current != null && key > current.dData) {
            System.out.println("current is not null and key is greater than current data.");
            previous = current;
            System.out.println("previous is set to current and current to current.next");
            current = current.next;
        }
        if (previous == null) {
            System.out.println("checks to see if previous data is null then this is an empty link list to set the first link");
            first = newLink;
        } else {
            System.out.println("This is not new, so set the previous pointer to point to the next link, ");
            previous.next = newLink;
        }
        System.out.println("the newlink is to point to the current");
        newLink.next = current;
    }

    public Linkk remove() {
        Linkk temp = first;
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.println("List (first--->last): ");
        Linkk current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}


