package inherit;

/**
 * @author WM
 * @date 2020/3/11 11:03 下午
 * 描述信息: a. 声明三个私有对象属性:firstName、lastName和account。
 * b. 声明一个公有构造器,这个构造器带有两个代表对象属性的参数(f和l)
 * c. 声明两个公有存取器来访问该对象属性,方法getFirstName和getLastName返回相应的属性。
 * d. 声明setAccount 方法来对account属性赋值。
 * e. 声明getAccount 方法以获取account属性。 //
 */
public class Customer extends Account{
    private String firstName;
    private String lastName;
    private Account account;

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public Customer() {
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String display(){
        return "Customer " + '['+lastName+' '+firstName+']'+ "has a account: id is "+super.getId()+'，'
                + "annualInterestRate is"+super.getAnnulInterestRate()+ "% , balance is "+super.getBalance();
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

}
