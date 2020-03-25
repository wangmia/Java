import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author WM
 * @date 2020/3/24 9:21 下午
 * 描述信息：在程序中创建一个Student类型的对象，并把对象信息保存到/io/student.txt文件中，
 * 然后再从文件中把Student对象的信息读出,并且把读出来的数据重新赛给一个对象,然后显示在控制台上
 *
 * //作业2：把写入进去的文件内容  读取出来 并且把读取出来的数据 原封不动的赋值回去
 * "张三"--->name  23--->age
 */
public class P4 {
    public static  void main(String[] args) {
        File file = new File("io/student.txt");
        new  File("io").mkdir();
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        List<Student> list = new ArrayList<>();
        list.add(new Student("张三",21));
        list.add(new Student("李四",22));
        list.add(new Student("王五",23));
        list.add(new Student("赵钱",20));
        list.add(new Student("天天",19));

        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(file,true);
            for (int i = 0; i < list.size(); i++) {
                Student student = list.get(i);
                outputStream.write(("姓名:"+student.getName()).getBytes());
                outputStream.write(",".getBytes());
                outputStream.write(("年龄:："+student.getAge()).getBytes());
                outputStream.write("\n".getBytes());
            }

            // 读内容
            InputStream inputStream = new FileInputStream(file);
            byte [] stu = new byte[(int)file.length()];
            inputStream.read(stu);
            // 字符串拼接
            String str = new String(stu,0,stu.length);

            // 把读的内容追加进去
            outputStream.write(stu);

            // 显示内容
            System.out.println("读取的内容为："+str);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
