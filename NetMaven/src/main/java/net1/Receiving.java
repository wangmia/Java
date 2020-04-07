package net1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author WM
 * @date 2020/4/2 8:04 上午
 * 描述信息：
 *
 * InetAddress.getLocalHost().getHostAddress()    本机地址
 * InetAddress.getLocalHost()。getHostName()     本机名字
 *
 *
 *
 */
public class Receiving {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket s = null;
        InputStream is=null;
        OutputStream os=null;

        try {
            serverSocket = new ServerSocket(3333);
        } catch (IOException e) {
            e.printStackTrace();
        }

        while(true){

            try {
                s = serverSocket.accept();
                is = s.getInputStream();
                os = s.getOutputStream();

                byte[] bytes = new byte[1024];
                int len = is.read(bytes);
                String str = new String(bytes, 0, len);

                s.shutdownInput();
                //在接受中断读取流,没有太大影响,为什么？ 因为每次都会去重新创建一个Socket对象
                //反馈给客户端的信息
                System.out.println("接收到数据为:" + str);
                os.write("服务器端接收到了...".getBytes());
                os.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

