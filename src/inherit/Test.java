package inherit;

/**
 * @author WM
 * @date 2020/3/11 7:31 下午
 * 描述信息：
 */
public class lianxi {

}
/* 第二题 */
class A {
    int i = 1;
    void print() {
        System.out.println(i);
    }
}
class B extends A {

    static int i = 2;

//    public static void main(String[] args) {
//        B b = new B();
//        b.print();
//    }
}

//  结果为1

/* 第三题 */
class Test {
//    public static void main(String[] args) {
//        new Circle();
//    }
}
class Draw {
    public Draw(String type) {
        System.out.println(type+" draw constructor");
    }
}
class Shape {
    private Draw draw = new Draw("shape");
    public Shape(){
        System.out.println("shape constructor");
    }
}
class Circle extends Shape {
    private Draw draw = new Draw("circle");
    public Circle() {
        System.out.println("circle constructor");
    }
}

// 结果为：shape draw constructor
//        shape constructor
//        circle draw constructor        *
//        circle constructor

/* 第四题 */
class Test {
    public static void main(String[] args) {
        Shape shape = new Circle();
        System.out.println(shape.name);
        shape.printType();
        shape.printName();
    }
}
class Shape {
    public String name = "shape";
    public Shape(){
        System.out.println("shape constructor");
    }
    public void printType() {
        System.out.println("this is shape");
    }
    public static void printName() {
        System.out.println("shape");
    }
}
class Circle extends Shape {
    public String name = "circle";
    public Circle() {
        System.out.println("circle constructor");
    }
    public void printType() {
        System.out.println("this is circle");
    }
    public static void printName() {
        System.out.println("circle");
    }
}
