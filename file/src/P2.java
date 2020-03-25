import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author WM
 * @date 2020/3/24 8:01 下午
 * 描述信息：利用字节流或者换成字节流的方式以指定的格式输入数据 如:xxx,xxx,xxx,
 * 最后一个数据以 .号结束，一行最多五个数据
 */
public class P2 {
    public static void main(String[] args) {
        File file = new File("test/1.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("123");
        list.add("123");
        list.add("123");
        list.add("123");
        list.add("123");
        list.add("123");

        // 写
        BufferedOutputStream bufferedOutputStream = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file,true));
            for (int i = 0; i < list.size(); i++) {
                if(i!=list.size()-1){
                    bufferedOutputStream.write(list.get(i).getBytes());
                    if((i+1)%5==0){
                        bufferedOutputStream.write("\n".getBytes());
                    }else{
                        bufferedOutputStream.write(",".getBytes());
                    }
                }else{
                    bufferedOutputStream.write(list.get(i).getBytes());
                    bufferedOutputStream.write(".".getBytes());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
