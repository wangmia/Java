// 循环输入10个数(50以内),统计每个数出现的次数
// 未做完
import java.util.Scanner;
class JiShu {
    public static void main(String[] args) {
        int [] number = new int[10];
              
        Scanner input = new Scanner(System.in);
        System.out.println("请输入十个数");
        for (int i = 0; i < 10; i++) {
            int id = input.nextInt();
            number[i] = id;
        }
        for (int i = 0; i < 10; i++) {
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
        System.out.println("------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(number[i]);
        }
        System.out.println("------------");
        int i = 0;
        int num = 1;
        while (i<9) {
            
            if (number[i] == number[i + 1]) {
                num++;
            } else {
                 
                    System.out.println(number[i] + "出现了" + num + "次");
                
                num = 1;
            }
            
            if (i == 8) {
                    System.out.println(number[i] + "出现了" + num + "次");
                }
            i++;
        }



        // for (int i = 0; i < 10; i++) {
        //     System.out.println(number[i]);
        // }

    }
}
