package api;

import java.util.Scanner;

/**
 * @author WM
 * @date 2020/3/16 10:13 下午
 * 描述信息： 4、5题没做出来
 */
public class Strings {
    public static void main(String[] args) {
        // 1:需求：请设计一个方法，可以实现获取任意范围内的随机数。
        int k;
        int g;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入2个数判定随机数的范围");
        k = sc.nextInt();
        g = sc.nextInt();
        int shu = (int)(Math.random()*g+k);
        System.out.println("随机数为"+shu);
        System.out.println();

        // 2.定义一个StringBuffer类对象，
        //1）使用append方法向对象中添加26个字母，并倒序遍历输入
        //2）删除前五个字符
        StringBuffer stringBuffer = new StringBuffer();
        char s = 'z';
        for (int i = 0; i < 25; i++) {
            s = (char)(s-1);
//            stringBuffer.append();
            stringBuffer.append(s);
        }
        stringBuffer.delete(0,5);
        System.out.println(stringBuffer.toString());

        // 3.将字符串中指定部分进行反转
        StringBuffer stringBuffer2 = new StringBuffer(stringBuffer.substring(3,9));
        stringBuffer2.reverse();
        System.out.println(stringBuffer2.toString());

        // 4. 编写一个程序，将下面的一段文本中的各个单词的字母顺序翻转，
        //“To be or not to be"，将变成"oT eb ro ton ot eb."。
        String str = "To be or not to be";
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(str);
        stringBuffer3.reverse();
        System.out.println(stringBuffer3.toString());

        // 面试题：5. 编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截取的字符串。
        //但是要保证汉字不被截半个，如“我ABC”4，应该截为“我AB”，输入“我ABC汉DEF”，6，
        //应该输出为“我ABC”而不是“我ABC+汉的半个”。

        String stc = sc.next();
        byte [] by = stc.getBytes();










    }
}
