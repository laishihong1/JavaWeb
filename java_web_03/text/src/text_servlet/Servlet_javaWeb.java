package text_servlet;

import java.io.IOException;

public class Servlet_javaWeb extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //�������request ��ʹ��
        //�ͻ��˷������е�������Ϣ������װ��request����
        //1.��ȡ�ͻ���ip��ַ
        String remoteAddr = request.getRemoteAddr();
        System.out.println(remoteAddr);

        //2.��ȡ����˵Ķ˿�
        int serverPort = request.getServerPort();
        System.out.println(serverPort);

         //3.��ȡ�ͻ����������Ϣ
    }
}
