package mo;

/**
 * @author WM
 * @date 2020/3/14 8:54 下午
 * 描述信息：2）定义一个接口员工
 * 计算工资。
 * 3）小时工类，实现员工接口
 * 属性：
 * 工作的小时，每小时工资。
 * 方法：
 * 1. 设置工作的小时
 * 2. 设置每小时的工资。
 * 3. 重写计算工资方法：
 * 小时工没有基本工资，他的工资就是工作的小时*每小时工资。
 */
public class HourWork implements Work{
    private int hour;
    private int money;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public int sumMoney() {
        return hour*money;
    }
}
interface Work{

    public int sumMoney();
}