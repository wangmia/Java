package statie;

/**
 * @author WM
 * @date 2020/3/10 11:16 下午
 * 描述信息：学生类（编号stuNum,姓名stuName,年级stuGrade,成绩stuScore）
 * 没做完
 */
public class Student {
    private int stuNum;
    private String stuName;
    private byte stuGrade;
    private double stuScore;
    private String xuanxiang;  // 输入的选项

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
    public void setStuGrade(byte stuGrade) {
        this.stuGrade = stuGrade;
    }
    public void setStuScore(double stuScore) {
        this.stuScore = stuScore;
    }

    public int getStuNum() {
        return stuNum;
    }
    public String getStuName() {
        return stuName;
    }
    public byte getStuGrade() {
        return stuGrade;
    }
    public double getStuScore() {
        return stuScore;
    }
}
