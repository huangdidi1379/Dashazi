import java.util.Collection;
import java.util.HashSet;


public class CollectionEach {

    public static void main(String[] args){
        //创建一个集合
        Collection books=new HashSet();
        books.add("小熊猫1");
        books.add("大熊猫2");
        books.add("中熊猫3");
        //调用forEach()方法遍历集合
       // books.forEach(obj->System.out.println("迭代元素集合：" + obj));
    }

}
