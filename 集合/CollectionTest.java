import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
public class CollectionTest {
    public static void main(String[] args){
        Collection c=new ArrayList();
        //添加元素
        c.add("孙悟空");
        //虽然集合里不能放基本类型的值，但java支持自动封装
        c.add(6);
        System.out.println("c集合的元素个数为:"+c.size()); //输出：2

        //删除指定元素
        c.remove(6);
        System.out.println("c集合的元素个数为:"+c.size());  //输出：1

        //判断是否指定包含字符串
        System.out.println("c集合是否指定包含\"孙悟空\"字符串："+c.contains("孙悟空")); //输出：true

        c.add("轻量级Java EE企业应用实战");
        System.out.println("c集合的元素："+c);   //输出：[孙悟空, 轻量级Java EE企业应用实战]

        Collection books=new HashSet();
        books.add("轻量级Java EE企业应用实战");
        books.add("疯狂Java讲义");
        System.out.println("c集合是否完全包括books集合?  "+c.containsAll(books));//输出：false

        //用c集合减去books集合里的元素
        c.removeAll(books);
        System.out.println("c集合的元素："+c);

        //删除c集合中的所有元素
        c.clear();
        System.out.println("c集合的元素："+c);

        //控制books集合中只剩下c集合里也含有的元素
        books.removeAll(c);
        System.out.println("c集合的元素："+books);

        //控制books集合中只剩下c集合里也含有的元素
        books.retainAll(c);
        System.out.println("books集合的元素："+books);

    }
}
