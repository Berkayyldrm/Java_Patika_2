import java.util.Date;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("a", 100, "Agatha", new Date(22/5/2021));
        Book b2 = new Book("b", 200, "Goethe", new Date(22/2/1900));
        Book b3 = new Book("v", 500, "Tolstoy", new Date(25/11/1920));
        Book b4 = new Book("f", 110, "Harvey", new Date(30/8/2000));
        Book b5 = new Book("e", 50, "Graham", new Date(1/5/2022));

        TreeSet<Book> treeSet = new TreeSet<>(new ComparatorForBookName());
        treeSet.add(b1);
        treeSet.add(b2);
        treeSet.add(b3);
        treeSet.add(b4);
        treeSet.add(b5);

        System.out.println("Order for book name : ");
        for (Book tSet:
             treeSet) {
            System.out.println(tSet.getName());
        }

        TreeSet<Book> treeSetPage = new TreeSet<>(new ComparatorForBookPage());
        treeSetPage.add(b1);
        treeSetPage.add(b2);
        treeSetPage.add(b3);
        treeSetPage.add(b4);
        treeSetPage.add(b5);

        System.out.println("Order for book page : ");
        for (Book tSet:
                treeSetPage) {
            System.out.println(tSet.getName());
        }
    }
}