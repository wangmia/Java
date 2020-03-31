package agent.two;

import java.util.HashSet;

/**
 * @author WM
 * @date 2020/3/30 9:50 下午
 * 描述信息：1.在HashSet集合中添加三个Person对象，把 姓名 相同的人当做同一个人，禁止重复添加
 */
public class P1 {
    public static void main(String[] args) {
        HashSet<Person> hashSet = new HashSet();
        hashSet.add(new Person("张三",14));
        hashSet.add(new Person("张三",15));
        hashSet.add(new Person("李四",30));
        hashSet.add(new Person("张三",14));

        System.out.println(hashSet);
    }
}
class Person{
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        Person e = (Person) obj;
        return e.name.equals(this.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}