import java.util.Scanner;

/**
 * @author WM
 * @date 2020/3/17 7:01 下午
 * 描述信息：1.编写程序接收用户输入分数信息，如果分数在0—100之间，输出成绩。如果成绩不在该范围内，抛出异常信息，提示分数必须在0—100之间
 */
public class Fen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("请输入您的分数:");
            int score = sc.nextInt();
            if (score < 0 || score > 100) {
                throw new ZiException("分数必须在0—100之间");
            }
            System.out.println("分数为：" + score);

        }catch (ZiException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}

class ZiException extends Exception{
    public ZiException() {
    }

    public ZiException(String message) {
        super(message);
    }
}
