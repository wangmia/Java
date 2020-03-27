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
//    int [] number = new int[200];
//    int i = 0;
        int j = 0;
    @Override
    public void run() {
//
//        for (int i = 200; i < number.length; i++) {
//            number[i] = i;
//        }
//
//        if(number[i]%2==1){
//            System.out.println(i+"-------"+Thread.currentThread().getName());
//            i++;

//        }

        for(int i=200;i<=400;i++){
            if(i%2==1){
                System.out.println(i+"-------"+Thread.currentThread().getName());
//                System.out.println(j++);
            }
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
