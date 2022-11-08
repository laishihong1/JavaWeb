package cookice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//读取cookie

@WebServlet("/read_cookie")
public class Servlet02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           request.setCharacterEncoding("utf-8");
           //获取客户端传送的cookie数据
           //数据是多个，以集合形式使用

        Cookie[] cookies = request.getCookies();
         //不建议使用for循环 增强for循环 iter

        for (Cookie cookie : cookies) {
            //cookie 就是cookies 集合中的每一个对象
            System.out.println(cookie.getName()+" : "+cookie.getValue());
        }

    }
}
