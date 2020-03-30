package agent;

/**
 * @author WM
 * @date 2020/3/30 8:58 下午
 * 描述信息：3. 写出一个线程安全的单例模式
 */
public class Singleton {
    // 将自身实例化对象设置为一个属性，并用static修饰
    private static Singleton instance;

    // 构造方法私有化
    private Singleton() {
    }

    // 静态方法返回该实例，加synchronized关键字实现同步
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
class Thanes implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"对应的Singleton类的地址是："+Singleton.getInstance().hashCode());
    }
}

class TestSingleton{
    public static void main(String[] args) {
        Thanes thanes = new Thanes();
        Thread t1 = new Thread(thanes,"线程A");
        Thread t2 = new Thread(thanes,"线程B");
        t1.start();
        t2.start();
    }
}