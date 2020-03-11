package four;

import java.util.Scanner;

/* 1.任意输入 n行 n列的乘法口诀表 */
public class F1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行列数");
        int input = sc.nextInt();
        for(int i=1;i<input;i++){
            for(int j=1;j<input;j++){
                System.out.print(i+"*"+j+"="+(i*j)+" ");
            }
            System.out.println();
        }
    }
}
