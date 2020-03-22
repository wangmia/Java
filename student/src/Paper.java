/**
 * @author WM
 * @date 2020/3/21 6:41 下午
 * 描述信息：2.试题类：试题编号（自增长）,试题名称,试题选项（四个 A B C D）,试题答案
 */
public class Paper {
    private static int i;
    private int prId = 1;
    private String prName ;
    private String prA = "A";
    private String prB = "B" ;
    private String prC = "C";
    private String prD = "D";
    private String prAnswer ;

    public String getPrAnswer() {
        return prAnswer;
    }

    public Paper() {
    }

    public Paper(String prName, String prAnswer) {
        prId+=i++;
        this.prName = prName;
        this.prAnswer = prAnswer;
    }

    @Override
    public String toString() {
        return
                prId + " . " + prName + ' ' +'\n'+
                "选项：{ " + prA +' '
                 + prB + ' '+prC +' '+ prD +' '+
                '}';
    }
}
