package text_servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/setAttribute")
public class Servlet03 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                     //ȡ����,ÿ�����󶼻ᴴ��ר�е�request����
              String s =  (String) request.getAttribute("account");
              String password =(String) request.getAttribute("password");
              System.out.println(s);
              System.out.println(password);


              //����ת��
             //��ȡ����ת����
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/getAttribute");
        //ת��
        //ϵͳ�Ὣ����ת��ָ����servlet
        requestDispatcher.forward(request,response);


    }
}
