import java.util.Scanner;

public class 猜数字 {
    public  static void main(String[] args){
        int num=(int)(Math.random()*10)+1;
        System.out.println("答案："+num);
        System.out.print("请输入你猜测的数字(1-1000)，退出请按0：");
        //第一次猜测
        Scanner scanner = new Scanner(System.in);   //准备接受用户输入
        int guest = scanner.nextInt();//给变量guest赋值
        int i=0;
        while (guest != num) {
            //如果猜测错误，则继续
            if (guest == 0) {
                //输入为0，则退出循环；否则判断数字
                break;
            } else if (guest > num) {
                System.out.println("太大了!");
            }
            else{
                System.out.println("太小了!");
                }
            i++;
            if(i==3) {
                System.out.println("你错了三次，游戏结束");
                break;
            }
            System.out.print("请输入你猜测的数字(1-1000)，退出请按0：");
            guest = scanner.nextInt();
        }
        if (guest == num) {
            System.out.println("恭喜，你猜对了!");
            //提示用户最终结果
            } else {
            System.out.println("真遗憾，下次再挑战吧!");
        }
        scanner.close();
    }
}
