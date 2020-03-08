package three;

import java.util.Scanner;

/* 请输入一个任意年份,判断是否是闰年 */
public class T5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%400==0||(year%4==0&&year%100!=0)){
            System.out.println("是闰年");
        }else{
            System.out.println("不是闰年");
        }
    }
}
