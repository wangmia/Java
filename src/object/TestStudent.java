package object;

import java.util.Scanner;

/**
 * @author WM
 * @date 2020/3/9 10:34 下午
 * 描述信息：测试成绩
 */
public class TestStudent {
    public statie void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 定义学生类数组
        Student [] st = new Student[3];
        // 录入学生数据
        for (int i = 0; i < st.length; i++) {
            Student student = new Student();
            System.out.println("请按顺序输入第一个学生的姓名、语文成绩、英语成绩、数学成绩、理科综合");
            student.setName(sc.next());
            student.setChineseResult(sc.nextDouble());
            student.setEnglishResult(sc.nextDouble());
            student.setMathResult(sc.nextDouble());
            student.setScienceResult(sc.nextDouble());
            st[i] = student;
        }
        // 记录平均分最大的人的平均分
        double avg_max = st[0].average();
        // 记录理科成绩最高的人的成绩
        double sc_max = st[0].getScienceResult();
        // 记录平均值最大人的下标
        int avg_id = 0;
        // 记录理科最高人的下标
        int sc_id = 0;

        for (int i = 1; i <st.length ; i++) {
            // 判断平均分最大的人
            if(avg_max < st[i].average()){
                avg_max = st[i].average();
                avg_id = i;
            }
            // 判断理科分最高的人
            if(sc_max < st[i].average()){
                sc_max = st[i].average();
                sc_id = i;
            }
        }

        System.out.println("平均分最大的人的信息如下\n"+st[avg_id].toSting());
        System.out.println("理科综合分最高的人是："+st[sc_id].getName()+"，成绩是："+st[sc_id].getScienceResult());

    }
}
