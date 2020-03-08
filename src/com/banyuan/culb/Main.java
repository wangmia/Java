package com.banyuan.culb;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // 1.手动输入任意三个数，求三个数的和，差
        Scanner sc=new Scanner(System.in);
        System.out.println("请输人第一个数");
        int  num1=sc.nextInt();
        System.out.println("请输人第二个数");
        int  num2=sc.nextInt();
        System.out.println("请输人第三个数");
        int  num3=sc.nextInt();
        System.out.println("三个数的和是："+(num1+num2+num3)+"三个数的差是"+(num1-num2-num3));
        System.out.println("--------------");

        // 2.求BCD+2F的值
        int s1 = 0xBCD;
        int s2 = 0x2F;
        System.out.println(s1+s2);
        System.out.println("--------------");

        // 3. 10011101  转换成八进制  和十六进制
        // 八进制 235
        // 十六进制  9D
        int c = 0b10011101;
        System.out.println(String.format("%1$x",c));
        System.out.println(String.format("%1$o",c));
        System.out.println("--------------");

        // 4.变量的特点
        // 变量是可以变化的量，它既可以当常量来用，也可以在相应的时候改变其值

        /**
         * 6. 基本类型的运算）一家商场在举行打折促销，所有商品都进行8 折优惠。一
         * 位程序员把这个逻辑写成：
         * short price = ...; // 先计算出原价
         * short realPrice = price * 8 / 10; //再计算出打折之后的价格
         *
         * 问：这段代码是否正确？
         * 如果正确，假设price  为100 ，那计算之后的
         * realPrice值为多少？如果不正确，应该怎么改正？
         */
        short price = 100;
        // short realPrice = (short)(price * 8 / 10);
        // System.out.println(realPrice);
        // 不正确，int转short会报错，可以在结果前加shout强转，或把realPrice定义为int类型
        // System.out.println(--------------);

        // 7.找错
        // ceshi();
        /**
         * public void main(){ // 少String[] args
         *         int i=1,j;  // j没有初始化
         *         float f1=0.1;  // 少后缀f
         *         float f2=123;   // 少后缀f
         *         long  l1=123141L,l2=88888888888; // l2少后缀L
         *         double d1=2e20,d2=124;
         *         byte b1=1,b2=2,b3=129;  // byte型范围是-128~127，b3 超范围
         *         j=j+10;
         *         i=i/10;
         *         i=i*0.1; // int不能直接接收double型
         *
         *         char c1='a',c2=125;
         *
         *         byte b=b1-b2; // byte不能接收int型变量 **？**
         *
         *         char c=c1+c2-1; // char不能直接接收int型变量
         *         float f3=f1+f2;
         *
         *         float f4=f1+f2*0.1;  // float不能直接接收double
         *
         *         double d=d1*i+j;
         *
         *         float f=(float)(d1*5+d2);
         *     }
         */

        // 8.已知aa,bb 均是整型变量，写出将a,b两个变量中的值互换的程序
        int  aa=2,bb=3,cc;
        cc = aa;
        aa = bb;
        bb = cc;
        System.out.println(" "+aa+" "+bb);

        aa = aa+bb;
        bb = aa-bb;
        aa = aa-bb;
        System.out.println(" "+aa+" "+bb);

        aa = aa^bb;
        bb = bb^aa;
        aa = aa^bb;
        System.out.println(" "+aa+" "+bb);
        System.out.println("------------");

        // 9.写出下列变量a2和b2的运算结果
        int a2 = 9 / 3;  // 3
        int b2 = 9 % 2;  // 1
        System.out.println(" "+a2+" "+b2);
        System.out.println("------------");

        /**
         * 10.判断代码是否有错误，如有，请修改。
         * float a = 2.1;  // 缺少后缀f
         * float b = (double)20.9;  // float没法直接接收double型
         * int b3 = 210.9f +2.51;  // int没法直接接收double型
         * int b4 = (int)20.9 + (int)2.51;
         */
        float a = 2.1f;
        float b = (float)20.9;
        int b3 = (int)210.9f +(int)2.51;

        // 12. 给定一个任意的大写字母A~Z，转换为小写字母
        System.out.println("输入一个A~Z的字符");
        String  x = sc.nextLine();
        x = x+32;
        System.out.println(x);

        // 13.java的命名规范
        // 可以用英文字符和数字下划线美元符号汉子等字符命名，且区分大小写,必须以$、_、英文字符开头

    }
    public static void ceshi(){
        int i=1,j=0;

        float f1=0.1f;
        float f2=123;
        long  l1=123141L,l2=88888888888L;
        double d1=2e20,d2=124;
        byte b1=1,b2=2,b3=127;
        j=j+10;
        i=i/10;
        i=(int)(i*0.1);

        char c1='a',c2=125;

        byte b = (byte)(b1-b2);

        char c= (char)(c1+c2-1);
        float f3=f1+f2;

        float f4=(float)(f1+f2*0.1);

        double d=d1*i+j;

        float f=(float)(d1*5+d2);
        System.out.println(" "+i+" "+j+" "+c1+" "+b+" "+c+" "+f3+" "+f4+" "+d+" "+f);
        // 0 10 a -1 Ý 123.1 12.4 10.0 1.0E21
        System.out.println("--------------");
    }
}


