package four;

import java.util.Scanner;

/* 2:数据加密问题
		某个公司采用公用电话传递数据信息，数据是小于8位的整数(默认8位)，为了确保安全，
		在传递过程中需要加密，加密规则如下：
			首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字， 87654321   8+5=13%10=3
			最后将第一位和最后一位数字交换。 请任意给定一个小于8位的整数，
			然后，把加密后的结果在控制台打印出来 */
public class Fi2 {
    public statie void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] number = new int[8];
        System.out.println("请输入数据");
        for(int i=0;i<8;i++){
            number[i] = sc.nextInt();
        }
        for(int i=0;i<8;i++){
             number[i] += 5;
             number[i] = number[i]%10;
        }
        int temp=0;
        temp = number[0];
        number[0] = number[7];
        number[7] = temp;
        System.out.println("密码输出为");
        for(int i=7;i>=0;i--){
            System.out.print(number[i]);
        }
    }
}
