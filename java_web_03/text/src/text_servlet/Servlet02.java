package text_servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//���Խ���get��post��������
//Ӣ����������
//�������ݿ��ܳ�������
//ָ������������utf-8���뷽��

@WebServlet("/getAttribute")
public class Servlet02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           //ָ��ʹ�ñ��뷽��
            request.setCharacterEncoding("utf-8");

        //��ȡ�ͻ��������������:request.getParmeter
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        System.out.println(account);
        System.out.println(password);

    }
}
