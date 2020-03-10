package four;

/* 定义一个数组,数组成员10个,找出数组中最大数连同下标一起输出 */
public class F4 {
    public statie void main(String[] args) {
        int [] number = {3,6,9,5,10,7,9,3,2,1};
        int max = number[0];
        int xia = 0;
        for(int i=1;i<10;i++){
            if(max<number[i]){
                max = number[i];
                xia = i;
            }
        }
        System.out.println("数组中最大值是"+max+"下标为"+xia);
    }
}
