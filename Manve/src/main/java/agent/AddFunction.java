package agent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author WM
 * @date 2020/3/30 7:42 下午
 * 描述信息：2.使用jdk给指定的程序添加额外的功能
 *      学生张三 不愿意写作业 威胁小明给他抄作业 为小明添加一个向老师告状的方法
 */
public class AddFunction {
    public static void main(String[] args) {
        Student student = new StudentImp();
        Plagiarism<Student> plagiarism = new Plagiarism<>(student);

        //返回目标类对象....
        Student obj=(Student) Proxy.newProxyInstance(student.getClass().getClassLoader(),
                new Class<?>[] { Student.class },plagiarism);

        obj.writeHomework("张三",false);
    }
}

interface Student{
    // 写作业方法
    public String writeHomework(String name,boolean a);
}

class StudentImp implements Student{
    @Override
    public String writeHomework(String name,boolean a) {
        if(a){
            System.out.println(name+"作业做完了，可以休息了");
            return "明天可以直接上学啦。。。";
        }else{
            System.out.println(name+"觉得作业太多了，不做了");
            return "明天去学校抄抄作业吧。。。";
        }
    }
}

class Plagiarism<T> implements InvocationHandler {
    T t;

    public Plagiarism(T t) {
        this.t = t;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = method.invoke(t,args);
        System.out.println("你成功威胁了小明，他在帮你抄作业");
        // 新增方法，小明会告状了
        complain();
        return obj;
    }

    // 告状方法
    public String complain(){
        System.out.println("小明向老师打小报告说你威胁他");
        return "老师批评了你";
    }

}