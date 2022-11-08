package cookice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//��ȡcookie

@WebServlet("/read_cookie")
public class Servlet02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           request.setCharacterEncoding("utf-8");
           //��ȡ�ͻ��˴��͵�cookie����
           //�����Ƕ�����Լ�����ʽʹ��

        Cookie[] cookies = request.getCookies();
         //������ʹ��forѭ�� ��ǿforѭ�� iter

        for (Cookie cookie : cookies) {
            //cookie ����cookies �����е�ÿһ������
            System.out.println(cookie.getName()+" : "+cookie.getValue());
        }

    }
}
