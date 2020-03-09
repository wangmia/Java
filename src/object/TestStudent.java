package object;

import java.util.Scanner;

/**
 * @author WM
 * @date 2020/3/9 10:34 下午
 * 描述信息：测试成绩
 * 写不下去了，不会
 */
public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double avg1,avg2,avg3,avg4,avg5;
        Student student1 = new Student();
        System.out.println("请按顺序输入第一个学生的姓名、语文成绩、英语成绩、数学成绩、理科综合");
        student1.setName(sc.nextLine());
        student1.setChineseResult(sc.nextDouble());
        student1.setIfEnglishResult(sc.nextDouble());
        student1.setIfMathResult(sc.nextDouble());
        student1.setIfScienceResult(sc.nextDouble());
        avg1 = student1.average();

        Student student2 = new Student();
        System.out.println("请按顺序输入第二个学生的姓名、语文成绩、英语成绩、数学成绩、理科综合");
        student2.setName(sc.nextLine());
        student2.setChineseResult(sc.nextDouble());
        student2.setIfEnglishResult(sc.nextDouble());
        student2.setIfMathResult(sc.nextDouble());
        student2.setIfScienceResult(sc.nextDouble());
        avg2 = student2.average();

        Student student3 = new Student();
        System.out.println("请按顺序输入第三个学生的姓名、语文成绩、英语成绩、数学成绩、理科综合");
        student3.setName(sc.nextLine());
        student3.setChineseResult(sc.nextDouble());
        student3.setIfEnglishResult(sc.nextDouble());
        student3.setIfMathResult(sc.nextDouble());
        student3.setIfScienceResult(sc.nextDouble());
        avg3 = student3.average();

        Student student4 = new Student();
        System.out.println("请按顺序输入第四个学生的姓名、语文成绩、英语成绩、数学成绩、理科综合");
        student4.setName(sc.nextLine());
        student4.setChineseResult(sc.nextDouble());
        student4.setIfEnglishResult(sc.nextDouble());
        student4.setIfMathResult(sc.nextDouble());
        student4.setIfScienceResult(sc.nextDouble());
        avg4 = student4.average();

        Student student5 = new Student();
        System.out.println("请按顺序输入第五个学生的姓名、语文成绩、英语成绩、数学成绩、理科综合");
        student5.setName(sc.nextLine());
        student5.setChineseResult(sc.nextDouble());
        student5.setIfEnglishResult(sc.nextDouble());
        student5.setIfMathResult(sc.nextDouble());
        student5.setIfScienceResult(sc.nextDouble());
        avg5 = student5.average();

        // 求平均分最大的人
        int f = max(avg1,avg2,avg3,avg4,avg5);
        switch(f){
            case 1:
                System.out.println("平均分最高的是"+student1.toSting());
                break;
            case 2:
                System.out.println("平均分最高的是"+student2.toSting());
                break;
            case 3:
                System.out.println("平均分最高的是"+student3.toSting());
                break;
            case 4:
                System.out.println("平均分最高的是"+student4.toSting());
                break;
            case 5:
                System.out.println("平均分最高的是"+student5.toSting());
                break;
        }

        // 求理科分最高的人
        double l1 = student1.getScienceResult();
        double l2 = student2.getScienceResult();
        double l3 = student3.getScienceResult();
        double l4 = student4.getScienceResult();
        double l5 = student5.getScienceResult();

        int l = max(l1,l2,l3,l4,l5);

        switch(l){
            case 1:
                System.out.println("理科分最高的是"+student1.getName()+"成绩为"+student1.getScienceResult());
                break;
            case 2:
                System.out.println("理科分最高的是"+student2.getName()+"成绩为"+student2.getScienceResult());
                break;
            case 3:
                System.out.println("理科分最高的是"+student3.getName()+"成绩为"+student3.getScienceResult());
                break;
            case 4:
                System.out.println("理科分最高的是"+student4.getName()+"成绩为"+student4.getScienceResult());
                break;
            case 5:
                System.out.println("理科分最高的是"+student5.getName()+"成绩为"+student5.getScienceResult());
                break;
        }




    }
    // 求最大值
    public static int max(double max1,double max2,double max3,double max4,double max5){
        double max = max1;
        // 标记反回的数字
        int e=0;
        if(max>max2){
            max = max2;
        }
        if(max>max3){
            max = max3;
        }
        if(max>max4){
            max = max4;
        }
        if(max>max5){
            max = max5;
        }
        // 判断最大值是谁反悔进来的顺序
        if(max==max1){
            e = 1;
        }else if(max==max2){
            e = 2;
        }else if(max==max3){
            e = 3;
        }else if(max==max4){
            e = 4;
        }else if(max==max5){
            e = 5;
        }
        return e;
    }

}
