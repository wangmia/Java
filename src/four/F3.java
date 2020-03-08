package four;

/**
 *  5.打印出下面的图案
 *  54321
 *  5432
 *  543
 *  54
 *  5
 */
public class F3 {
    public static void main(String[] args) {
        int [] tu = {5,4,3,2,1};
        for(int i=5;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(tu[j]);
            }
            System.out.println();
        }
    }
}
