package mo;

/**
 * @author WM
 * @date 2020/3/14 8:05 下午
 * 描述信息：首饰的公司类。
 * 属性:
 * 一个保存员工的数组。
 * 方法：
 * 1, 添加一个员工。
 * 2,  通过员工的名字来删除员工。
 * 3,  通过员工的名字来显示员工的工资。
 * 4,  输出所有员工的工资和。
 */
public class Company {
    int id = 0;

    Company[] company = new Company[10];
    private String name;
    private int money;

    public String setadd(String name, int money) {
        Company c = new Company();
        c.name = name;
        c.money = money;
        if (id < 10) {
            company[id] = c;
            id++;
            return "员工增加成功";
        } else {
            return "员工人数已满";
        }
    }

    public String delete(String name) {
        for (int i = 0; i < id; i++) {
            if (company[i].name.equals(name)) {
                company[i] = company[i + 1];
            }
        }
        return "员工删除成功";
    }

    public String chaMoney(String name) {
        int q = 0;
        for (int i = 0; i < id; i++) {
            if (company[i].name.equals(name)) {
                q = i;
            }
        }
        return company[q].name + "的工资为" + company[q].money;
    }

    public int  sumMoney() {
        int sum = 0;
        for (int i = 0; i < id; i++) {
            sum = company[i].money;
        }
        return sum;
    }

//    @Override
//    public String toString() {
//        return "Company{" +
//                "name='" + company[0].name + '\'' +
//                ", money=" + company[0].money +"name='" + company[1].name + '\'' +
//                ", money=" + company[1].money +
//                '}';
//    }

}