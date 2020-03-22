/**
 * @author WM
 * @date 2020/3/21 6:34 下午
 * 描述信息：1.学生类,学生编号,学生姓名,学生密码,学生成绩
 */
public class Student {
    private String stuId;
    private String stuName ;
    private String stuPassword;
    private int stuResult;


    public Student(String stuId, String stuName, String stuPassword,int stuResult) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuPassword = stuPassword;
        this.stuResult = stuResult;
    }

    public String getStuId() {
        return stuId;
    }

    public String getStuPassword() {
        return stuPassword;
    }

    public void setStuResult(int stuResult) {
        this.stuResult = stuResult;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuPassword=" + stuPassword +
                ", stuResult=" +stuResult +
                '}';
    }
}
