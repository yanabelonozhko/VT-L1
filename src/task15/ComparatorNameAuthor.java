package task15;
import task14.Book;
import java.util.Comparator;

public class ComparatorNameAuthor implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int result = o1.getTitle().compareTo(o2.getTitle());
        if (result == 0) {
            result = o1.getAuthor().compareTo(o2.getAuthor());
        }
        return result;
    }
}
