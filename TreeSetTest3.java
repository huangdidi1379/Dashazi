import java.util.TreeSet;

class E implements Comparable{
    int count;
    public E(int count){
        this.count=count;
    }

    @Override
    public String toString() {
        return "E[count:"+count+"]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == R.class) {
            E r = (E) obj;
            return r.count == this.count;
        }
        return false;
    }

    public int compareTo(Object o) {
        E  r = (E)o;
        return count>r.count ? 1 : count<r.count ? -1 : 0;
    }
}
public class TreeSetTest3{
    public static void main(String[] args){
        TreeSet ts=new TreeSet();
        ts.add(new E(5));
        ts.add(new E(-3));
        ts.add(new E(9));
        ts.add(new E(-2));
        //打印集合，集合有序排列
        System.out.println(ts);
        //第一个元素
        E first=(E)ts.first();
        //对第一个元素的count赋值
        first.count=20;
        //最后一个元素
        E last=(E)ts.last();

        last.count=-2;

        System.out.println(ts);
        //删除实例变量被改变的元素，删除失败
        System.out.println(ts.remove(new E(-2)));
        System.out.println(ts);
        //删除实例变量没有被改变的元素，删除成功
        System.out.println(ts.remove(new E(5)));
        System.out.println(ts);
    }
}
