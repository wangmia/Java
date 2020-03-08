package three;
/* 4.找出能被5或6整除，但不能被两者同时整除的数 */
public class T4 {
    public static void main(String[] args) {
        System.out.println("输出1~50中能被5或6整除，但不能被两者同时整除的数");
        for(int i=1;i<50;i++){
            if((i%5==0||i%6==0)&&!(i%5==0&&i%6==0)){
                System.out.println(i);
            }
        }
    }
}
