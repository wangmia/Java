package three;

import java.util.Scanner;

/* 1.从键盘输入一个班5个学生的分数，求和并输出 */
public class T1 {
    public static void main(String[] args) {
        int [] student = new int[5];
        int sum=0;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("请输入"+(i+1)+"个数：");
            student[i] = sc.nextInt();
            sum += student[i];
        }
        System.out.println("5个学生的总分是"+sum);
    }
}
