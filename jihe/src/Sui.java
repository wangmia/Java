import java.util.HashSet;
import java.util.Random;

/**
 * @author WM
 * @date 2020/3/19 8:12 下午
 * 描述信息：产生10个1~20之间的随机数，要求随机数不能重复
 */
public class Sui {
    public static void main(String[] args) {
        //随机数生成器
        Random r = new Random();

        //创建Set集合
        HashSet hs = new HashSet();

        //判斷长度是否小于10，循环添加
        while(hs.size()<10){
           hs.add(r.nextInt(20)+1);
//            hs.add((int)(Math.random()*20+1));
        }

        //遍历输出
        for (Object obj : hs) {
            System.out.println(obj);
        }
    }
}
