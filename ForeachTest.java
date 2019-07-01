import java.util.Collection;
import java.util.HashSet;

public class ForeachTest {
    public static void  main(String[] args){
        //创建一个集合
        Collection books=new HashSet();
        books.add("小熊猫1");
        books.add("大熊猫2");
        books.add("中熊猫3");
        for(Object obj:books){
            //此处的book变量也不是集合元素本身
            String book=(String) obj;
            System.out.println(book);
           /* if(book.equals("小熊猫1")){
                book.remove(book);  //使用这个方法的时候，集合元素不能被改变，
                                    //否则异常
            }*/
        }
        System.out.println(books);
    }
}
