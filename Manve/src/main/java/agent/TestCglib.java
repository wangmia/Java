package agent;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author WM
 * @date 2020/3/30 5:20 下午
 * 描述信息：1.cglib 动态代理 上传到git 明天检查 找出 jdk 动态代理和 cglib 动态代理的不同
 */
public class TestCglib {
    /**
     * jdk 动态代理是利用反射机制生成一个实现代理接口的匿名类，在调用具体方法前调用InvokeHandler来处理。
     * cglib 动态代理是利用asm开源包，对代理对象类的class文件加载进来，通过修改其字节码生成子类来处理。
     *          ams 自动存储管理 可以是直接通过字节码来修改class文件
     *
     * 1、如果目标对象实现了接口，默认情况下会采用JDK的动态代理实现AOP
     * 2、如果目标对象实现了接口，可以强制使用cglib实现AOP
     * 3、如果目标对象没有实现了接口，必须采用cglib库，spring会自动在JDK动态代理和cglib之间转换
     *
     * JDK动态代理和CGLIB字节码生成的区别？
     *  （1）JDK动态代理只能对实现了接口的类生成代理，而不能针对类
     *  （2）CGLIB是针对类实现代理，主要是对指定的类生成一个子类，覆盖其中的方法，因为是继承，所以该类或方法最好不要声明成final
     *
     */
    public static void main(String[] args) {
        //在制定文件夹file中生成动态代理类，我们可以反编译看一下里面到底是一些什么东西
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "file");

        //创建Enhancer对象，类似于JDK动态代理的Proxy类，下一步就是设置几个参数
        Enhancer enhancer = new Enhancer();
        //设置目标类的字节码文件
        enhancer.setSuperclass(Dog.class);
        //设置回调函数
        enhancer.setCallback(new MyMethodInterceptor());

        //这里的creat方法就是正式创建代理类
        Dog proxyDog = (Dog)enhancer.create();
        //调用代理类的eat方法
        proxyDog.eat();
    }
}
class Dog{
    final public void run(String name) {
        System.out.println("狗"+name+"----run");
    }

    public void eat() {
        System.out.println("狗----eat");
    }
}

class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("狗受伤了。。。");
        //注意这里的方法调用，不是用反射
        Object object = proxy.invokeSuper(obj, args);
        return object;
    }
}