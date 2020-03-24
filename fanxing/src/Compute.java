/**
 * @author WM
 * @date 2020/3/23 11:06 下午
 * 描述信息：第二题.定义泛型类，成员变量是Number类或其子类对象的数组，成员方法有：求数组元素最小值、最大值和平均值。
 *  * 创建泛型类对象，分别求Integer和Double型数组的最小最大、平均值
 */
public class Compute<T extends Number> {

    private T [] t ;

    public Compute(T[] t){
        this.t = t;
    }

    public T min(){
        T min = t[0];
        for(int i=0;i<t.length;i++){
            // compareTo 返回两者的比较，前者比后者大就返回1，相等返回0，前者比后者小返回-1
            if(min.toString().compareTo(t[i].toString())>0){
                min = t[i];
            }
        }
        return min;
    }

    public T max(){
        T max = t[0];
        for(int i=0;i<t.length;i++){
            if(max.toString().compareTo(t[i].toString())<0){
                max = t[i];
            }
        }
        return max;
    }

    public double avg(){
//        int length = t.length;
        double sum = 0.0;
        for (int i = 0; i < t.length; i++) {
            sum += t[i].doubleValue();
        }
        return sum/t.length;
    }
}
class test{
    public static void main(String[]args){
        Integer [] ams = {1,5,9,7,6};
        Double [] dou = {7.9,9.0,5.5,7.6,3.7};
        int [] co = {12,3,4};
        Compute compute1 = new Compute(ams);
        System.out.println("最大值："+compute1.max());
        System.out.println("最小值："+compute1.min());
        System.out.println("平均值："+compute1.avg());

        Compute compute2 = new Compute(dou);
        System.out.println("最大值"+compute2.max());
        System.out.println("最小值"+compute2.min());
        System.out.println("平均值"+compute2.avg());

//        Compute compute3 = new Compute(co);

//        Integer a= 3;
//        Integer b = 2;
//        System.out.println(a.toString().compareTo(b.toString()));   // -1 = a<b  0 = a=b 1 = a>b
//        Number 是系统自带的类
    }
}
//class Number{
//
//}
