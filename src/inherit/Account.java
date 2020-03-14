package inherit;

/**
 * @author WM
 * @date 2020/3/11 10:50 下午
 * 描述信息：A.写一个名为Account的类模拟账户。该类包括的属性:账号id,余额balance,年利率annualInterestRate;
 * 包含的方法:访问器方法(getter和setter方法),取款方法withdraw(),存款方法deposit()。 提示:在提款方法withdraw中,
 * 需要判断用户余额是否能够满足提款数额的要求,如果不能,应给出提示。
 */
public class Account {
    static int id;  // 账号
    private double balance;  // 余额
    private double annulInterestRate;  // 年利率

    public Account() {
    }
    public String withdraw(double qu){
        if(balance < qu){
            return "余额不足，取款失败";
        }else{
            balance -= qu;
            return "成功取出: "+qu;
        }
    }
    public String deposit(double cun){
        balance += cun;
        return "成功存入: "+cun;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAnnulInterestRate() {
        return annulInterestRate;
    }
    public void setAnnulInterestRate(double annulInterestRate) {
        this.annulInterestRate = annulInterestRate;
    }
}
