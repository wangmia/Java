package api;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author WM
 * @date 2020/3/16 7:26 下午
 * 描述信息：
 */
public class Api {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 1.将 byte [] by={65,67,68,97,98,101}  转换成字符串输出
        byte [] by =  {65,67,68,97,98,101};
        String str = new String(by);
        System.out.println(str);

        //            将上诉字节数组  从指定的位置开始到结束转换成字符串输出(从2开始到4）
        System.out.println(str.substring(2,str.length()-1));

        // 2.同样的自定义一个字符数组用字符串的方式输出
        byte [] it = {0,1,2,3,4};
        String stc = new String(it);

        // 3."abcdw" "ABCDw" 比较两个字符串是否相等  忽略大小写
        String st1 = "java";
        String st2 = "java";
        System.out.println(st1.equals(st2));

        // 4."我是你的谁,我是你的剑" 判断是否包含 "剑"
        String stt = "我是你的谁,我是你的剑";
                // indexOf(String s)的使用，如果包含，返回的值是包含该子字符串在父类字符串中起始位置；
        if(stt.indexOf("剑")!=-1){
            System.out.println("包含");
        }else {
            System.out.println("不包含");
        }

        // 5.第四题字符串判断是否以"我开头",判断是否以"剑"结尾
        System.out.println(stt+"是否以我开头："+str.startsWith("我"));
        System.out.println(stt+"是否以剑结尾："+str.endsWith("剑"));

        // 6.String   str=""和 String  str2=null; 判断他们是否为空
        st1="";
        st2=null;
        System.out.println("st1="+st1+' '+"st2="+st2);
        // 第一个是不为空，第二个为空

        // 7.找到此字符串"我是你的小宝贝"的 "我" 进行输出
        str ="我是你的小宝贝";
//        str.charAt(1);
        System.out.println(str.substring(str.indexOf("我"),str.indexOf("我")+1));

        // 8.找出 "我是你的谁,我是你的剑" 里面的 "你" 第一次出现的位置
        stt = "我是你的谁,我是你的剑";
        System.out.println(stt.indexOf("你"));

        // 9.找到上面 8 题的 最后一次出现 "你" 的位置,然后再从 第4个位置开始找  第一次出现的"你"
        System.out.println(stt.lastIndexOf("你"));
        System.out.println(stt.indexOf("你",4));

        // 10."我是你的谁,我是你的剑"  从指定位置开始截取长度;从指定位置开始截取到指定位置结束长度的字符串
        System.out.println(stt.substring(2,str.length()-1));

        // 11." 我是你的谁,我是你的剑 " 去除字符串左右空格
        stt = " 我是你的谁,我是你的剑 ";
        stt = stt.trim();
        System.out.println(stt);
        // trim()去除首尾空格 replace(" ", "")将空格替换成"" replaceAll(" +","")去掉所有空格 replaceAll("\\s*", "")去掉所有空白字符

        // 12. "我是你的谁,我是你的剑"  替代字符串里面的"谁",改为"被子"
        System.out.println(stt);
        stt = stt.replace("谁","被子");
        System.out.println(stt);

        // 13."我是你的谁,我是你的剑"  替换该字符串的所有的 "你" 改为 "哈"
        stt = "我是你的谁,我是你的剑";
        stt = stt.replaceAll("你","哈");
        System.out.println(stt);

        // 14. 比较 "avabc" 和 "avab" 字符串
        st1 = "avabc";
        st2 = "avab";
        System.out.println(st1.equals(st2));

        // 15. 将字符数组转换成 字符串输出
        char [] s = {'h','e','l','l','o'};
        str = new String(s);
        System.out.println(s);

        // 16. 将字节数组以指定的编码格式转换成字符串，再转换后的字符串以指定的编码格式转换成字节数组
        byte [] bt =  {65,67,68,97,98,101};
        str = new String(bt, "GBK");
        byte [] bs = str.getBytes("GBK");

        System.out.println(str);
        System.out.println(bs[0]+bs[1]+bs[2]+bs[3]+bs[4]+bs[5]);

    }
}
