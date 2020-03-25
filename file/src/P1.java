import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author WM
 * @date 2020/3/25 10:22 上午
 * 描述信息：找到指定文件及其子目录下面的所有的txt文件,并且把满足条件的文件全部读取出来写入到另一个txt文件里面去(使用地柜完成)
 */
public class P1 {
    public static List<File> list = new ArrayList<>();

    public static void main(String[] args) {
        File file = new File("/users/edz/Java");
        if(!file.exists()){
            System.out.println("文件目录不存在");
        }
        getCha(file);
        file = new File("test/x.txt");

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        for (File f:list) {
            try {
                bufferedReader = new BufferedReader(new FileReader(f));
                bufferedWriter = new BufferedWriter(new FileWriter(file ,true));
                if(!file.exists()){
                    file.createNewFile();
                }
                String str = bufferedReader.readLine();
                while(str!=null){
                    bufferedWriter.write(str+"\n");
                    str = bufferedReader.readLine();
                }
             } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    bufferedReader.close();
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void getCha(File file){
        File[] file1 = file.listFiles();
        for(File f:file1){
            if(f.isDirectory()){
                getCha(f);
            }else{
                if(f.getName().endsWith(".txt")){
                    list.add(f);
                }
            }
        }
    }
}
