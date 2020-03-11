package four;

import java.util.Scanner;

/*  声明一个int型的数组，循环接收8个学生的成绩，计算这8个学生的总分及平均分、最高分和最低分 */
public class F6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] student = new int[8];
        for(int i=0;i<8;i++){
            System.out.println("输入第"+(i+1)+"个学生的成绩");
            student[i] = sc.nextInt();
        }
        int sum = 0;
        int max = student[0];
        int min = student[0];
        for(int i=0;i<8;i++){
            sum += student[i];
            if(max<student[i]){
                max = student[i];
            }
            if(min>student[i]){
                min = student[i];
            }
        }
        double avg = sum/10.0;
        System.out.println("学生的总分是"+sum+" ,平均分是"+avg+" ,最高分是"+max+" ,最低分是"+min);
    }
}
