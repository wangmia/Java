package agent.three;

/**
 * @author WM
 * @date 2020/4/1 9:09 下午
 * 描述信息：9.ThreadLocal学习以及案例上传
 */
public class MyNumber {
    //使用ThreadLocal  维护唯一的变量
    private static ThreadLocal<Integer> number = new ThreadLocal<Integer>() {
        //去看ThreadLcoal的源代码,重写initialVal()方法，否则返回null
        protected Integer initialValue() {
            return 0;
        }
    };
    //拿到下一个号码
    public Integer getNext() {
        //ThreadLocal变量在调用set或者是get方法的时候，才回去调用initialValue() 且调用一次
        number.set(number.get()+1);
        return number.get();
    }

    public static void main(String[] args) {
        MyNumber mynumber = new MyNumber();
        //这里 传入的 mynumber  是同一个对象   但是打印的结果却是相互不影响
        //因为ThreadLocal保证了每个访问该变量的线程都有一个独立的副本
        MyThread mt1 = new MyThread(mynumber);
        Thread st1 = new Thread(mt1,"线程1");
        Thread st2 = new Thread(mt1,"线程2");

        st1.start();
        st2.start();

    }
}

class MyThread implements Runnable{
    private MyNumber my_number;
    public MyThread(MyNumber my_number) {
        this.my_number = my_number;
    }

    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println(Thread.currentThread().getName()+"-number:"+my_number.getNext());
        }
    }
}


