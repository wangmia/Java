package ThreadPrac;

/**
 * @author WM
 * @date 2020/3/29 6:30 下午
 * 描述信息：模范 一个账户 1000块钱 :两个人 A B 分别在柜台和ATM机 取钱 A每次取钱100 B每次取200 最终在控制台输出每个人取钱数
 */
public class P3 implements Runnable{
    private static int money = 1000;
    // 设置数字分隔，让ATM机和柜台交替出现
    private int i = 1;
    @Override
    public void run() {
        while(money>0){
            synchronized (this){
                if(Thread.currentThread().getName().startsWith("A")){
                    if(i%2==1){
                        System.out.println(Thread.currentThread().getName()+"在柜台取了"+100+"元");
                    }else{
                        System.out.println(Thread.currentThread().getName()+"在ATM取了"+100+"元");
                    }
                    money -= 100;
                }else{
                    if(money<=100){
                        System.out.println("B用户你好，你的卡里已经没有钱了！");
                        break;
                    }else{
                        if(i%2==1){
                            System.out.println(Thread.currentThread().getName()+"在柜台取了"+200+"元");
                        }else{
                            System.out.println(Thread.currentThread().getName()+"在ATM取了"+200+"元");
                        }
                        money -= 200;
                    }
                }
                i++;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class TestP3{
    public static void main(String[] args) {
        P3 p3 =new P3();
        Thread t1 = new Thread(p3,"A");
        Thread t2 = new Thread(p3,"B");

        t1.start();
        t2.start();
    }
}