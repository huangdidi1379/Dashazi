import java.util.TreeSet;
public class TreeSetTest  {
    public static void main(String[] args){
        TreeSet nums=new TreeSet();
        nums.add("5");
        nums.add("2");
        nums.add("10");
        nums.add("-9");
        //输出元素集合，排序状态
        System.out.println(nums);
        //输出第一个元素
        System.out.println(nums.first());
        //输出最后一个元素
        System.out.println(nums.last());
        //返回小于4的子集，不含4
        System.out.println(nums.headSet(4));
        //返回大于5的子集，如果Set中有5，则包含5
        System.out.println(nums.tailSet(5));
        //返回大于-3，小于4的子集，
        System.out.println(nums.subSet(-3,4));
    }
}
