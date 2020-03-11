package inherit;

/**
 * @author WM
 * @date 2020/3/11 8:01 下午
 * 描述信息：属性：姓名name、性别gender、年龄age、国籍nationality； 方法：吃饭eat、睡觉sleep，工作work。
 */
public class Person {
    private String name;
    private char gender;
    private int age;
    private String nationality;

    public Person() {
    }
    public Person(String name, char gender, int age, String nationality) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String eat(){
        return "在吃饭";
    }

    public String sleep(){
        return "去睡觉了";
    }

    public String  work(){
        return "在工作";
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", nationality='" + nationality + '\'' ;
    }
}
