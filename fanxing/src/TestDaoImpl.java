/**
 * @author WM
 * @date 2020/3/23 10:50 下午
 * 描述信息：
 */
public class TestDaoImpl {

    public static void main(String[] args) {

        DaoImpl<String,User> dao = new DaoImpl<>();
        // 曾加
        dao.save("13",new User(123,"ss"));
        dao.save("14",new User(122,"st"));
        // 获取相应对象
        System.out.println(dao.get("13"));
        // 替换对象
        dao.update("13",new User(124,"na"));
        // 输出所有的值
        System.out.println(dao.list());
        // 删除map元素
        dao.delete("14");
        // 还剩一个值说明删除成功
        System.out.println(dao.list());
    }
}




/*
Map
map.put(K,V)    增加
map.get()   获取K对应的V
map.KeySet()    获取K
map.values()    获取V
map.remove()    删除K的一整行
map.remove(K,V)    删除一个map元素
 */