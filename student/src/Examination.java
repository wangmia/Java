import java.util.*;

/**
 * @author WM
 * @date 2020/3/21 6:49 下午
 * 描述信息：考试系统类
 * 3.现有两个数据存储容器,存储学生和存储考试试题,学生需要登录考试系统才能进行考试,每答对一题加十分,如果答错没有分
 */
public class Examination {
    private String [] answer = {"A","B","C","D"};
//    Student student = new Student(1123,"张三",1234);


    // 系统出题判断分数
    public List Issue(int STU){
        Random random = new Random();
        List link = new ArrayList();

        // 初始化试卷
        for (int i = 0; i < STU; i++) {
            int s = random.nextInt(4);
//            System.out.println(s);
            // 试卷的答案
            String pr_Answer = answer[s];
            link.add(new Paper("第"+(i+1)+"题",pr_Answer));
        }
        return link;
    }

    public int fraction(List link,String stu_Answer[]){
        // 判断分数
        int i = 0;
        int stuFraction = 0;
        for (Object obj:link) {
            Paper p = (Paper)obj;
//            System.out.println(p.getPrAnswer().equals(stu_Answer[i]));
            if(p.getPrAnswer().equals(stu_Answer[i])){
                stuFraction += 10;
            }
            i++;
        }
        return stuFraction;
    }


}
