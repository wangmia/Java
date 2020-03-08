package four;

/* 输入10个整数存入数组，然后复制到b数组中输出 */
public class F5 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9,10};
        int [] b = new int[10];
        for(int i=0;i<10;i++){
            b[i] = a[i];
        }
        System.out.print("数组a=");
        for(int i=0;i<10;i++){
            System.out.print(" "+a[i]);
        }
        System.out.println();

        System.out.print("数组b=");
        for(int i=0;i<10;i++){
            System.out.print(" "+b[i]);
        }
        System.out.println();
    }
}
