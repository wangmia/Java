// 有10长度的字符串数组,根据字符串的长度进行降序排序输出
import java.util.Scanner; //导入输入类
class PaiXu {
    public static void main(String[] args) {
        //创建输入对象
        Scanner sc = new Scanner(System.in);

        String [] str = new String[10];
        System.out.println("请输入10个字符串");
        for (int i = 0; i < 10; i++) {
            str[i] = sc.nextLine();
        }
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (str[j].length() < str[j + 1].length()) {
                    String [] temp = new String[1];
                    temp[0] = str[j + 1];
                    str[j + 1] = str[j];
                    str[j] = temp[0];
                }
            }
        }
        System.out.println("输出结果为");
        for (int i = 0; i < 10; i++) {
            System.out.println(str[i]);
        }

    }
}