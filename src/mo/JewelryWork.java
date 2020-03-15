package mo;

/**
 * @author WM
 * @date 2020/3/15 11:32 上午
 * 描述信息：定义首饰工人类，实现员工接口：
 * 属性
 * 生产首饰的数量
 * 方法
 * 1  设置生产首饰的数量
 * 2  重写计算工资的方法
 * 工资  ==  设置生产首饰的数量  *50；
 */
public class JewelryWork implements Work{
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int sumMoney() {
        return number*50;
    }
}
