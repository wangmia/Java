import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author WM
 * @date 2020/3/19 6:02 下午
 * 描述信息：9.有一个学生类Student   学生编号，学生姓名，现在对学生仓库做增删改查操作 学生每次被添加
 * 该学生的学号自加1   如 9527   9528  等等
 * 没做出来
 */
public class Student {
    private  int id = 9527; //学生编号
    private String name; //学生姓名

    public Student(int id ,String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student " +
                "id= " + id +
                ", name= " + name + '\n' ;
    }
}
class test{
    public static void main(String[] args) {
        List collection = new ArrayList();
        Scanner sc = new Scanner(System.in);

         // 增加学生
            for (int i = 0; i < 5; i++) {
            System.out.println("请输入学生的名字");
            String name = sc.nextLine();
            collection.add(new Student(9527+i,name));
        }
        // 输出学生
        for (Object obj:collection) {
            System.out.println(obj);
        }
        // 删除学生
        System.out.println("请输入三处学生的姓名");
            String name = sc.nextLine();
            collection.remove(1);

        // 查询学生
//        System.out.println("请输入查询学生的姓名");
//        System.out.println("该学生是第"+collection.indexOf(sc.nextLine())+"位学生");

//        System.out.println(collection.toString());

//
//        // 修改学生
//        System.out.println("请输入要修改的学生姓名");
//        String name = sc.nextLine();
//        int wei = collection.indexOf(name);
//        collection.remove(name);
//        System.out.println("请输入修改后的名字");
//        collection.add(wei,new Student(9527,sc.next()));
//
////        System.out.println(collection);















        List list = new ArrayList();
        list.add(new Student(1,"wang"));
        list.add(new Student(2,"miao"));
        list.add(new Student(3,"tian"));
        System.out.println(list);
        for (Object obj:list) {
            System.out.println(obj);
        }
        list.remove(1);
        for (Object obj:list) {
            System.out.println(obj);
        }
        System.out.println(list.indexO);

        System.out.println(list);



    }
}