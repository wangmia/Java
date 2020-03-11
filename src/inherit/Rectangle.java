package inherit;

import java.util.Scanner;

/**
 * @author WM
 * @date 2020/3/11 6:49 下午
 * 描述信息：（1）定义一个类，描述一个矩形，包含有长、宽两种属性，和计算面积方法。
 *         （2）编写一个类，继承自矩形类，同时该类描述长方体，具有长、宽、高属性，和计算体积的方法。
 *         （3）编写一个测试类，对以上两个类进行测试，创建一个长方体，定义其长、宽、高，输出其底面积和体积
 */
public class Rectangle {
    // 矩形类
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double area(){
        return length*width;
    }
}

class Volume extends Rectangle{
    private double higth;

    public Volume() {
    }
    public Volume(double length, double width) {
        super(length, width);
    }
    public double getHigth() {
        return higth;
    }
    public void setHigth(double higth) {
        this.higth = higth;
    }

    public double volume(){
        return area()*higth;
    }

    public String toString(){
        return "矩形的面积是"+area()+" , 体积是"+volume();
    }
}

class TestVolume{
    public static void main(String[] args) {
        Volume volume = new Volume();
        Scanner sc = new Scanner(System.in);
        System.out.println("输入矩形的长");
        volume.setLength(sc.nextDouble());
        System.out.println("输入矩形的宽");
        volume.setWidth(sc.nextDouble());
        System.out.println("输入矩形的高");
        volume.setHigth(sc.nextDouble());
        System.out.println(volume.toString());
    }
}
