import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * @author WM
 * @date 2020/3/19 8:22 下午
 * 描述信息：
 */
public class ZiFu {
    public static void main(String[] args) {
        // LinkedHashSet有序
        LinkedHashSet hs = new LinkedHashSet();
        // HashSet无序
//        HashSet hs = new HashSet();

        System.out.println("输入字符串");
        Scanner sc =new Scanner(System.in);
        String s =sc.next();

        //字符串转换成字符数组 获取每一个字符存储在hashset中  自动去除重复
        char [] arr = s.toCharArray();

        for (char c : arr) {
            hs.add(c);
        }

        for (Object obj:hs) {
            System.out.print(obj);
        }

    }
}
