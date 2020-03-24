import java.util.*;

/**
 * @author WM
 * @date 2020/3/23 7:17 下午
 * 描述信息：1.定义一个泛型Dao<T>，在其中顶一个Map成员变量,Map的键为String类型，值为T类型
 * 分别创建以下方法:
 * public void save(String id,T entity) 保存T乐行的对象到map集合中
 * public T get(String id) 从map中获取id对应的对象
 * public  void update(String id,T entity) 替换map中的key为id的内容
 * public List<T> list()  返回map中所有的 T 对象
 * public  void delete(String id) 删除指定对象
 */
public class DaoImpl<String,T> implements Dao<String,T> {

    Map<String,T> map = new HashMap<>();

    // 保存T乐行的对象到map集合中
    @Override
    public void save(String id, T entity) {

        map.put(id,entity);

    }

    // 从map中获取id对应的对象
    @Override
    public T get(String id) {

        return map.get(id);

    }

    // 替换map中的key为id的内容
    @Override
    public void update(String id, T entity) {

        if(map.keySet()==id){
            save(id,entity);
        }

    }

    // 返回map中所有的 T 对象
    @Override
    public List<T> list() {
         List<T> list = new ArrayList();
//         list = (List) map.values();
//        System.out.println(map.values());
        for (T t:map.values()) {
            list.add(t);
        }
         return list;
    }

    // 删除指定对象
    @Override
    public void delete(String id) {
        map.remove(id);
    }

}
