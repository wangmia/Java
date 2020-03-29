package ThreadPrac;

import java.nio.Buffer;

/**
 * @author WM
 * @date 2020/3/29 2:46 下午
 * 描述信息：1.现在有三个线程,如何保持三个线程按照顺序执行
 */
public class Th1{
    public static void main(String[] args) {
        final Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"运行了");
            }
        },"线程1");
        final Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"运行了");
            }
        },"线程2");
        final Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread2.join();
                    thread1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"运行了");
            }
        },"线程3");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}