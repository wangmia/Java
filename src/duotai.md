## 一、单选择题
```
1、编译Java Application 源程序文件将产生相应的字节码文件，这些字节码文件的扩展名为( B )。
    A. .java                      B. .class
    C. .html                      D. .exe
2、设 x = 1 , y = 2 , z = 3，则表达式 y＋＝z－－/＋＋x 的值是( A )。
    A. 3                         B. 3. 5
    C. 4                         D. 5
3、不允许作为类及类成员的访问控制符的是( C )。
    A. public                    B. private
    C. static                    D. protected
4、为AB类的一个无形式参数无返回值的方法method书写方法头，使得使用类名AB作为前缀就可以调用它，该方法头的形式为( A )。
    A. static void method( )                    B. public void method( )    
    C. final void method( )                     D. abstract void method( )
5、给定java 代码如下，编译运行后，输出结果是( C )(选择一项）。  
public class test { 
	static int i; 
	public int aMethod() { 
	  i++; 
	  return i; 
} 
	public static void main (String args[]) {    
        Test test=new Test() ;  
        test.aMethod () ; 
	System.out.println (test.aMethod()) ; 
} 
}        
  a) 0    b) 1   c) 2    d) 3      
6．设有定义语句“int a[]={66,88,99};”，则以下对此语句的叙述错误的是（ C ）
A．定义了一个名为a的一维数组      B．a数组有3个元素
C．a数组的元素的下标为1～3    　  D．数组中的每个元素是整数
7．设有定义“int[] a=new int[4];”则数组a的所有元素是（ B ）
A．a0、a1、a2、a3            B．a[0]、a[1]、a[2]、a[3]    
C．a[1]、a[2]、a[3]、a[4]    D．a[0]、a[1]、a[2]、a[3]、a[4]
8．下面哪个选项正确地声明了一个字符串数组 （ C ）
A．char[] str     B．char[][] str     C．String[] str      D．String[10] str
9、假设有这样的数组创建：int a[]={1,2,3,4,5,6,7};则该数组长度为 ( C )。
A．4   B．5  C．6  D．7
10、下列二维数组的创建中错误的是( D )。
A．int a[][]=new int[3][] ; 
B．int[][] a=new int[3][4] ;
C．int a[][]={{1,2},{3,4}} ;
D．int [][] a=new int[][];
11 方法内定义的变量（ B ）。
A．一定在方法内所有位置可见     B．可能在方法的局部位置可见
C．在方法外可以使用             D．在方法外可见
12 方法的形参（ A ）。
A．可以没有            B．至少有一个
C．必须定义多个形参     D．只能是简单变量
13 return语句（ D ）。
A．不能用来返回对象   B．只可以返回数值
C．方法都必须含有    D．一个方法中可以有多个
14．main()方法的返回值类型是( C )
A．boolean  B．int
C．void     D．static
15．编译并运行下面的程序，运行结果是（ A ）。
public class A{
   public static void main(String args[]){
      A a=new A();
      a.method(8);
   }
   void method(int i){
      System.out.println(“int:  ”+i);
   }
   void method(long i){
      System.out.println(“long:  ”+i);
   }
A．程序可以编译运行，输出结果为：“int:  8”    
B．程序可以编译运行，输出结果为：“long:  8”    
C．程序有编译错误，因为两个method()方法必须定义为静态（static）的
D．程序可以编译运行，但是没有输出
16．能作为类及其成员的修饰符是（ D ）。
A．interface     B．class
C．protected     D．public
17．下列方法定义中，方法头不正确的是（ A ）。
A．public static x(double a){…}   
B．public static int x(double y){…}
C．void x(double d){…}            
D．public int x(){…}
18．构造方法在（ D ）时被调用。
A．类定义时          B．使用对象的变量时
C．调用对象方法时     D．创建对象时
19．下列哪个类声明是正确的（ D ）。
A．public abstract class Car{…} 
B．abstract private move(){…}
C．protected private number;    
D．abstract final class H1{…}
20．下列不属于面向对象程序设计的基本特征的是（ D ）。
A．抽象     B．封装
C．继承     D．静态
21．请看下面的程序
class Person{
 	String name,department;
	int age;
	public Person(String n){name=n;}
	public Person(String n,int a){name=n; age=a;}
	public Person(String n, String d, int a ){
	//doing the same as two arguments version if constructer
}
下面那个选项可以添加到// doing the same……处（   A ）
A．Person(n,a) 
B．this(Person(n,a))
C．this(n,a)//调用的是第二个有参构造函数
D．this(name.age)
22．请看下面的程序段
class Test{
   private int m;
   public static void fun(){
   //some code
	}
}
方法fun()如何来访问变量m（  C   ）
A．将private int m 改成protected int m    B．将private int m 改成public int m
C．将private int m 改成static int m       D．将private int m 改成int m  
24.有一个类A，对于其构造函数的声明正确的是（ B ）。
A．void A(int x){…}  B．public A(int x){…}
C．A A(int x){…}     D．int A(int x){…}
25．请看下面的程序段
public class Test{
  long a[]=new long[10];
  pubic static void main(String args[]){
	System.out.println(a[6]);
}
}
哪一个选项是正确的（  B  ）。
A．不输出任何内容      	B．输出0
C．当编译时有错误出现    	D．当运行时有错误出现  
26关键字（ B ）表明一个对象或变量在初始化后不能修改。
A．extends      B．final
C．this     	D．finalize
27．声明为static的方法不能访问（ C ）类成员。
A．超类         	B．子类
C．非static     	D．用户自定义类
28．定义类A如下：（重要）
class A{
  int a,b,c;
  public void B(int x,int y, int z){ 
	a=x;b=y;c=z;
	}
}
下面对方法B的重载哪个是正确的（ C ）。
A．public void A(int x1,int y1, int z1){ a=x1;b=y1;c=z1;}
B．public void B(int x1,int y1, int z1){ a=x1;b=y1;c=z1;}
C．public void B(int x,int y){ a=x;b=y;c=0;}     
D．public B(int x,int y, int z){ a=x;b=y;c=z;}
29．编译运行下面的程序，结果是（ B ）。（重要）
public class A{
  public static void main(String args[]){
		B b=new B();
		b.test();
}
  void test(){
	System.out.print(“A”);
  }
}
class B extends A{
  void test(){
	super.test();
	System.out.print(“B”);
  }
}
A．产生编译错误    			   B．代码可以编译运行，并输出结果：AB
C．代码可以编译运行，但没有输出     D．编译没有错误，但会产生运行时异常
30．已知类关系如下：
Class Employee{}
Class Manager extends Employee{}
Class Director extends Employee{}
则下列语句正确的是：（ A ）。
A．Employee e=new  Manager();   
B．Director d=new  Manager();
C．Director d =new  Employee ();  
D．Manager m=new  Director ();
31．接口是Java面向对象的实现机制之一，以下说法正确的是（ B ）。
A．Java支持多重继承，一个类可以实现多个接口
B．Java只支持单重继承，一个类可以实现多个接口
C．Java只支持单重继承，一个类可以实现一个接口  
D．Java支持多重继承，但一个类只可以实现一个接口
32．下列方法的声明中不合法的是( C )
A．float area( ){…}
B．void area( ){…} 
C．area{…}
D．int area(int r){…}
33、下面哪个包是编程时不需要导入就可以直接使用的( B )
A．java.net
B．java.lang
C．java.sql
D．java.util
34、调用构造方法是在( B )
A．类定义时　　　　　　B．创建对象时
C．调用对象的方法时　　D．使用对象的变量时
35、在子类构造方法的哪个地方可以调用其父类的构造方法( B )
A．任何地方
B．构造方法的第一条语句 
C．构造方法的最后一条语句 
D．无法在子类构造方法中调用父类的构造方法
36、关于Java中的继承，下列说法错误的是( D )
A．继承是面向对象编程的核心特征，通过继承可以更有效地组织程序结构。
B．继承使得程序员可以在原有类的基础上很快设计出一个功能更强的新类，而不必从头开始，避免了工作上的重复。
C．每一次继承时，子类都会自动拥有父类的属性和方法，同时也可以加入自己的一些特性，使得它更具体、功能更强大。
D．继承一般有多重继承和单一继承两种方式，在单一继承中每一个类最多只有一个父类，而多重继承则可以有多个父类。Java中的类都采用多重继承。
37、当方法中的局部变量与成员变量同名时，必须使用下列哪一个关键字指出成员变量( C )
A．static
B．super
C．this
D．new
38、什么样的方法不能被重写( B )
A．私有（private）方法
B．最终（final）方法
C．受保护（protected）的方法
D．以上都不对
39、下列程序运行的结果是( A )
interface InterfaceA{
	String s="good ";
	void f();
}
class ClassA implements InterfaceA{
 public void f(){
	System.out.print(s);
}
}
class ClassB{
void g(InterfaceA a){
a.f();
}
}
public class E {
	public static void main(String[] args) {
		ClassB b=new ClassB();
		b.g(new ClassA());
	}
}
A．good 
B．编译正确，但无运行结果
C．编译错误：b.g(new ClassA())
D．以上都不对
40、下列类的声明中不合法的是( A )
A．class People（）{…}
B．class 植物{…} 
C．class A{…}
D．public class 共有类{…}
41、能作为类的修饰符, 也能作为类成员的修饰符的是( A )
A．public 
B．extends
C．Float
D．static
42、试完成下述程序片段( B )
public class Point{
	int x,y;
	public  Point(int x,int y){
	(   )=x; 
	(   )=y;
  }
      ...... 
}
A．Point.x   Point.y  B．this.x   this.y
C．super.x  super.y   D．无解
43、在JAVA 中，下列说法正确的是：( C )
A．一个子类可以有多个父类，一个父类也可以有多个子类
B．一个子类可以有多个父类，但一个父类只可以有一个子类
C．一个子类只可以有一个父类，但一个父类可以有多个子类
D．上述说法都不对
44、Father和Son是两个java类，下列哪一选项正确的标识出Father是Son的父类( D )  
A．class Son implements Father
B．class Father implements Son
C．class Father extends Son
D．class Son extends Father 
45、重载指的是方法具有相同的名字，但这些方法的参数必须不同。下列哪种说法不属于方法参数的不同( D )
A．形式参数的个数不同。
B．形式参数的类型不同。
C．形式参数的名字不同。
D．形式参数类型的排列顺序不同。
46、下列有关抽象类与接口的叙述中正确的是哪一个（ C ）
A．抽象类中必须有抽象方法，接口中也必须有抽象方法
B．抽象类中可以有非抽象方法，接口中也可以有非抽象方法
C．含有抽象方法的类必须是抽象类，接口中的方法必须是抽象方法
D．抽象类中的变量定义时必须初始化，而接口中不是
47、从下列程序中你发现了几处错误( C )
abstract class A{
	abstract void f() {} ;      // 多{}
  	public abstract void k();
}
class B extends A{
	protected void f(){    }
	void k(){       // 少public 
		System.out.print("I am subclass");
}
public static void main(String[] args) {
	A a=new A();    // 不能创建抽象类对象
	a.f();
    a.k();
	}
}
A．1   B．2     C．3      D．4
48、关于接口的定义和实现，以下描述正确的是( A )
A．接口定义的方法只有定义没有实现
B．接口定义中的变量都必须写明final和static
C．如果一个接口由多个类来实现，则这些类在实现该接口中的方法时采用统一的代码
D．如果一个类实现接口，则必须实现该接口中的所有方法，但方法未必申明为public
49.char类型的整数范围是（ C ）
A. 0 ... 32767 
B. 0 ... 65535 
C. –256 ... 255 
D. –32768 ... 32767 
50.以下程序正确的输出是（ A ）
public class FatherClass {
	public FatherClass() {
		System.out.println("FatherClass Create");
    }
}
public class ChildClass extends FatherClass {
    public ChildClass() {
       System.out.println("ChildClass Create");
	}
    public static void main(String[] args) {
       FatherClass fc = new FatherClass();
       ChildClass cc = new ChildClass();
   	}
}
先调用父类在调用本类
    A.FatherClass Create
      FatherClass Create
      ChildClass Create
 
    B.FatherClass Create
      ChildClass Create
      FatherClass Create
 
    C.ChildClass Create
     ChildClass Create
     FatherClass Create
 
    D.ChildClass Create
      FatherClass Create
      FatherClass Create
```
## 二、填空题
```
1．如果一个方法不返回任何值，则该方法的返回值类型为( void )。
2．如果子类中的某个方法名、返回值类型和( 参数列表 )与父类中的某个方法完全一致，则称子类中的这个方法覆盖了父类的同名方法。
3．接口中所有的属性均为( 静态的 )、( 抽象的 )和( 公共的 )的
4．( 抽象方法  )方法是一种仅有方法声明，没有具体方法体和操作实现的方法，该方法必须在( 抽象类 )类之中定义。
5．在Java程序中，通过类的定义只能实现( 单重 )继承，但通过( 接口 )的定义可以实现多重继承关系。
```
## 三、简答题
```
1、什么是继承？
答：继承就是根据已有的类创建新的类，新的类可以调用原有的类的成员，也可以根据需求定义新的成员，这样可以减少代码的复用。

2、请简述重载和重写的区别？
答：重载是操作与构造方法的调用相同方法名但参数列表不同的方法，
重写是方法是重新书写这个方法，方法名和方法的返回值以及方法的参数列表都相同。

3.抽象类和接口的区别
答：1.抽象类要被子类继承，接口要被类实现。
    2.接口只能做方法声明，抽象类中可以作方法声明，也可以做方法实现。
    3.接口里定义的变量只能是公共的静态的常量，抽象类中的变量是普通变量。
    4.接口是设计的结果，抽象类是重构的结果。
    5.抽象类和接口都是用来抽象具体对象的，但是接口的抽象级别最高。
    6.抽象类可以有具体的方法和属性，接口只能有抽象方法和不可变常量。
    7.抽象类主要用来抽象类别，接口主要用来抽象功能。
    
4.分别解释一下this,super,final,static 关键字 越详细越好
答：1.this.指向当前对象，也就是当前类中创建的成员变量
    2.super. 指向的是父类的成员变量，super() 在子类的构造函数中用于指向父类的构造函数
    3.被final修饰的对象不能被更改
    4.static是静态的意思，被它修饰的成员是可以被所有的类成员所共享的，但static修饰的方法再掉用其他成员及方法时只能调用同为static修饰的成员和方法，static修饰的成员属于类不属于任何对象。
    
5.什么是类？什么是对象？类和对象有何联系？
答：对象可以当做一样物体，而类就是物体本身具有的特征的集合，可以说类就是一个建造对象模具，而对象就是类的实体化显现

6.方法的重载和方法的覆盖有什么不同？
答：方法重载是操作与构造方法的调用相同方法名但参数列表不同的方法，
方法重写是方法是重新书写这个方法，方法名和方法的返回值以及方法的参数列表都相同。

7.类变量和实例变量有何区别？
答：类变量是静态变量，在其他类中调用时可以直接调用，而实例变量需要创建对象引用，改变实例变量的值其他对象再调用该变量，变量的初始值不会改变，而类变量是被所有类共享的，它的值被改变，其他变量在调用的值以是改变后的值了。

8.Java的成员变量修饰符有哪几种？(写出吴中)其中哪种修饰符限定的范围最大？
答：1.public 公共的它的权限最大，他所修饰成员在所有类、包中都可以被改变
    2.protected 受保护的，它所修饰的成员在所在保重的类都可变
    3.private 私有的，它所修饰的成员只能在本类中改变
    4.static 静态的，他所修饰的成员可以被同包内所有的改变
    5.final 终极的，他所修饰的成员不可以被任何类改变
9.说明对象的基本概念和主要特征？
答：对象是类的实例，对象的特征主要有对象的行为，也就是对象应用的方法，对象的状态，就是调用方法时对象的相应，对象的唯一标识，用于区分对象之间的不同状态
```
