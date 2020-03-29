package ThreadPrac;

/**
 * @author WM
 * @date 2020/3/29 5:16 下午
 * 描述信息：2.有四个线程,其中A,B线程对i加1操作，C,D线程每次对i减1操作
 */
public class Th2 implements Runnable{
    // 要输出的数字
    private static int i = 0;
    // 循环控制的次数
    private static int c = 0;
    // 接收要判断的线程的名字
    private String z = "";

    @Override
    public void run() {
        while(c < 10){
            if(z.equals("")||Thread.currentThread().getName().startsWith(z)){
                synchronized (Th2.class){
                    if(Thread.currentThread().getName().startsWith("A")||Thread.currentThread().getName().startsWith("B")) {
                        System.out.println(Thread.currentThread().getName() + " -------------- " + ++i);
                    }else{
                        System.out.println(Thread.currentThread().getName()+" -------------- "+ --i);
                    }

                    c += 1;

                    if(Thread.currentThread().getName().startsWith("A")){
                        z = "B";
                    }else if(Thread.currentThread().getName().startsWith("B")) {
                        z = "A";
                    }else if(Thread.currentThread().getName().startsWith("C")) {
                        z = "D";
                    }else if(Thread.currentThread().getName().startsWith("D")) {
                        z = "C";
                    }

                    if(c%2==0){
                        if(Thread.currentThread().getName().startsWith("A")||Thread.currentThread().getName().startsWith("B")){
                            z = "D";
                        }else{
                            z = "B";
                        }
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }else{
                Thread.yield();
//                System.out.println("走进来了");
            }
        }
    }
}
class TestTh2{
    public static void main(String[] args) {
        Th2 th2 = new Th2();
        Thread t1 = new Thread(th2,"A");
        Thread t2 = new Thread(th2,"B");
        Thread t3 = new Thread(th2,"C");
        Thread t4 = new Thread(th2,"D");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}