import java.io.File;
import java.io.FilenameFilter;

/**
 * @author WM
 * @date 2020/3/24 10:28 下午
 * 描述信息：找到指定文件夹下面的所有的满足 .java 文件
 */
public class HomeWork1 {
    public static void main(String[] args) {
        File file = new File("/Users/edz/Java/file/src");

        String [] strFile= file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.endsWith(".java")){  //满足条件的文件
                    return  true;
                }
                return false;
            }
        });

        for (String   st: strFile) {
            System.out.println(st);
        }

    }
}
