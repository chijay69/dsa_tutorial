public class Link {
    public int iData;
    public double dData;
    public Link next;
    
    public Link(int id, double dd) {
        iData = id;
        dData = dd;
    }

    @Override
    public String toString() {
        return "Link{" +
                "iData=" + iData +
                ", dData=" + dData +
                ", next=" + next +
                '}';
    }
    
}
