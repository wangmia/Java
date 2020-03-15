package mo;

/**
 * @author WM
 * @date 2020/3/14 9:22 下午
 * 描述信息：普通员工类，实现员工接口
 * 属性：
 * 工作的小时
 * 基本工资
 * 方法：
 * 1. 设置工作的小时
 * 2. 重写计算工资的方法：
 * 当每月工作的小时数超过196 小时时，超出的部分按每小时200 元。
 * 基本工资+（工作的小时-196）*200。
 */
public class PuWork implements Work{
    private int hour;
    private int baseMoney = 5000;

    public int getBaseMoney() {
        return baseMoney;
    }

    public void setBaseMoney(int baseMoney) {
        this.baseMoney = baseMoney;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public int sumMoney() {
        return baseMoney+(hour-196)*200;
    }
}
