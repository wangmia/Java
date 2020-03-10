package four;

/* 在一个数组中找出最大和最小值，并输出它们的位置 */
public class F8 {
    public statie void main(String[] args) {
        int [] number = {5,9,1,2,6,7,5,0,7,3};
        int max = number[0];
        int min = number[0];
        int xia_x = 0;
        int xia_n = 0;
        for(int i=1;i<10;i++){
            if(max<number[i]){
                max = number[i];
                xia_x = i;
            }
            if(min > number[i]){
                min = number[i];
                xia_n = i;
            }
        }
        System.out.println("最大值是"+max+" ,位置为"+xia_x+" ,最小值是"+min+" ,位置为"+xia_n);
    }
}
