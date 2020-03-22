import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * @author WM
 * @date 2020/3/21 7:34 下午
 * 描述信息：
 *
 * 要求：1.学生类,学生编号,学生姓名,学生密码,学生成绩
 * 2.试题类：试题编号（自增长）,试题名称,试题选项（四个 A B C D）,试题答案
 * 3.现有两个数据存储容器,存储学生和存储考试试题,学生需要登录考试系统才能进行考试,每答对一题加十分,如果答错没有分
 * 现在有一个学生进行考试,请在控制台输出这个学生的考试成绩
 *
 *               id          pass
 *      student(11010,"李四",123456,0);
 *      Student(11011,"李四",654321,0);
 *      Student(11012,"王五",134680,0);
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 设置试卷的数量
        int STU = 5;
        // 学生数量
        int XUE = 3;
        Examination examination = new Examination();
//        Student student = new Student();

        for(int i=0;i<XUE;i++){

                System.out.println("欢迎使用学生考试管理系统");
                System.out.println("请输入学号");
                String id = sc.next();
                System.out.println("请输入密码");
                String password = sc.next();
                //判断密码和学号的匹配
                int p = examination.verIFraction(id,password);
                // 匹配执行代码不匹配执行错误信息
                if(p==1){

                    List link = new ArrayList();
                    // 初始化试卷
                    link = examination.Issue(STU);

                    // 获取学生的答案
                    String [] stu_Answer = new String[STU];
                    int j = 0;
                    for (Object obj:link) {
                        System.out.println(obj.toString());
                        System.out.println("你的选择是");
                        stu_Answer[j]=sc.next();
                        j++;
                    }
                    // 获取成绩
                    int result = examination.fraction(link,stu_Answer);
                    System.out.println("你的成绩为"+result);
                    System.out.println("学生最终信息为"+examination.stuInformation(result,id));
                }else{
                    System.out.println("学号或密码错误，请重新输入");
                    i--;
                }
                System.out.println("-----------------------------");
        }
    }
}
