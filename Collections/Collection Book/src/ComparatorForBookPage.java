import java.util.Comparator;

public class ComparatorForBookPage implements Comparator<Book> {
    @Override
    public int compare(Book t1, Book t2) {
        if (t1.getPage()<t2.getPage()) return 1;
        if (t1.getPage()>t2.getPage()) return -1;
        return 0;
    }
}
