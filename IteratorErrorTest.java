import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorErrorTest {
    public static void main(String[] args) {
        //创建一个集合
        Collection books=new HashSet();
        books.add("小熊猫");
        books.add("大熊猫");
        books.add("中熊猫");
        Iterator it=books.iterator();
        while (it.hasNext()) {
            String book = (String) it.next();
            System.out.println(book);
            if (book.equals("中熊猫")) {
                //使用Iterator迭代过程中，不可修改集合元素，下面代码发生异常
                books.remove(book);
            }
        }
    }
}

