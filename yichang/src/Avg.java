import java.util.Scanner;

/**
 * @author WM
 * @date 2020/3/17 8:09 下午
 * 描述信息：3.编写一个计算N个整数平均值的程序。程序应该提示用户输入N的值，如何必须输入所有N个数。
 * 如果用户输入的值是一个负数，则应该抛出一个异常并捕获，提示“N必须是正数或者0”。并提示用户再次输入该数
 */
public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要计算n个整数的和的n");
        int N = sc.nextInt();
        int [] number = new int[N];
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            System.out.println("请输入计算的第"+(i+1)+"个数");
            number[i] = sc.nextInt();
            if(judge(number[i])==0){
                System.out.println("请重新输入");
                number[i] = sc.nextInt();
            }
            sum+=number[i];
        }
        System.out.println("平均值为"+sum/(double)N);
    }
    public static int judge(int a){
        try{
            if(a<0){
                throw new ZiException("N必须是正数或者0");
            }else{
                return 1;
            }
        }catch (ZiException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return 0;
    }
}
