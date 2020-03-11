package inherit;

/**
 * @author WM
 * @date 2020/3/11 11:11 下午
 * 描述信息：(1)创建一个Customer ,名字叫 Jane Smith, 他有一个账号为1000,余额为2000元,年利率为 1.23% 的账户。
 * (2)对Jane Smith操作。
 * 存入 100 元,再取出960元。再取出2000元。打印出Jane Smith 的基本信息
 * 成功存入 :100.0,成功取出:960.0,余额不足,取款失败
 * Customer [Smith, Jane] has a account: id is 1000, annualInterestRate is 1.23%, balance is 1140.0
 */
public class TestCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane","Smith");
        customer.setId(1000);
        customer.setBalance(2000);
        customer.setAnnulInterestRate(1.23);
        System.out.println(customer.deposit(100)+','+customer.withdraw(960)+','+customer.withdraw(2000));
        System.out.println(customer.display());
    }
}
