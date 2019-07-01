import java.util.Collection;
import java.util.HashSet;

public class PredicateTest {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add(new String("123"));
        books.add(new String("234"));
        books.add(new String("1234"));
        books.add(new String("1423"));
        books.add(new String("1243"));
        //使用Lambda表达式（目标类型是Predicate）过滤集合、
        //books.removeIf(ele->((String)ele).length()<10);
        System.out.println(books);
    }
}