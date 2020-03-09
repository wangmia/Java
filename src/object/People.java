package object;

/**
 * @author WM
 * @date 2020/3/9 8:22 下午
 * 描述信息：作业2，自动练习封装
 */
public class People {
    private String name;
    private String sex;
    private double length;
    // 住址
    private String address;

    // 输入信息
    public void setName(String name){
        this.name = name;
    }
    public void setIfLength(double length){
        if(length > 2.0||length <= 0){
            System.out.println("身高输入错误");
        }else{
            this.length = length;
        }
    }
    public void setIfSex(String sex){
        if(sex=="男"||sex=="女"){
            this.sex = sex;
        }else{
            System.out.println("请填'男'或'女'");
        }
    }
    public void setAddress(String address){
        this.address = address;
    }

    // 输出部分信息
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public double getLength(){
        return length;
    }
    public String getSex(){
        return sex;
    }

    public String toString(){
        return "name"+name+",address"+address+",length"+length+",sex"+sex;
    }

    public void study(){
        System.out.println(name+"在学习");
    }

    public void eta(){
        System.out.println(name+"在吃饭");
    }




}
