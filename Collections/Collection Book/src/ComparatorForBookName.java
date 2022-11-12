import java.util.Comparator;

public class ComparatorForBookName implements Comparator<Book> {
    @Override
    public int compare(Book t1, Book t2) {
        int temp = t1.getName().compareTo(t2.getName());
        if (temp<0) return -1;
        if (temp>0) return 1;
        return 0;
    }
}
