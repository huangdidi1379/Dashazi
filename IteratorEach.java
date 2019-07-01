import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorEach {
    public static void main(String[] args){
        //创建一个集合
        Collection books=new HashSet();
        books.add("熊猫1");
        books.add("熊猫2");
        books.add("熊猫3");
        //获取books集合对应的迭代器
        Iterator it=books.iterator();
        it.next();
        //使用Lambda表达式（目标类型是Comsumer）来遍历集合元素
        //it.forEachRemaining(obj->System.out.println("迭代集合元素：+obj"));
    }
}
