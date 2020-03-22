/**
 * @author WM
 * @date 2020/3/21 6:34 下午
 * 描述信息：1.学生类,学生编号,学生姓名,学生密码,学生成绩
 */
public class Student {
    private int stuId;
    private String stuName = "张三";
    private int stuPassword;
    private int stuResult;

//    public Student(int stuId, String stuName, int stuPassword) {
//        this.stuId = stuId;
//        this.stuName = stuName;
//        this.stuPassword = stuPassword;
//    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void setStuesult(int stuesult) {
        this.stuResult = stuesult;
    }
    public void setStuPassword(int stuPassword) {
        this.stuPassword = stuPassword;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuPassword=" + stuPassword +
                ", stuesult=" + stuResult +
                '}';
    }
}
