/**
* 循环输入10个数(50以内),统计每个数出现的次数
* 第一种做法：接受十个数把它们排序(相同元素放到一起)，最后把不相同的地方输出元素和次数。
* 第二种做法：生成十个1~50随机数把它们减一当成数组下标运算，数和下标相等就把下标元素加一，输出时输出下标加一和数组能容。
*/
import java.util.Scanner;
import java.util.Random;
class JiShu {
    // 第一种做法
    public static void main(String[] args) {
        int [] number = new int[10];
        Scanner input = new Scanner(System.in);

        System.out.println("请输入50以内的十个数");
        for (int i = 0; i < 10; i++) {
            int id = input.nextInt();
            while(id>50){
            	System.out.println("输入错误，请输入50以内的数");
            	id = input.nextInt();
            }
            number[i] = id;
        }
        // 排序
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
        // 从0开始和下一个元素比较相同次数加一，不同就输出结果，最后i为8时结束，数组下标最高能取到9
        // 为8时判断数组下标比较结果，比较为真输出次数，为假次数不做+1，直接输出最后一个元素
        int i = 0;
        // 计数
        int num = 1;
        while (i < 9) {

            if (number[i] == number[i + 1]) {
                num++;
            } else {
                System.out.println(number[i] + "出现了" + num + "次");
                num = 1;
            }

            if (i == 8) {
                if (num == 1) {
                    System.out.println(number[i + 1] + "出现了" + num + "次");
                } else {
                    System.out.println(number[i] + "出现了" + num + "次");
                }
            }
            i++;
        }
        xu();
    }

    // 第二种方法
    public static void xu(){
    	int [] number = new int[50];
    	System.out.println("-------------------");
    	System.out.println("产生的1~50的十个随机数");
    	for(int i=0;i<10;i++){
    		// 创建1~50的随机数
    		int shu = (int)(Math.random()*50+1);

    		for(int j=0;j<50;j++){
    			if(shu-1==j){
    				number[j]++;
    				System.out.println(shu-1);
    			}
    		}
    	}
    	for(int i=0;i<50;i++){
    		if(number[i]!=0){
    			System.out.println(i+1+"出现了"+number[i]+"次");
    		}
    	}
    }
}
