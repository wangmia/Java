package mvn.student;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author WM
 * @date 2020/3/26 8:25 下午
 * 描述信息：
 */
public class TestExamination {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        File file = new File("Student.xml");
        student();

    }
    public static boolean student(){
        List<String> list = new ArrayList<>();
        try {
            CsvReader csvReader = new CsvReader("Student.csv",'\n', Charset.forName("utf-8"));
            while(csvReader.readHeaders()){
                list.add(csvReader.getRawRecord());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("这是学生查询系统");
        System.out.println("请输入如学号");
        String id = sc.next();
        System.out.println("请输入密码");
        String password = sc.next();

        for (int i = 0; i <list.size() ; i++) {
//            System.out.println(list.get(i));
            if(id.equals(list.get(i))){
                if(password.equals(list.get(i+2))){
                    System.out.println("你的学号为："+list.get(i));
                    System.out.println("你的姓名为："+list.get(i+1));
                    System.out.println("你的密码为："+list.get(i+2));
                    System.out.println("请输入你的选择 0，退出 1，修改信息");
                    int xuan = sc.nextInt();
                    if(xuan==1){
                        System.out.println("请输入修改的学号");
                        list.add(i,sc.next());
                        System.out.println("请输入修改的姓名");
                        list.add(i+1,sc.next());
                        System.out.println("请输入修改的密码");
                        list.add(i+2,sc.next());
                        CsvWriter csvWriter = new CsvWriter("Student.csv",'\n',Charset.forName("utf-8"));
                        for (String s:list) {
                            try {
                                csvWriter.write(s);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        csvWriter.close();
                    }else{
                        break;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
