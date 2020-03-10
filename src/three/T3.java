package three;

import java.util.Scanner;

/* 3.输入一批整数，使用循环求出最大值与最小值，输入0时结束。 */
public class T3 {
    public statie void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] number = new int[50];
        number[0] = 1;
        int n = 0;

        for(int i=0;i<50;i++){
            System.out.println("请输第"+(i+1)+"个数据，按0结束");
            number[i] = sc.nextInt();
            if(number[i]==0){
                break;
            }
            n++;
        }

        // 最小值
        for(int i=1;i<n;i++){
            if(number[0]>number[i]){
                int temp = number[i];
                number[0] = number[i];
                number[i] = temp;
            }
        }
        System.out.println("最小值"+number[0]);
        // 最大值
        for(int i=n-2;i>=0;i--){
            if(number[n-1]<number[i]){
                int temp = number[i];
                number[i] = number[n-1];
                number[n-1] = temp;
            }
        }
        System.out.println("最大值"+number[n-1]);

    }
}
