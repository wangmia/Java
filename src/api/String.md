## 作业2: String  StringBuffer  StringBuilder   总结   
* 调用方式
1. 直接调用里面的方法
字符串名.方法名();  
如定义好的String变量可调用：  
 sst.indexOf();     
2. 创建对象
StringBuffer/StringBuilder 对象名 = new StringBuffer()/StringBuilder();
然后 对象吗.方法名();  
* 区别  
1. 可变与不可变  
String 定义的值 不可变  
StringBuffer和StringBuilder 定义的是值 可变的  
2. 线程安全  
String因为是不可变的所以线程安全  
AbstractStringBuilder是StringBuilder与StringBuffer的公共父类，定义了一些字符串的基本操作，
如expandCapacity、append、insert、indexOf等公共方法。  
StringBuffer 比 StringBuilder 更安全，因为StringBuffer为方法加了同步锁，而StringBuilder
并没有，所以说它是非线程安全。
* 相同的  
StringBuilder与StringBuffer有公共父类AbstractStringBuilder(抽象类)。  
StringBuilder、StringBuffer的方法都会调用AbstractStringBuilder中的公共方法，
只是StringBuffer会在方法上加synchronized关键字，进行同步。  
* 建议
如果操作少量的数据应用String  
如果程序是多线程的应用StringBuffer它的安全性高于StringBuilder  
如果程序是单线程的应用StringBuilder它的执行效率更高