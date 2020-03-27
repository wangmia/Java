package mvn.student;

import com.csvreader.CsvWriter;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * @author WM
 * @date 2020/3/26 5:30 下午
 * 描述信息：任务1:使用xml作为一个数据存储,尝试做出在线考试系统
 * Student       学号  名字   密码   成绩可以可无   可以修改自己信息 和查询自己的信息
 * 管理员admin    可以添加学生  删除学生
 * 答题Question   学生回答问题
 */
public class Student {
    private Integer stuId;
    private String name;
    private Integer passWord;

    public Student(Integer stuId, String name, Integer passWord) {
        this.stuId = stuId;
        this.name = name;
        this.passWord = passWord;
    }

    public Student() {
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPassWord() {
        return passWord;
    }

    public void setPassWord(Integer passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", name='" + name + '\'' +
                ", passWord=" + passWord +
                '}';
    }
}
class CsvStudent{
    public static void main(String[] args) {
        File file = new File("Student.csv");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        List<Student> list = new ArrayList<>();
        list.add(new Student(1101,"猫咪",1234));
        list.add(new Student(1102,"花猫",1234));
        list.add(new Student(1103,"加菲猫",1234));
        CsvWriter csvWriter = new CsvWriter(file.getName(),'\n', Charset.forName("utf-8"));
        for (Student s:list) {
            try {
                csvWriter.write(s.getStuId().toString());
                csvWriter.write(s.getName());
                csvWriter.write(s.getPassWord().toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        csvWriter.close();
    }
}
