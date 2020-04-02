package net1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author WM
 * @date 2020/4/1 10:03 下午
 * 描述信息：循环写入cvs文件 要求：再次启动程序的时候往文件里面写不能覆盖原有的内容
 */
public class P2 {
    public static void main(String[] args) throws IOException {
        File file = new File("test.csv");
        if(!file.exists()){
            file.createNewFile();
        }

        String [] str = {"学号","姓名","年龄","住址","100","第一","21","北京","101","第二","20","天津","102","第三","22","南京","103","第四","90","东京"};

        BufferedWriter csvWriter1 = new BufferedWriter(new FileWriter(file.getName(),true));
        List<String> list = new ArrayList();
        for (String s:str){
            list.add(s);
        }
        int i=1;
        csvWriter1.write("\n");
        for (String s:list){
            csvWriter1.write(s);
            csvWriter1.write(" ");
            if(i++%4==0){
                csvWriter1.write("\n");
            }
        }
        csvWriter1.close();
    }
}
