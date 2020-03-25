package mvn;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * @author WM
 * @date 2020/3/25 6:13 下午
 * 描述信息： 1. 基本操作练习,存储和读出内容
 *      2. 把原有读出的内容链接字符串在写回去，并把内容输出到控制台
 */
public class Mnv1 {
    public static void main(String[] args) throws IOException {
        File file = new File("test.csv");
        if(!file.exists()){
            file.createNewFile();
        }
        CsvWriter csvWriter = new CsvWriter(file.getName(),',',Charset.forName("UTF-8"));  // 创建输入
        // 写入数据
        String [] str = {"学号","姓名","年龄","住址"};
        csvWriter.writeRecord(str);
        String [] str1 = {"100","第一","21","北京"};
        String [] str2 = {"101","第二","20","天津"};
        String [] str3 = {"102","第三","22","南京"};
        String [] str4 = {"103","第四","23","东京"};
        csvWriter.writeRecord(str1);
        csvWriter.writeRecord(str2);
        csvWriter.writeRecord(str3);
        csvWriter.writeRecord(str4);

        csvWriter.endRecord();    // 内容换行

        csvWriter.close();

        CsvReader  csvReader=new CsvReader(file.getName(), ',', Charset.forName("UTF-8"));
        BufferedWriter csvWriter1 = new BufferedWriter(new FileWriter(file.getName(),true));
        List<String> list = new ArrayList();
        for(int i=0;i<5;i++){   // 循环输出表
            if(csvReader.readHeaders()){
                System.out.println(csvReader.getRawRecord());
                list.add(csvReader.getRawRecord()+i+'\n');
            }
        }

        for (String s:list) {
            csvWriter1.write(s);
        }

        csvReader.close();
        csvWriter1.close();
//        csvWriter.close();


//        if(csvReader.readHeaders()){  // 读取表头
//                System.out.println(csvReader.getRawRecord());
//            }
//        if(csvReader.readRecord()){  // 读取表的每一行数据
//            System.out.println(csvReader.getRawRecord());
//        }

    }
}
