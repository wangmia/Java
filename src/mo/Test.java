package mo;

import java.util.Scanner;

/**
 * @author WM
 * @date 2020/3/14 9:49 下午
 * 描述信息：6）在 main  函数中生成
 * 一个公司对象；
 * 一个小时工的对象，每小时工资10，工作 200 小时；
 * 一个小时工的对象，每小时工资10，工作 230 小时；
 * 一个销售员工的对象，销售额5000；
 * 一个销售员工的对象，销售额200000；
 * 一个普通员工对象，工作小时205 小时。
 * 将以上员工对象加入公司对象中，然后调用输出所有员工工资和的方法，查看该公司该月应
 * 该发的工资总和。
 *
 * 8） 在main 函数中多生成一个首饰工人对象，生产首饰的数量30；
 * 将该对象加入公司对象中，
 * 然后调用输出所有员工工资和的方法，查看该公司该月应该发的工资总和。
 *
 * 结果运行了数不对
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Company company = new Company();

        HourWork hourWork = new HourWork();
        hourWork.setHour(200);
        hourWork.setMoney(10);
        company.setadd("张三",hourWork.sumMoney());

        HourWork hourWork2 = new HourWork();
        hourWork2.setHour(230);
        hourWork2.setMoney(10);
        company.setadd("李四",hourWork2.sumMoney());
//        System.out.println(company.toString());

        SaleWork saleWork = new SaleWork();
        saleWork.setSaleMoney(5000);
        company.setadd("华华",saleWork.sumMoney());

        SaleWork saleWork2 = new SaleWork();
        saleWork2.setSaleMoney(20000);
        company.setadd("雪落",saleWork2.sumMoney());

        PuWork puWork = new PuWork();
        puWork.setHour(205);
        company.setadd("小天",puWork.sumMoney());

        System.out.println("员工工资总和为"+company.sumMoney());

        JewelryWork jewelryWork = new JewelryWork();
        jewelryWork.setNumber(30);
        company.setadd("小高",jewelryWork.sumMoney());

        System.out.println("员工工资总和为"+company.sumMoney());

    }


}
