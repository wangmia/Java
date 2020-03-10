package object;

/**
 * @author WM
 * @date 2020/3/9 9:57 下午
 * 描述信息：现在有五个学生,每个学生有4门课程 语文 数学 英语 理科综合,还有姓名属性
 * 要求:1.求出平均分最高的人的所有信息 2.找出理科成绩最高的人
 */
public class Student {
    private String name; // 学生姓名
    private double chineseResult;   // 语文成绩
    private double mathResult;      // 数学成绩
    private double englishResult;   // 英语成绩
    private double scienceResult;   // 理科综合

    public void setChineseResult(double chineseResult){
            this.chineseResult = chineseResult;
    }
    public void setMathResult(double mathResult){
            this.mathResult = mathResult;
    }
    public void setEnglishResult(double englishResult){
            this.englishResult = englishResult;
    }
    public void setScienceResult(double scienceResult){
            this.scienceResult = scienceResult;
    }
    public void setName(String name){
        this.name = name;
    }

    // 输出
    public String getName(){
        return name;
    }
    public double getChineseResult(){
        return chineseResult;
    }
    public double getMathResult(){
        return mathResult;
    }
    public double getEnglishResult(){
        return englishResult;
    }
    public double getScienceResult(){
        return scienceResult;
    }

    // 输出全部信息
    public String toSting(){
        return "Name= "+name+" ,ChineseResult= "+chineseResult+" ,MathResult= "+mathResult+
                " ,EnglishResult= "+englishResult+" ,ScienceResult= "+scienceResult;
    }

    // 求平均分
    public double average(){
        return (chineseResult+mathResult+englishResult+scienceResult)/4;
    }

}
