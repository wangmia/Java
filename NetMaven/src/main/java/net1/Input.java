package net1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author WM
 * @date 2020/4/2 8:08 上午
 * 描述信息：Socket写一个聊天群
 */
public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OutputStream os=null;
        InputStream is=null;
        byte[] bytes=null;
        int len=0;

        Socket socket = null;
        try {
            socket = new Socket(InetAddress.getLocalHost().getHostAddress(), 3333);
        } catch (IOException e) {
            e.printStackTrace();
        }

        while(true) {
            try {
                String str="";
                String  st="";
                if(socket.isOutputShutdown()){//判断流是否关闭
                //如果关闭新创建一个socket对象
                socket = new Socket(InetAddress.getLocalHost().getHostAddress(), 1234);
                os = socket.getOutputStream();  //重新得到了写入流
                System.out.println("+++++++++++++请输入数据...");
                str = scanner.nextLine();
                os.write(str.getBytes());
                socket.shutdownOutput();  //结束输入流 就以为从socket获取的写入流就已经失效了
                }else{
                      os = socket.getOutputStream();
                      System.out.println(">>>>>请输入数据...");
                      str = scanner.nextLine();
                      os.write(str.getBytes());
                      os.flush();
                      socket.shutdownOutput();
                }

                //读取服务器端的反馈....
                is = socket.getInputStream();
                bytes = new byte[1024];
                len = is.read(bytes);
                st = new String(bytes, 0, len);
                System.out.println("---" + st);

              } catch (IOException e) {
                e.printStackTrace();
              }
        }
    }
}
