package object;

import java.util.Scanner;

/**
 * @author WM
 * @date 2020/3/9 9:19 下午
 * 描述信息：作业2，测试
 */
public class PeopleTest {
    public statie void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        People people = new People();
        people.setName("张三");
        people.setAddress("住在玄武湖");
        people.setIfLength(1);
        people.setIfSex("男");
        System.out.println(people.toString());
        System.out.println("在干什么？");
        people.eta();

        People people2 = new People();
        System.out.println("name");
        people2.setName(sc.nextLine());
        System.out.println("address");
        people2.setAddress(sc.nextLine());
        System.out.println("length");
        people2.setIfLength(sc.nextDouble());
        System.out.println("sex");
        people2.setIfSex(sc.nextLine());
        System.out.println("print information");
        System.out.println(people.toString());
        System.out.println("在干什么？");
        people2.study();

    }
}
