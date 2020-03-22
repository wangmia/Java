import java.util.*;

/**
 * @author WM
 * @date 2020/3/21 6:49 下午
 * 描述信息：考试系统类
 * 3.现有两个数据存储容器,存储学生和存储考试试题,学生需要登录考试系统才能进行考试,每答对一题加十分,如果答错没有分
 */
public class Examination {
    private String [] answer = {"A","B","C","D"};
    List link = new ArrayList();

    Student student = new Student("11010","李四","123456",0);
    Student student2 = new Student("11011","李四","654321",0);
    Student student3 = new Student("11012","王五","134680",0);

//    private void setLink(List link) {
//        this.link = link;
//    }
//
//    private List getLink() {
//        return link;
//    }

    // 判断学生输入的密码及学号和设置的是否一致，一致返回1，不一致返回0
    public int verIFraction(String id,String password){
        int i = 0;
        List link = new ArrayList();
        link.add(student);
        link.add(student2);
        link.add(student3);
//        this.link = link;
        for (Object obj:link) {
            Student s = (Student)obj;

            if(id.equals(s.getStuId())&&s.getStuPassword().equals(password)){
                // 一致把new的对象给link
                this.link.add(s);
                i = 1;
            }
        }
        return i;
    }

    // 系统出题并生成答案
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
            if(p.getPrAnswer().equalsIgnoreCase(stu_Answer[i])){
                stuFraction += 10;
            }
            i++;
        }
        return stuFraction;
    }

    // 用学号定位输出学生信息
    public String stuInformation(int result,String id){
        for (Object obj:link) {
            Student s = (Student)obj;
            if(s.getStuId().equals(id)){
                s.setStuResult(result);
                return s.toString();
            }
        }
        return "";
    }
}
