public class LinkListApp {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(22, 2.99);
        linkedList.insertFirst(44, 4.99);
        linkedList.insertFirst(66, 6.99);
        linkedList.insertFirst(88, 8.99);
        linkedList.insertFirst(0, 0.99);

        linkedList.displayList();

//        while (!linkedList.isEmpty()) {
//            Link aList = linkedList.deleteFirst();
//            System.out.println("Deleted "+ aList);
//            System.out.println();
//        }
//        System.out.println();

        Link f = linkedList.find(44);

        if (f != null) System.out.println("Found link with key "+ f.iData);

        else System.out.println(" Can't find link.");


        Link d = linkedList.delete(0);
        if(d!=null) System.out.println("Deleted link with key "+ d.iData);
        else System.out.println("Can't delete link that doesn't exist.");

        Link dd = linkedList.deleteFirst();
        if(d!=null) System.out.println("Deleted link with key "+ dd.iData);
        else System.out.println("Can't delete link that doesn't exist.");

        Link ddd = linkedList.deleteLast();

        if(d!=null) System.out.println("Deleted link with key "+ ddd.iData);
        else System.out.println("Can't delete link that doesn't exist.");

        System.out.println("Count: " + linkedList.size());
    }
}
