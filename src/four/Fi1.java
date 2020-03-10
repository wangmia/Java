package four;

import java.util.Scanner;

/**
 * 1.你的程序要读入一系列正整数数据，输入-1表示输入结束，-1本身不是输入的数据。程序输出读到的数据中的奇数和偶数的个数。
 * 	输入格式:一系列正整数，整数的范围是（0,100000）。如果输入-1则表示输入结束。
 * 	输出格式：两个整数，第一个整数表示读入数据中的奇数的个数，第二个整数表示读入数据中的偶数的个数。两个整数之间以空格分隔。
 */
public class Fi1 {
    public statie void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] number = new int[100000];
        int n=0;
        System.out.println("请输入0~10000的整数");
        for(int i=0;i<=100000;i++){
            int input = sc.nextInt();
            if(input==-1){
                break;
            }
            number[i] = input;
            n++;
        }
        int o = 0;  // 偶数
        int j = 0;  // 奇数
        for(int i=0;i<n;i++){
            if(number[i]%2==0){
                o++;
            }else{
                j++;
            }
        }
        System.out.println(j+" "+o);
    }
}
