package statie;

/**
 * @author WM
 * @date 2020/3/10 11:16 下午
 * 描述信息：学生类（编号stuNum,姓名stuName,年级stuGrade,成绩stuScore）
 * 没做完
 */
public class Student {
    private String stuNum;
    private String stuName;
    private int stuGrade;
    private double stuScore;
    private String xuanxiang;  // 输入的选项

    public void setXuanxiang(String xuanxiang) {
        this.xuanxiang = xuanxiang;
    }
    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
    public void setStuGrade(int stuGrade) {
        this.stuGrade = stuGrade;
    }
    public void setStuScore(double stuScore) {
        this.stuScore = stuScore;
    }

    public String getXuanxiang() {
        return xuanxiang;
    }
    public String getStuNum() {
        return stuNum;
    }
    public String getStuName() {
        return stuName;
    }
    public int getStuGrade() {
        return stuGrade;
    }
    public double getStuScore() {
        return stuScore;
    }
}
