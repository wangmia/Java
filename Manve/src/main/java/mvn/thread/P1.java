package mvn.thread;

/**
 * @author WM
 * @date 2020/3/26 10:05 下午
 * 描述信息：有三个线程,输出200到400之间所有的数据,如果是奇数那么就输出当前线程的名称
 */
public class P1 extends Thread{
    public P1(String name) {
        super(name);
    }
    static int j = 0;
    static int i = 200;
    @Override
    public void run() {
        while(i<=400){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (P1.class){
                if(i%2==1&&i<=400){
                    System.out.println(i+"-------"+Thread.currentThread().getName());
                    System.out.println(j++);
                }
            }
            i++;
        }

    }
}
class TestP1{
    public static void main(String[] args) {
        P1 p1 = new P1("A线程");
        p1.start();
        P1 p2 = new P1("B线程");
        p2.start();
        P1 p3 = new P1("C线程");
        p3.start();
    }
}
