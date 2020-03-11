package three;

import java.util.Scanner;
import java.util.Random;

/* 6.30以内的随机数,请输入任意一个数,循环10次,求这个数在随机数范围内出现的次数 */
public class T6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int input = sc.nextInt();
        int n = 0;
        for(int i=0;i<10;i++){
            int shu = (int)(Math.random()*30+1);
            if(input==shu){
                n++;
            }
        }
        System.out.println(input+"在随机数里出现了"+n+"次");
    }
}
