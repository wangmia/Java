package inherit;

/**
 * @author WM
 * @date 2020/3/11 8:06 下午
 * 描述信息：增加属性：学校school、学号stuNumber； 重写工作方法（学生的工作是学习）
 */
public class Student extends Person {
    private String school;
    private int stuNumber;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(int stuNumber) {
        this.stuNumber = stuNumber;
    }

    public Student(){

    }
    public static  String wook(){
        return "学生的工作是学习";
    }

    public Student(String school) {
        this.school = school;
    }

    public Student(String name, char gender, int age, String nationality, String school) {
        super(name, gender, age, nationality);
        this.school = school;
    }

    @Override
    public String toString() {
        return "school='" + school + '\'' +
                ", stuNumber=" + stuNumber +'\''+super.toString();
    }
}
