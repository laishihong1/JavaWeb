package new_text;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet("/Servlet02")
public class Servlet02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //��������
            //��response �����ֽ����������ݵ��ͻ���
//        response.setContentType("text/html;charset=utf-8");
//        OutputStream outputStream=response.getOutputStream();
//        String string="��Ϣ�յ���";
//        outputStream.write(string.getBytes("utf-8"));

        response.getOutputStream().write("��Ϣ�յ���".getBytes("utf-8"));


    }
}
