package inherit;

/**
 * @author WM
 * @date 2020/3/11 8:14 下午
 * 描述信息：增加属性：职务job； 增加方法：开会meeting。 编写测试类分别对上述3类具体人物进行测试。
 * 测试，写出学生张三的一天的经历
 */
public class StudentLeader extends Student{
    private String job;

    public StudentLeader(String job) {
        this.job = job;
    }

    public StudentLeader(String school, String job) {
        super(school);
        this.job = job;
    }
    public StudentLeader(String name, char gender, int age, String nationality, String school, String job) {
        super(name, gender, age, nationality, school);
        this.job = job;
    }

    public StudentLeader() {
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public void meeting(){
        System.out.println("正在开会");
    }

    @Override
    public String toString() {
        return "输出学生信息" + '\n'+
                "job='" + job + '\'' + super.toString();
    }
}

class Testc{
    public static void main(String[] args){
        StudentLeader xue = new StudentLeader("张三",'男',25,"中国","半圆学社","学委");
        Worker work = new Worker("某某建筑工厂",1);
        System.out.println(xue.toString());
        System.out.println("早上");
        System.out.println(xue.wook());

        System.out.println("中午了");
        System.out.println(xue.getName()+xue.eat());

        System.out.println("下午了");
        System.out.println(xue.getName()+Student.wook());

        System.out.println("放学了,有了新的身份");
        work.setName("张三");
        System.out.println(work.getName()+work.wook());

        System.out.println("很晚了"+xue.getName()+xue.sleep());

    }
}