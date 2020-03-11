package inherit;

/**
 * @author WM
 * @date 2020/3/11 9:57 下午
 * 描述信息：设计一个汽车类Vehicle，包含的属性有车轮个数wheels和车重weight 小车类Car是Vehicle的子类，
 * 其中包含的属性有载人数loader。 卡车类Truck是Car类的子类，其中包含的属性有载重量payload。
 * 每个类都有构造方法和输出相关数据的方法。最后，写一个测试类来测试这些类的功能
 *      显示卡车的各项参数
 */
public class Vehicle {
    private int wheels;
    private double weight;

    public Vehicle() {
    }
    public Vehicle(int wheels, double weight) {
        this.wheels = wheels;
        this.weight = weight;
    }
    public int getWheels() {
        return wheels;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return
                "wheels=" + wheels + '个'+
                ", weight=" + weight + "kg";
    }
}
class Car extends Vehicle{
    private int loader;
    public Car() {
    }
    public int getLoader() {
        return loader;
    }
    public void setLoader(int loader) {
        this.loader = loader;
    }
    public Car(int wheels, double weight, int loader) {
        super(wheels, weight);
        this.loader = loader;
    }
    @Override
    public String toString() {
        return
                " loader=" + loader + '人'+','+super.toString();
    }
}
class Truck extends Car{
    private double payload;

    public Truck() {
    }
    public Truck(int wheels, double weight, int loader,double payload) {
        super(wheels, weight, loader);
        this.payload = payload;
    }
    public double getPayload() {
        return payload;
    }
    public void setPayload(double payload) {
        this.payload = payload;
    }
    @Override
    public String toString() {
        return
                " payload=" + payload +" kg"+','+ super.toString();
    }
}
class Tests{
    public static void main(String[] args) {
        Truck truck = new Truck(4,50.5,5,30.5);
        System.out.println("输出车子的属性");
        System.out.println(truck.toString());

    }
}