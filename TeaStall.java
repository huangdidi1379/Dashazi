import java.util.Scanner;
class TeaMenu{
    String s1="铁观音";
    String s2="西湖龙井";
    String s3="白毫银针";
    String s4="君山银针";
    String s5="黄山毛峰";
    String s6="武夷岩茶";
    String s7="安溪铁观音";
    String s8="信阳毛尖";
    String s9="庐山云雾";
    String s10="六安瓜片";

}

class InfuseMan{
    public String  getTea(){
        Waitor s1 = new Waitor();
        String want=s1.takeOrder();
        System.out.println("侍者问沏茶员泡好；'yes' or 'no'");
        Scanner b = new Scanner(System.in);
        String a;
        a= b.nextLine();
            if (a.equals("no")){
                System.out.println("现在还没有泡好，请等待3秒");
                int time=3;
                while(time>0){
                    time--;
                    try {
                        Thread.sleep(1000);
                        int s=time;
                        System.out.println("还剩"+s+"秒");
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("沏茶员给侍者提供茶：" + want);
                return want;
            } else {
                System.out.println("沏茶员给侍者提供茶：" + want);
                return want;
            }
    }
}

class TeaClient{
    public String  whatIsYourFavoriteFlavor(){
        Scanner want=new Scanner(System.in);
        String wanteat;
        wanteat=want.nextLine();
        System.out.println("茶客想要喝："+wanteat);
        return wanteat;
    }
    public void drink() {
        Waitor S = new Waitor();
        System.out.println("茶客喝到:"+S.serveTeacup());
    }
}

class Waitor{
    InfuseMan s1=new InfuseMan();
    TeaClient s2=new TeaClient();
    public String takeOrder(){
        String want=s2.whatIsYourFavoriteFlavor();
        System.out.println("侍者知道茶客点的："+want);
    return want;
    }
    public String  serveTeacup(){
        int i=0;
        String want=s1.getTea();
        System.out.println("侍者从沏茶员那里拿到:"+want);
        return want;
    }
}

public class TeaStall {
    public void lookTeaMenu(){
        TeaMenu s1 = new TeaMenu();
        System.out.println("茶单:");
        System.out.println("    "+s1.s1);
        System.out.println("    "+s1.s2);
        System.out.println("    "+s1.s3);
        System.out.println("    "+s1.s4);
        System.out.println("    "+s1.s5);
        System.out.println("    "+s1.s6);
        System.out.println("    "+s1.s7);
        System.out.println("    "+s1.s8);
        System.out.println("    "+s1.s9);
        System.out.println("    "+s1.s10);
    }
    public static void main(String[] args) {
        TeaClient s1= new TeaClient();
        TeaStall s2=new TeaStall();
        s2.lookTeaMenu();
        s1.drink();

    }
}