package cookice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create_cookie")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //�û�����Servlet������Ҫ�����ݷŽ�cookie
         //�û����󣬴����������ݣ�type,brand
           System.out.println("�����Եõ�");
           response.setCharacterEncoding("utf-8");
           response.setContentType("text/html;charset=utf-8");
           String string=request.getParameter("account");
           String ss=request.getParameter("password");

           //����cookie
        Cookie string1 = new Cookie("string", string);
        Cookie ss1 = new Cookie("ss", ss);

        //����cookie����ʱ(������ѹرգ�cookie�Ͳ�������)���ǳ־ô���
        string1.setMaxAge(60*60*24*30);
        ss1.setMaxAge(60*60*7);

        //��cookie�������response����
        response.addCookie(string1);
        response.addCookie(ss1);
        System.out.println("cookie�Ѿ����������͵��ͻ���");
    }
}
