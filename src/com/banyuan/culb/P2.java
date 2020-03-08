package com.banyuan.culb;

public class P2 {
    public static void main(String[] args) {
        int a =3;
        char b = 5;
        double c = 1.0;
        System.out.println(getType(a+b+c+""));
//        char a = 'a';
        String s = "s$s";
//        int ss = (int)s;
        
    }
    // 测试结果的数据类型
    private static String getType(Object a) {
        return a.getClass().toString();
    }
}
