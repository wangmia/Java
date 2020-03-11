
package statie;

import java.util.Scanner;

/**
 * @author WM
 * @date 2020/3/10 11:32 下午
 * 描述信息：其中一个学生（有6个）登录账号进行考试,在控制台随机显示10个题目,并且输入题目的正确答案才会有分数,
 * 每题10分,现在有30个题目(题目自己出,不做要求)。
 * 求学生考完试在控制台最终得到的分数
 * 没做完
 */
public class TestStudent {
    public static void main(String[] args) {
        Scanner  sc= new Scanner(System.in);
        System.out.println("请输入学号:");
        String   number=sc.next();
        System.out.println("请输入姓名:");
        String   name=sc.next();
        boolean   flag=Util.login(name, number);
        if(flag){
            Util.exam();
            int   score=0;
            for (int i = 0; i <Util.question_index.length; i++) {
                //显示随机出来的题目
                System.out.println(Util.questions[Util.question_index[i]].toString());
                System.out.println("请输入您的答案:");
                String   an=sc.next();
                if(an.equals(Util.questions[Util.question_index[i]].getAnwwser())){
                    score+=10;
                }
            }
            //把得到的分数塞进学生对象
            for (int i = 0; i < Util.students.length; i++) {
                if(Util.students[i].getStuName().equals(name)){
                    Util.students[i].setStuScore(score);
                }
            }

            for (int i = 0; i < Util.students.length; i++) {
                System.out.println(Util.students[i].toString());
            }

        }else{
            System.out.println("学习号与姓名不匹配");
        }



//        String [] ti = new String[30];
//        Scanner sc = new Scanner(System.in);
//        // 答案
//        String [] an = {"A","B","C","D"};
//        int a = 0;
//        Questions [] qus = new Questions[7];
//        for (int i = 0; i < qus.length; i++) {
//            Questions questions = new Questions();
//            questions.setTitle(i+"题");
//            questions.setNumber(i);
//            questions.setAnwwser(an[a]);
//            a++;
//            if(a==4){
//                a = 0;
//            }
//            qus[i] = questions;
//        }
//        Student [] stu = new Student[6];
//        a = 0;
//        // 学生的成绩
//        int che = 0;
//        for(int i=0;i<stu.length;i++){
//            Student student = new Student();
//            System.out.println("输入姓名");
//            student.setStuName(sc.next());
//            System.out.println("输入账号");
//            student.setStuNum(sc.nextInt());
//            System.out.println("欢迎登入系统");
//            System.out.println("--开始答题，共10题，每题1分--");
//            // 运算成绩和输出题目
//            for(int j=0;j<10;j++){
//                System.out.println(qus[a].toQustions());
//                System.out.println(qus[a].getNumber());
//                // 学生输入的选项
//                String xuan = sc.next();
//                student.setXuanxiang(xuan);
//                che += qus[a].bijiao(xuan);
//                student.setStuScore(che);
//                a++;
//                if(a==6){
//                    a=0;
//                }
//            }
//            stu[i] = student;
//            System.out.println(stu[i].getStuName()+"最终成绩为"+stu[i].getStuScore());
//        }

    }
}


