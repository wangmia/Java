package mvn.thread;

/**
 * @author WM
 * @date 2020/3/26 10:40 下午
 * 描述信息：现在有一个旅行队10个人,探险进入一线天,这个一线天每次只能过一个人,每个人过的时间是20秒
 * ,现在10个人通过该一线天,请输出每个人经过一线天的顺序和姓名
 */
public class P2 implements Runnable {
    private static int i = 0;

    @Override
    public void run() {
        while(i<=10){
            try {
                Thread.sleep(1000);
//                Thread.currentThread().stop();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized(this){
                if(i<10){
                    System.out.println("<<<--- 恭喜"+Thread.currentThread().getName()+" --->>> 第 "+((i++)+1)+" 个通过一线天");
                }else{
                    break;
                }
            }
        }
    }
}

class TestP2{
    public static void main(String[] args) {
        P2 p2 = new P2();
        Thread t1 = new Thread(p2,"游客1");
        Thread t2 = new Thread(p2,"游客2");
        Thread t3 = new Thread(p2,"游客3");
        Thread t4 = new Thread(p2,"游客4");
        Thread t5 = new Thread(p2,"游客5");
        Thread t6 = new Thread(p2,"游客6");
        Thread t7 = new Thread(p2,"游客7");
        Thread t8 = new Thread(p2,"游客8");
        Thread t9 = new Thread(p2,"游客9");
        Thread t10 = new Thread(p2,"游客10");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();


    }
}