import java.util.*;

/**
 * @author WM
 * @date 2020/3/19 8:41 下午
 * 描述信息：某班级有 40 个学生，学号为 180201-180240，全部参加 Java 集合阶段检测，
 * 给出所有同学的成绩（可随机产生，范围为 50-100），请编写程序将本班各位同学成绩从高往
 * 低排序打印输出，注：成绩相同时学号较小的优先打印要求：打印的信息包含学号、姓名（姓名统一为“同学 J”[J=10,11,12。。。]）和成绩
 */
public class TestBan {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList list=new LinkedList();
        for(int i=0;i<40;i++){
            int result = random.nextInt(51) + 50;
            list.add(new Ban(180201+i,result,"同学"+(i+10)));
        }

        Comparator<Ban> comparator = new Comparator<Ban>() {
            @Override
            public int compare(Ban o1, Ban o2) {
                if (o2.getResult() > o1.getResult()){
                    return 1;
                }else if (o2.getResult() < o1.getResult()){
                    return -1;
                }else {
                    return 0;
                }
            }
        };
        Collections.sort(list, comparator);
        for (Object ob : list) {
            System.out.println(ob.toString());
        }



    }
}
class Ban {
    private int id ;
    private int  result;
    private String name;

    public Ban(int id, int result, String name) {
        super();
        this.id = id;
        this.result = result;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getResult() {
        return result;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "姓名 "+name + " 学号："+id+" 成绩 ："+result+'\n';
    }

}