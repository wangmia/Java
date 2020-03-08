package four;

import java.util.Scanner;

/* 定义一个长度为10的整型数组，循环输入10个整数。 然后将输入一个整数，查找此整数，找到 输出下标，没找到给出提示。*/
public class F7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] number = new int[10];
        System.out.println("请输入十个整数");
        for(int i=0;i<10;i++){
            number[i] = sc.nextInt();
        }
        System.out.println("请输入要查找的数");
        int input = sc.nextInt();
        if(cha(input,number)==0){
            System.out.println("数组中没有该数");
        }

    }
    public static int cha(int input,int number[]){
        for(int i=0;i<10;i++){
            if(input==number[i]){
                System.out.println("该数下标为"+i);
                return 1;
            }
        }
        return 0;
    }
}
