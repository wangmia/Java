import java.io.*;

/**
 * @author WM
 * @date 2020/3/24 8:48 下午
 * 描述信息：创建a/test.txt文件并在其中输入"hello world",创建一个输入流读取该文件中的文本,
 * 并且把小写的l变成大写L再利用输出流写入到b/test.txt中
 */
public class P3 {
    public static void main(String[] args) {
        File file = new File("a/text.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Writer writer = null;
        try {
            writer = new FileWriter(file);
            writer.write("hello world");
            writer.flush();

            Reader reader = new FileReader(file);
            char [] c = new char[(int)file.length()];
//            for(int i=0;i<c.length;i++){
//                if(c[i]=='l'){
//                    c[i] = 'L';
//                }
//            }
            reader.read(c);
            for(int i=0;i<c.length;i++){
                if(c[i]=='l'){
                    c[i] = 'L';
                }
            }

            writer.write(" ");
            writer.flush();
            writer.write(c);
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
