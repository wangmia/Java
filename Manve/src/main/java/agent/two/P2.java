package agent.two;

import java.util.*;

/**
 * @author WM
 * @date 2020/3/30 10:44 下午
 * 描述信息：2.选择合适的Map集合保存5位学员的学号和姓名，然后按学号的自然顺序的倒序将这些键值对一一打印出来
 */
public class P2 {
    public static void main(String[] args) {
        Map map = new TreeMap(new Comparator<Integer>(){
            public int compare(Integer obj1,Integer obj2){
                //降序排序
                return obj2.compareTo(obj1);
            }
        });
        map.put(123, "张三");
        map.put(456, "李四");
        map.put(789, "王五");
        map.put(689, "赵柳");
        map.put(589, "田七");

        Set<Integer> keySet = map.keySet();
        Iterator iter = keySet.iterator();
        while(iter.hasNext()){
            Integer key = (Integer)iter.next();
            System.out.println(key+":"+map.get(key));
        }
    }
}
