package four;

/* 输入三个班，每班10个学生的成绩，求每个班的总分和平均分 */
public class F2 {
    public static void main(String[] args) {
        int [] Cj1 = {21,22,23,24,25,26,27,28,29,10};
        int [] Cj2 = {33,77,99,100,55,9,70,50,60,66};
        int [] Cj3 = {44,55,66,77,88,99,100,45,78,90};
        int sum1=0;
        int sum2=0,sum3 =0;
        double avg1 =0,avg2 =0,avg3=0;
        for(int i=0;i<10;i++){
            sum1 += Cj1[i];
            sum2 += Cj2[i];
            sum3 += Cj3[i];
        }
        avg1 = sum1/10.0;
        avg2 = sum2/10.0;
        avg3 = sum3/10.0;
        System.out.println("1班总分是"+sum1+"平均分是"+avg1);
        System.out.println("2班总分是"+sum2+"平均分是"+avg2);
        System.out.println("3班总分是"+sum3+"平均分是"+avg3);

    }
}
