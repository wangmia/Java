/**
 * @author WM
 * @date 2020/3/24 9:22 下午
 * 描述信息：
 */
public class Student {
    private String name;
    private Integer age;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
