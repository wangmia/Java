package agent.three;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author WM
 * @date 2020/4/1 8:42 下午
 * 描述信息：
 *                      CyclicBarrier 实现
 *
 */
public class Player implements Runnable {
    private CyclicBarrier cyclicBarrier;
    private int id;

    public Player(int id, CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            System.out.println("玩家" + id + "正在玩第一关...");
            cyclicBarrier.await();
            System.out.println("玩家" + id + "进入第二关...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}


class CyclicBarrierTest {
    public static void main(String[] args) {
        // CyclicBarrier cyclicBarrier = new CyclicBarrier(4);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(4,
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("所有玩家进入第二关！");
                    }
                });

        for (int i = 0; i < 4; i++) {
            new Thread(new Player(i, cyclicBarrier)).start();
        }
    }
}

/**
 * 有四个游戏玩家玩游戏，游戏有三个关卡，每个关卡必须要所有玩家都到达后才能允许通过。其实这个场景里的玩家中如果有玩家A先到了关卡1，
 * 他必须等到其他所有玩家都到达关卡1时才能通过，也就是说线程之间需要相互等待。这和CountDownLatch的应用场景有区别，
 * CountDownLatch里的线程是到了运行的目标后继续干自己的其他事情，而这里的线程需要等待其他线程后才能继续完成下面的工作。
 */