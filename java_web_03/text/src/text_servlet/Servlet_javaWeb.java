package text_servlet;

import java.io.IOException;

public class Servlet_javaWeb extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //请求对象request 的使用
        //客户端发送所有的请求信息，都封装在request对象
        //1.获取客户端ip地址
        String remoteAddr = request.getRemoteAddr();
        System.out.println(remoteAddr);

        //2.获取服务端的端口
        int serverPort = request.getServerPort();
        System.out.println(serverPort);

         //3.获取客户端浏览器信息
    }
}
