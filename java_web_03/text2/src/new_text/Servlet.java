package new_text;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//response �����������
//ʹ���ַ�����������


@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setCharacterEncoding("utf-8");
        System.out.println("����....");
//
          response.setContentType("text/html;charset=utf-8");
//          PrintWriter printWriter=response.getWriter();
//          String s="��Ϣ�Ѿ��յ�";
//          printWriter.write(s);

         response.getWriter().write("<h1>��Ϣ�Ѿ��յ�</h1>");




    }
}
