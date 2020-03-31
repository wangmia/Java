package agent.two;

/**
 * @author WM
 * @date 2020/3/31 7:54 下午
 * 描述信息：死锁的实现代码
 */
public class Suo implements Runnable{
    private int flag = 1;
    private static final Object o1 = new Object();
    private static final Object o2 = new Object();
    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag == 1) {
            synchronized (o1) {
                System.out.println(Thread.currentThread().getName() + "拿到了 刀");
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o2) {
                    System.out.println(Thread.currentThread().getName() + "拿到了 叉");
                }
            }
        }
        if (flag == 2) {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + "拿到了 叉");
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o1) {
                    System.out.println(Thread.currentThread().getName() + "拿到了 刀");
                }
            }
        }
    }

    public static void main(String[] args) {
        Suo suo1 = new Suo();
        Suo suo2 = new Suo();

        suo1.setFlag(1);
        Thread thread1= new Thread(suo1, "米卡");
        thread1.start();

        suo2.setFlag(2);
        Thread thread2= new Thread(suo2, "卡米");
        thread2.start();
    }
}