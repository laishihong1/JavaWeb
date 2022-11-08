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
        //用户请求本Servlet，将需要的数据放进cookie
         //用户请求，传递两个数据，type,brand
           System.out.println("请求以得到");
           response.setCharacterEncoding("utf-8");
           response.setContentType("text/html;charset=utf-8");
           String string=request.getParameter("account");
           String ss=request.getParameter("password");

           //创建cookie
        Cookie string1 = new Cookie("string", string);
        Cookie ss1 = new Cookie("ss", ss);

        //设置cookie是临时(浏览器已关闭，cookie就不保存了)还是持久储存
        string1.setMaxAge(60*60*24*30);
        ss1.setMaxAge(60*60*7);

        //将cookie对象加入response当中
        response.addCookie(string1);
        response.addCookie(ss1);
        System.out.println("cookie已经创建并发送到客户端");
    }
}
