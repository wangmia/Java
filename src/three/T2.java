package three;
import java.util.Scanner;

/**
 *  2.从键盘输入某个十进制整数数，转换成对应的二进制整数并输出。
 *  先判断正负，然后除二取余存于数组，最后输出
 *  */
public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 存储整数除以二的余数
        int [] yu = new int[32];
        // 记录循环的次数
        int n=0;
        // 记录数是否是负数,为0则正，为1则负
        int fu = 0;
        System.out.println("请输入一个数");
        int number = sc.nextInt();
        if(number<0){
            number = -number;
            fu = 1;
        }
        int j=0;
        while(number>=1){
            if(number>=1){
                yu[j]=number%2;
                number /= 2;
                n++;
            }
        }

        if(n!=0){
            System.out.println("二进制为");
            if(fu==1) {
                for (int i = 32; i > n - 1; i--) {
                    System.out.print(1);
                }
            }
            for(int i=0;i<=n-1;i++){
                System.out.print(yu[i]);
            }
        }else{
            System.out.println("二进制为0");
        }

    }
}
