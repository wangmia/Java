package object;

/**
 * @author WM
 * @date 2020/3/9 9:57 下午
 * 描述信息：现在有五个学生,每个学生有4门课程 语文 数学 英语 理科综合,还有姓名属性
 * 要求:1.求出平均分最高的人的所有信息 2.找出理科成绩最高的人
 */
public class Student {
    private String name;
    private double chineseResult;
    private double mathResult;
    private double englishResult;
    private double scienceResult;

    public void setChineseResult(double chineseResult){
        if(chineseResult<0||chineseResult>100){
            System.out.println("成绩格式不正确");
        }else{
            this.chineseResult = chineseResult;
        }
    }
    public void setIfMathResult(double mathResult){
        if(mathResult<0||mathResult>100){
            System.out.println("成绩格式不正确");
        }else{
            this.mathResult = mathResult;
        }
    }
    public void setIfEnglishResult(double englishResult){
        if(englishResult<0||englishResult>100){
            System.out.println("成绩格式不正确");
        }else{
            this.englishResult = englishResult;
        }
    }
    public void setIfScienceResult(double scienceResult){
        if(scienceResult<0||scienceResult>100){
            System.out.println("成绩格式不正确");
        }else{
            this.scienceResult = scienceResult;
        }
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
        return "Name="+name+" ,ChineseResult="+chineseResult+" ,MathResult"+mathResult+
                " ,EnglishResult"+englishResult+" ,ScienceResult"+scienceResult;
    }

    // 求平均分
    public double average(){
        double average = (chineseResult+mathResult+englishResult+scienceResult)/4;
        return average;
    }

}
