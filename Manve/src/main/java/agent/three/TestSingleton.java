package agent.three;

/**
 * @author WM
 * @date 2020/4/1 5:10 下午
 * 描述信息：写出恶汉模式，懒汉模式，线程安全的懒汉模式
 *
 * 1、饿汉模式：在类被加载的时候创建实例（线程安全的）。
 * 2、懒汉模式：在方法被运行的时候创建实例（线程不安全的） 解决方法：利用synchronized关键字。
 */
public class TestSingleton {
    public static void main(String[] args) {
        SingletonThread singletonThread = new SingletonThread();
        Thread thread1 = new Thread(singletonThread,"线程A");
        Thread thread2 = new Thread(singletonThread,"线程B");
        thread1.start();
        thread2.start();
    }
}

// 单例模式懒汉、饿汉的输出线程
class SingletonThread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程安全饿汉模式----对应的Singleton类的地址是："+ Singleton1.getInstance().hashCode());
        System.out.println(Thread.currentThread().getName()+"线不安全懒汉模式----对应的Singleton类的地址是："+ Singleton2.getInstance().hashCode());
        System.out.println(Thread.currentThread().getName()+"线程安全懒汉模式----对应的Singleton类的地址是："+ Singleton3.getInstance().hashCode());
    }
}

//饿汉模式
class Singleton1 {
    //将构造函数私有化
    private Singleton1(){

    }
    //将对象实例化
    private static Singleton1 instance = new Singleton1();

    //得到实例的方法

    public static Singleton1 getInstance() {
        return instance;
    }
}

//懒汉模式
class Singleton2 {
    //将构造函数私有化
    private Singleton2(){

    }
    //将对象实例化
    private static volatile  Singleton2 instance ;

    //得到实例的方法

    public static Singleton2 getInstance() {
        if(instance == null) {
                instance = new Singleton2();
        }
        return instance;
    }
}

//线程安全的懒汉模式
class Singleton3 {
    //将构造函数私有化
    private Singleton3(){

    }
    //将对象实例化
    private static volatile  Singleton3 instance ;

    //得到实例的方法
    public static synchronized Singleton3 getInstance() {
        if(instance == null) {
//            synchronized (Singleton3.class) {
//                if (instance == null) {
                    instance = new Singleton3();
//                }
//            }
        }
        return instance;
    }
}


