package mo;

/**
 * @author WM
 * @date 2020/3/14 9:04 下午
 * 描述信息：4）销售员工类，实现员工接口
 * 属性：
 * 销售的总金额
 * 基本工资
 * 方法
 * 1. 设置销售的总金额
 * 2. 重写计算工资方法：
 * 基本工资+提成。
 * 提成的计算：
 * 当销售额再10000 以下时，则提成10%，
 * 等销售额再10000-100000之间是，则提成15%。
 * 再 100000以上是，提成18%。
 */
public class SaleWork extends Company implements Work{
    private int saleMoney;
    private int baseMoney = 5000;

    public int getSaleMoney() {
        return saleMoney;
    }

    public void setSaleMoney(int saleMoney) {
        this.saleMoney = saleMoney;
    }

    public int getBaseMoney() {
        return baseMoney;
    }

    public void setBaseMoney(int baseMoney) {
        this.baseMoney = baseMoney;
    }

    @Override
    public int sumMoney() {
        if(saleMoney<10000){
            baseMoney += baseMoney/10;
        }else if(saleMoney>10000&&saleMoney<100000){
            baseMoney += baseMoney/15;
        }else if(saleMoney>100000){
            baseMoney += baseMoney/18;
        }
        return baseMoney;
    }
}
