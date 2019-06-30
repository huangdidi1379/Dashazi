import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args){
        //创建一个集合
        Collection books=new HashSet();
        books.add("小熊猫1");
        books.add("大熊猫2");
        books.add("中熊猫3");
        //获取books集合对应的迭代器
        Iterator it=books.iterator();
        while(it.hasNext())
        {
            //it.next()方法返回的都是Obiect类型，故需要强制转化类型
            String book=(String)it.next();
            if(book.equals("中熊猫3"))//equals():// 比较引用数据类型。重写前比较的是地址值，
                                      // 重写后比一般是比较对象的属性。
            {
                //从集合中删除上一次next()方法返回的元素
                it.remove();
            }
            //对book变量赋值，不会改变集合元素本身
            book="测试字符串";
        }
        System.out.println(books);
    }
}
