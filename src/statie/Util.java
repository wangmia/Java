package statie;

/**
 * @author WM
 * @date 2020/3/11 12:06 下午
 * 描述信息：
 */
public class Util {
    // 学生对象存储
    public static Student[] students = new Student[6];
    public static Questions[] questions = new Questions[30];
    public static String[] answerStr = {"A", "B", "C", "D"}; // 答案
    public static int[] question_index = new int[10];

    static {
        //在程序启动的时候   6个学生的对象就已经被初始化了
        for (int i = 0; i < students.length; i++) {
            Student student = new Student();
            student.setStuName("张三" + i);
            student.setStuNum("110" + i);
            student.setStuGrade(3);
            students[i] = student;
        }

        //题目也被初始化了
        for (int i = 0; i < questions.length; i++) {
            Questions question = new Questions();
            question.setNumber(i + 1);
            question.setTitle("第" + (i + 1) + "遍提问:老周真帅!!!");
            //  A B C D

            int index = (int) (Math.random() * answerStr.length);

            question.setAnwwser(answerStr[index]);//随机给答案
            questions[i] = question;
        }
        for (int i = 0; i < question_index.length; i++) {
            question_index[i] = -1;
        }
    }
    //学生登录的方法
    public static boolean login(String stuName, String stuNumber) {

        for (int i = 0; i < students.length; i++) {
            if (students[i].getStuName().equals(stuName)
                    && students[i].getStuNum().equals(stuNumber)) {
                System.out.println("欢迎" + stuName + "登录");
                return true;
            }
        }
        return false;
    }
    //登录成功之后直接进入考试
    public static void exam() {
        int count = 0;
        while (count < question_index.length) {
            //生成十个随机数
            int index = (int) (Math.random() * questions.length);  //
            //先不考虑随机下标一样
            //question_index[i]=index;
            //随机一个下标 如果数组里面存在就不放进去
            boolean flag = true;
            for (int i = 0; i < count; i++) {
                if (index == question_index[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                question_index[count] = index;
                count++;
            }
        }
    }
}



