package agent.three;

/**
 * @author WM
 * @date 2020/4/1 6:41 下午
 * 描述信息：写出选择排序以及原理
 *
 * 在一列元素中找出最大、最小的与首元素交换，然后在剩下的元素中重复之前的操作
 */
public class Quick {
    public static void main(String[] args) {
        int[] quick ={1,10,3,4,6,8,7,9,2};
        for (int i = 0; i < quick.length; i++) {
            int min = quick[i];
            int max = i;
            for (int j = i+1; j < quick.length; j++) {
                if (quick[j]<min) {
                    min = quick[j];
                    max = j;
                }
            }
            if (max != i) {
                quick[max] = quick[i];
                quick[i] = min;
            }
        }
        for (int i:quick) {
            System.out.print(i+" ");
        }
    }
}
