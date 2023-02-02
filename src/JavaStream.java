import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStream {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book(1,"Wings",2000));
        bookList.add(new Book(2,"science",3000));
        bookList.add(new Book(3,"gk",1000));
        bookList.add(new Book(4,"maths",2000));
        List<Integer> priceList = bookList.stream().filter(p->p.price>2000).map(p->p.price).collect(Collectors.toList());
        System.out.println(priceList);
        bookList.stream().filter(p->p.price>2000).forEach(p->System.out.println(p.name));
    }

}
