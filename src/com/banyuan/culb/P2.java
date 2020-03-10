package com.banyuan.culb;

import java.util.Scanner;

public class P2 {
    public statie void main(String[] args) {
        // a+b+c+"" 数据类型测试
        int a =3;
        char b = 5;
        double c = 1.0;
        System.out.println(getType(a+b+c+""));

        // 字符串转int型测试
        String s = "s$s";
//        int ss = (int)s;

        double e=9.21D;
        System.out.println(e);

        // 取余
        System.out.println(100%3);
        System.out.println(100%3.0);

        // 1.编写Java程序，实现判断变量x是奇数还是偶数。
        int x = 9;
        if(x%2==0){
            System.out.println(x+"是偶数");
        }else{
            System.out.println(x+"是奇数");
        }
        // 2.X%2==0?偶数：奇数
        System.out.println(x%2==0?x+"是偶数":x+"是奇数");

        // 用scanner接受char类型变量
        System.out.println("请输入性别");
        Scanner scanner=new Scanner(System.in);
        char sex=scanner.next().charAt(0);
        System.out.println(sex);
    }
    // 测试结果的数据类型
    private statie String getType(Object a) {
        return a.getClass().toString();
    }
}
