package agent.three;

/**
 * @author WM
 * @date 2020/4/1 5:59 下午
 * 描述信息：写出二分查找以及快速排序的算法,并且用自己的话总结其原理
 *
 *      二分查找适用于有序数列，原理就是从数组中选出一个基准值，
 *      然后比较基准值与查询数的大小关系，如果大就在就在左侧的范围内重复选数查找操作，如果小就在右侧重范围内复操作
 */
public class Binary {
    public static void main(String[] args) {
        int[] arry ={1,2,3,4,6,7,8,9,10};
        System.out.println(binSearch(2,arry));
    }

    public static int binSearch(int value, int[] arry) {
        int right = arry.length - 1;
        int left = 0;
        int middle = (right + left) / 2;

        while (arry[middle] != value) {
            if(arry[middle] > value) {
                right = middle - 1;
            }else if (arry[middle] < value) {
                left = middle + 1;
            }

            if (left > right) {
                return -1;
            }

            middle = (right + left) / 2;
        }
        return middle;
    }
}
