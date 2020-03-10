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
        String [] ti = new String[30];
        Scanner sc = new Scanner(System.in);
        // 答案
        String [] an = {"a","b","c","d"};
        int a = 0;
        Questions [] qus = new Questions[30];
        for (int i = 0; i < qus.length; i++) {
            qus[i].setTitle(i+"题");
            qus[i].setAnwserA("a");
            qus[i].setAnwserB("b");
            qus[i].setAnwserC("c");
            qus[i].setAnwserD("d");
            qus[i].setAnwwser(an[a]);
            a++;
            if(a==3){
                a = 0;
            }
        }

        Student [] stu = new Student[6];
        for(int i=0;i<stu.length;i++){
            System.out.println("输入姓名");
            stu[i].setStuName(sc.next());
            System.out.println("输入账号");
            stu[i].setStuNum(sc.nextInt());
            qus[a].toQustions();
            a++;
            if(a==29){
                a=0;
            }

        }

    }
}
