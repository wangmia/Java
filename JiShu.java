// 循环输入10个数(50以内),统计每个数出现的次数
// 未做完
import java.util.Scanner;
class JiShu {
    public static void main(String[] args) {
        int [] number = new int[10];
        int [] shu = new int[10];
        int x = 1;
        shu[0] = 51;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入十个数");
        for (int i = 0; i < 10; i++) {
            int id = input.nextInt();
            number[i] = id;
        }
        for (int i = 0; i < 10; i++) {
            if (shu[0] != number[i]) {
                for (int j = i + 1; j < 10; j++) {
                    if (number[i] == number[j]) {
                        i++;
                        int temp;
                        temp = number[i];
                        number[i] = number[j];
                        number[j] = temp;
                        i--;
                    }

                }
            }

            shu[0] = number[i];
        }

        // for(int i=0;i<10;i++){
        // 	System.out.println(shu[i]);
        // }

    }
}
