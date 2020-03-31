package agent.two;

import java.util.LinkedList;

/**
 * @author WM
 * @date 2020/3/30 11:22 下午
 * 描述信息：
 * 3.请使用LinkedList来模拟一个队列(先进先出的特性)
 *
 * 3.1 拥有放入对象的方法void put(Object o)
 * 3.2 取出对象的方法Object get()
 * 3.3 判断队列当中是否为空的方法booleanisEmpty()；并且，编写测试代码，验证你的队列是否正确？
 */
public class P3 {
    static LinkedList linkedList = null;
    public static void main(String[] args) {

        System.out.println(isEmpty());

        linkedList = new LinkedList();

        put(12345);
        put(22345);
        put(32345);
        put(42345);
        put(52345);

        System.out.println(get());

        System.out.println(isEmpty());
    }
    static void put(Object o){
        linkedList.add(o);
    }
    static Object get(){
        return linkedList;
    }
    static boolean isEmpty(){
        if(linkedList==null){
            return true;
        }else{
            return false;
        }
    }
}
