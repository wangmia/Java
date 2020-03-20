import java.util.Collections;
import java.util.LinkedList;

/**
 * @author WM
 * @date 2020/3/19 8:03 下午
 * 描述信息：
 */
public class Paixu {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();

        link.add("apple");
        link.add("grape");
        link.add("banana");
        link.add("pear");
        System.out.println("最大的元素为"+Collections.max(link));
        System.out.println("最小的元素为"+ Collections.min(link));
        Collections.sort(link);
        for(Object obj :link){
            System.out.println(obj);
        }
    }
}
