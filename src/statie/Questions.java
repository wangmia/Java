package statie;

/**
 * @author WM
 * @date 2020/3/10 11:28 下午
 * 描述信息：试题类（试题编号number,试题内容title,试题选项 anwserA  anwserB anwserC anwserD  试题答案  Anwser）
 * 没做完
 */
public class Questions {
    private static int  number;
    private static String title ;
    private static String anwserA = "a" ;
    private static String anwserB = "b";
    private static String anwserC = "c" ;
    private static String anwserD = "d" ;
    private static String Anwwser;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setAnwserA(String anwserA) {
        this.anwserA = anwserA;
    }
    public void setAnwserB(String anwserB) {
        this.anwserB = anwserB;
    }
    public void setAnwserC(String anwserC) {
        this.anwserC = anwserC;
    }
    public void setAnwserD(String anwserD) {
        this.anwserD = anwserD;
    }
    public void setAnwwser(String anwwser) {
        Anwwser = anwwser;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumber() {
        return number;
    }
    public String getTitle() {
        return title;
    }
    public String getAnwserA() {
        return anwserA;
    }
    public String getAnwserB() {
        return anwserB;
    }
    public String getAnwserC() {
        return anwserC;
    }
    public String getAnwserD() {
        return anwserD;
    }
    public String getAnwwser() {
        return Anwwser;
    }

//    // 输出题目
//    public String toQustions(){
//        return number+'.'+title+'\n'+"A. "+anwserA+" B. "+anwserB+" C. "+anwserC+" D. "+anwserD;
//    }
//    // 比较答案
//    public int bijiao(String  a){
//        int c;
//        if(a.equals(Anwwser)){
//            c = 1;
//        }else{
//            c = 0;
//        }
//        return c;
//    }

}
