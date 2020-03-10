package three;

import java.util.Scanner;

/* 输入一个正整数，将该数的各位左右反转输出，即输入123，输出321。（使用while循环实现）*/
public class T7 {
    public statie void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数");
        int input = sc.nextInt();
        int c = 0;
        while(input>0){
            System.out.print(input%10);
            input=input/10;
        }
    }
}
