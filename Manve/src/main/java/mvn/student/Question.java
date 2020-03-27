package mvn.student;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.*;

/**
 * @author WM
 * @date 2020/3/26 6:09 下午
 * 描述信息：
 */
public class Question {

    public static void main(String[] args) {

        //第一步：创建一个Document实例
        Document doc = DocumentHelper.createDocument();

        // 第二步：先添加一个根结点，然后再添加子结点，构造成一个树形结构
        Element root = doc.addElement("Examination");

        //添加xml内容
        Element   oneElement=root.addElement("testPaper").addAttribute("id", "5");
        oneElement.addElement("name1").addText("1. 构造函数何时被调用");     // B
        oneElement.addElement("option1").addText("A. 类定义时");
        oneElement.addElement("option1").addText("B. 创建对象时");
        oneElement.addElement("option1").addText("C. 调用对象方法时");

        oneElement.addElement("name2").addText("2.下面哪个不是JAVA关键字");  // A
        oneElement.addElement("option2").addText("A. integer");
        oneElement.addElement("option2").addText("B. float");
        oneElement.addElement("option2").addText("C. double");

        oneElement.addElement("name3").addText("3. 下面哪个不是Thread类的方法");  // C
        oneElement.addElement("option3").addText("A. start()");
        oneElement.addElement("option3").addText("B. run()");
        oneElement.addElement("option3").addText("C. exit()");

        oneElement.addElement("name4").addText("4. 面向对象编程的三大特性是");  // A
        oneElement.addElement("option4").addText("A. 封装，继承，多态");
        oneElement.addElement("option4").addText("B. 封装，重用，继承");
        oneElement.addElement("option4").addText("C. 继承，抽象，多态");

        oneElement.addElement("name5").addText("5. 下面哪个接口直接继承自Collection接口");   // A
        oneElement.addElement("option5").addText("A. List");
        oneElement.addElement("option5").addText("B. Map");
        oneElement.addElement("option5").addText("C. Iterator");

        Element   twoElement=root.addElement("Answer").addAttribute("id", "5");
        twoElement.addElement("name1").addText("B");
        twoElement.addElement("name2").addText("A");
        twoElement.addElement("name3").addText("C");
        twoElement.addElement("name4").addText("A");
        twoElement.addElement("name5").addText("A");

        //第三步：添加xml文件样式（也可自定义样式），并输出xml文件到指定的路径下
        //OutputFormat format = OutputFormat.createPrettyPrint(); xml默认格式

        OutputFormat format = new OutputFormat(); //自定义格式
        format.setIndentSize(2);  // 行缩进
        format.setNewlines(true); // 一个结点为一行
        format.setTrimText(true); // 去重空格
        format.setPadText(true); //
        format.setNewLineAfterDeclaration(false); // 放置xml文件中第二行为空白

        File file=new File("Student.xml");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        XMLWriter writer = null;
        try {
            writer = new XMLWriter(new FileOutputStream(file), format);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.write(doc);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
