package four;

/**
 * 有30个0~9之间的数字，分别统计0~9这10个数字分别出现了多少次
 * 0  1  2  3  4  5  6  7  8  9
 *
 *    随机30个数字
 */
public class F9 {
    public static void main(String[] args) {
        int [] number = new int[30];
        System.out.println("-------------------");
        System.out.println("产生的1~30的十个随机数");
        for(int i=0;i<30;i++){
            int shu = (int)(Math.random()*10+1);

            for(int j=0;j<30;j++){
                if(shu-1==j){
                    number[j]++;
                    System.out.println(shu-1);
                }
            }
        }
        for(int i=0;i<30;i++){
            if(number[i]!=0){
                System.out.println(i+"出现了"+number[i]+"次");
            }
        }
    }
}
