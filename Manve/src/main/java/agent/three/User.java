package agent.three;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WM
 * @date 2020/3/31 8:38 下午
 * 描述信息：1.分别写出一个静态代理和动态代理案例,并且对比一下两者的不同
 *                   静态代理
 *           -------------------------
 *   按照代理的创建时期，代理类可以分为两种：
 *   静态：由程序员创建代理类或特定工具自动生成源代码再对其编译。在程序运行前代理类的.class文件就已经存在了。
 *   动态：在程序运行时运用反射机制动态创建而成。
 */
public interface User {
    public void addUser(String userId, String userName);

    public String findUser(String userId);
}
class UserImpl implements User {
    @Override
    public void addUser(String userId, String userName) {
        System.out.println("UserManagerImpl.addUser");
    }

    @Override
    public String findUser(String userId) {
        System.out.println("UserManagerImpl.findUser");
        return "张三";
    }
}
class UserImplProxy implements User {

    // 目标对象
    private User user;
    // 通过构造方法传入目标对象
    public UserImplProxy(User user){
        this.user=user;
    }
    // 存储对象
    List list = new ArrayList<>();
    @Override
    public void addUser(String userId, String userName) {
        try{
            System.out.println("开始添加用户");
            user.addUser(userId, userName);
            list.add(userId);
            list.add(userName);
            System.out.println("添加用户成功");
        }catch(Exception e){
            System.out.println("添加用户失败");
        }
    }

    @Override
    public String findUser(String userId) {
        System.out.println("查找结果为");
        int i = list.indexOf(userId);
        return (String)list.get(i+1);
    }
}
class TestUser{
    public static void main(String[] args){
        User userManager=new UserImplProxy(new UserImpl());
        userManager.addUser("1111", "张三");
        System.out.println(userManager.findUser("1111"));
    }
}

/**
 *  总结：创建步骤
 *  1.现有一个借口，写要实现的方法
 *  2.写一个实现了方法的类    委托类
 *  3.代理类 实现接口 重写接口方法 ，新建一个代理方成员，用构造方法导入
 *  4.测试类   用接口接受一个代理类，调用里面的方法
 *
 *  总结：静态代理的优点
 *  代理使客户端不需要知道实现类是什么，怎么做的，而客户端只需知道代理即可（解耦合）
 *       静态代理的缺点
 *  代理类和委托类实现同一个接口，这样代码的重复率过高，增加了代码维护的复杂度
 *  静态代理类只能为特定的接口(Service)服务。如想要为多个接口服务则需要建立很多个代理类。
 * */