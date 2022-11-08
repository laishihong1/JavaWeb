package new_text;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//response 的重定向功能
//重定向：从当前资源跳转到目标资源(网页，servlet)

@WebServlet("/Servlet03")
public class Servlet03 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("接收到请求");
        //1.重定向到本地应用其他文件
//             response.sendRedirect("text.html");
        //2.重定向到其它网站
//             response.sendRedirect("http://www.baidu.com");
//             response.sendRedirect("/text2/Servlet04");

        //重定向到本应用的其它资源，需要加应用的访问路径
        //动态获取本应用的访问路径
        String contextPath = request.getContextPath();
        response.sendRedirect(contextPath+"/Servlet04");
    }
}
